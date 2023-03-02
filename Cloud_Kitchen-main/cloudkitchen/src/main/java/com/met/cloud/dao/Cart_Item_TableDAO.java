package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.met.cloud.model.Cart_Item_Table;

public class Cart_Item_TableDAO {
	
	private DataSource dataSource;
	
	public void save(Cart_Item_Table cartitmtbl) {
		saveUsingDataSource(cartitmtbl);
	}
	
	private void saveUsingDataSource(Cart_Item_Table cartitmtbl) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " cart_item_table values(?, ?, ?)");
				){
			
			pstmt.setInt(1, cartitmtbl.getCart_item_id());
			pstmt.setInt(2, cartitmtbl.getCart_id());
			pstmt.setInt(3, cartitmtbl.getProduct_id());
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
