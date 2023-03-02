package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.met.cloud.model.Delivery_Personnel_Info;

public class Delivery_Personnel_InfoDAO {

private DataSource dataSource;
	
	public void save(Delivery_Personnel_Info delinfo) {
		saveUsingDataSource(delinfo);
	}
	
	private void saveUsingDataSource(Delivery_Personnel_Info delinfo) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ "delivery_personnel_info values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
				){
			
			pstmt.setInt(1, delinfo.getPersonnel_id());
			pstmt.setString(2, delinfo.getDelivery_person_name());
			pstmt.setString(3, delinfo.getDelivery_person_email());
			pstmt.setString(4, delinfo.getDelivery_mobileno());
			pstmt.setString(5, delinfo.getDelivery_username());
			pstmt.setString(6, delinfo.getDelivery_address());
			pstmt.setString(7, delinfo.getDelivery_city());
			pstmt.setBlob(8, delinfo.getDelivery_image());
			pstmt.setString(9, delinfo.getDelivery_aadharcard());
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
