package com.met.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.met.project.pojo.CustomerInfo;

public interface CustomerInfoDAO extends JpaRepository<CustomerInfo,Integer>{

	CustomerInfo findByEmailId(@Param("customerEmail") String customerEmail);
}
