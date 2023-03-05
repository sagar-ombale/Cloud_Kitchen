package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.met.cloud.model.Customer_Info;

@Repository
public class Customer_InfoDAO {
	
	@Autowired
	private DataSource dataSource;
	
	public void save(Customer_Info cutinfo) {
		saveUsingDataSource(cutinfo);
	}
	
	private void saveUsingDataSource(Customer_Info custinfo) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " customer_info values(?, ?, ?, ?, ?, ?, ?, ?)");
				){
			
			pstmt.setInt(1, custinfo.getCustomer_id());
			pstmt.setString(2, custinfo.getCustomer_name());
			pstmt.setString(3, custinfo.getCustomer_email());
			pstmt.setString(4, custinfo.getCustomer_mobno());
			pstmt.setString(5, custinfo.getCustomer_user_name());
			pstmt.setString(6, custinfo.getCustomer_address());
			pstmt.setString(7, custinfo.getCustomer_pincode());
			pstmt.setString(8, custinfo.getCustomer_city());
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
