package com.HRMS.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.HRMS.model.EmployeeAllowance;

public interface EmployeeAllowanceDAO extends CrudRepository<EmployeeAllowance, Integer>{

	public List<EmployeeAllowance> findByEmployeeId(int empid);
	
	
}
