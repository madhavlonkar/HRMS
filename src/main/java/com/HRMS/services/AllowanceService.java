package com.HRMS.services;

import java.util.List;

import com.HRMS.model.AllowanceMaster;

public interface AllowanceService {

	List<AllowanceMaster> getAllAllowanceService();
	AllowanceMaster getAllowanceById(int allowanceid);
	AllowanceMaster addAllowance(AllowanceMaster allowance);
	AllowanceMaster updateallowance(AllowanceMaster allowance, int allowanceid);
	void deleteallowance(int allowanceid);
	
	
	
}
