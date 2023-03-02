package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.met.cloud.model.Product_Info;

public class Product_InfoDAO {
private DataSource dataSource;
	
	public void save(Product_Info prodinfo) {
		saveUsingDataSource(prodinfo);
	}
	
	private void saveUsingDataSource(Product_Info prodinfo) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " product_info values(?, ?, ?, ?, ?, ?, ?)");
				){
			
			pstmt.setInt(1, prodinfo.getProduct_id());
			pstmt.setString(2, prodinfo.getProduct_name());
			pstmt.setString(3, prodinfo.getProduct_description());
			pstmt.setInt(4, prodinfo.getProduct_quantity());
			pstmt.setDouble(5, prodinfo.getProduct_price());
			pstmt.setFloat(6, prodinfo.getProduct_discount());
			pstmt.setInt(7, prodinfo.getCategory_id());
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
