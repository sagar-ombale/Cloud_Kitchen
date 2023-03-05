package com.met.cloud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.met.cloud.model.Cart_Item_Table;

@Repository
public class Cart_Item_TableDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(Cart_Item_Table cartitmtbl) {
		
		saveUsingJDBCTemplate(cartitmtbl);
		System.out.println("Saving cart Item " + cartitmtbl);
	}
	
	private void saveUsingJDBCTemplate(Cart_Item_Table cartitmtbl) {
			
		jdbcTemplate.update("insert into cart_item_table (cart_item_id,cart_id,name,price,description,image_address) values(?, ?, ?, ?, ?, ?)", 
				new Object[] {cartitmtbl.getCart_Item_Id(), cartitmtbl.getCart_Id(), cartitmtbl.getName(),cartitmtbl.getPrice(), cartitmtbl.getDescription(),cartitmtbl.getImageAddress()});
	}
		
	@SuppressWarnings("deprecation")
	public Cart_Item_Table getCartItem(int id) {
			
		return jdbcTemplate.queryForObject("select * from cart_item_table where cart_item_id=?", 
					new Object[] {id}, new BeanPropertyRowMapper<>(Cart_Item_Table.class));		
	}
		
	public  Collection<Cart_Item_Table> getAllCartItem(){
		
			return jdbcTemplate.query("select * from cart_item_table", 		
						new BeanPropertyRowMapper<Cart_Item_Table>(Cart_Item_Table.class)
					);	
	}
	
	
			
	class Cart_Item_TableMapper implements RowMapper<Cart_Item_Table>{

		@Override
		public Cart_Item_Table mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
				
			Cart_Item_Table cart_Item_Table = new Cart_Item_Table();
			cart_Item_Table.setCart_Item_Id(rs.getInt("cart_item_id"));
			cart_Item_Table.setCart_Id(rs.getInt("cart_id"));
			cart_Item_Table.setName(rs.getString("name"));
			cart_Item_Table.setPrice(rs.getInt("price"));
			cart_Item_Table.setDescription(rs.getString("discription"));
			cart_Item_Table.setImageAddress(rs.getString("imageaddress"));
				
			return cart_Item_Table;
		}
	}
}
