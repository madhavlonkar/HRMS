package com.HRMS.services;

import java.util.List;

import com.HRMS.model.EmployeeAllowance;

public interface EmployeeAllowanceService {

	List<EmployeeAllowance> EmployeeAllAllowance(int empid);

	EmployeeAllowance assignallowance(EmployeeAllowance empallowance);

	EmployeeAllowance updateallowance(int empid, EmployeeAllowance empallowance, int allowance_id);

	void deleteallowance(EmployeeAllowance empallowance);

}
