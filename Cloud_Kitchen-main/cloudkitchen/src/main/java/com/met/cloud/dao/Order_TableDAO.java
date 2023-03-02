package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.met.cloud.model.Order_Table;

public class Order_TableDAO {

private DataSource dataSource;
	
	public void save(Order_Table ordtbl) {
		saveUsingDataSource(ordtbl);
	}
	
	private void saveUsingDataSource(Order_Table ordtbl) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " order_table values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				){
			
			pstmt.setInt(1, ordtbl.getOrder_id());
			pstmt.setDate(2, ordtbl.getOrderdate());
			pstmt.setString(3, ordtbl.getOrder_description());
			pstmt.setDouble(4, ordtbl.getOrder_total_cost());
			pstmt.setInt(5, ordtbl.getCustomer_id());
			pstmt.setInt(6, ordtbl.getProduct_id());
			pstmt.setInt(7, ordtbl.getOrder_quantity());
			pstmt.setBoolean(8, ordtbl.isOrder_status());
			pstmt.setString(9, ordtbl.getOrder_paymentby());
			pstmt.setString(10, ordtbl.getOrder_shipping_address());
			pstmt.setString(11, ordtbl.getOrder_city());
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
