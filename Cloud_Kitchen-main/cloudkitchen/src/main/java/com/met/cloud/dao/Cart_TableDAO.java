package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.met.cloud.model.Cart_Table;

public class Cart_TableDAO {
	
	private DataSource dataSource;
	
	public void save(Cart_Table carttbl) {
		saveUsingDataSource(carttbl);
	}
	
	private void saveUsingDataSource(Cart_Table carttbl) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " cart_table values(?, ?, ?)");
				){
			
			pstmt.setInt(1, carttbl.getCart_id());
			pstmt.setInt(2, carttbl.getCustomer_id());
			pstmt.setBoolean(3, carttbl.isCart_status());
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
