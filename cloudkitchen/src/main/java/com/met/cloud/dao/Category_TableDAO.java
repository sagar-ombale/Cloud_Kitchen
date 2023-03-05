package com.met.cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.met.cloud.model.Category_Table;

@Repository
public class Category_TableDAO {
	
	@Autowired
	private DataSource dataSource;
	
	public void save(Category_Table cattbl) {
		saveUsingDataSource(cattbl);
	}
	
	private void saveUsingDataSource(Category_Table cattbl) {
		try(Connection con= dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into "
						+ " category_table values(?, ?, ?)");
				){
			
			pstmt.setInt(1, cattbl.getCategory_id());
			pstmt.setString(2, cattbl.getCategory_name());
			pstmt.setBlob(3, cattbl.getCategory_image());
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
