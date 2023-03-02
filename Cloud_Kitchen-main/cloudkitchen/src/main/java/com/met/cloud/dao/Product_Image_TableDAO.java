package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.met.cloud.model.Product_Image;

public class Product_Image_TableDAO {
	
	private DataSource dataSource;
	
	public void save(Product_Image primg) {
		saveUsingDataSource(primg);
	}
	
	private void saveUsingDataSource(Product_Image primg) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " product_image values(?, ?, ?)");
				){
			
			pstmt.setInt(1, primg.getProduct_image_id());
			pstmt.setInt(2, primg.getProduct_id());
			pstmt.setBlob(3, primg.getProduct_image_image());
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
