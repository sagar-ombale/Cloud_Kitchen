package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.met.cloud.model.Cart_Table;

@Repository
public class Cart_TableDAO {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void save(Cart_Table carttbl) {
		saveUsingDataSource(carttbl);
		saveUsingJDBCTemplate(carttbl);
	}
	
	private void saveUsingDataSource(Cart_Table carttbl) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " cart_table values(?, ?, ?)");
				){
			
			pstmt.setInt(1, carttbl.getCat_Id());
			pstmt.setString(2, carttbl.getName());
			pstmt.setString(3, carttbl.getImageAddress());
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void saveUsingJDBCTemplate(Cart_Table cart_Table) {
		
		jdbcTemplate.update("insert into cart_table values(?, ?, ?)", 
					new Object[] {cart_Table.getCat_Id(), cart_Table.getName(), cart_Table.getImageAddress()} );
	}
	
	
	@SuppressWarnings("deprecation")
	public Cart_Table getCart(int id) {
		
		return jdbcTemplate.queryForObject("select * from cart_table where cart_id=?", 
				new Object[] {id}, new BeanPropertyRowMapper<>(Cart_Table.class));
		
	}
	
		
		class Cart_TableMapper implements RowMapper<Cart_Table>{

			@Override
			public Cart_Table mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				
				Cart_Table cart_Table = new Cart_Table();
				cart_Table.setCat_Id(rs.getInt("cart_id"));
				cart_Table.setName(rs.getString("customer_id"));
				cart_Table.setImageAddress(rs.getString("cart_status"));
				
				return cart_Table;
			}
		}
}
