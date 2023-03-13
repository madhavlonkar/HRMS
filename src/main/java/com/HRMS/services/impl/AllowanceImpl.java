package com.HRMS.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.HRMS.dao.AllowanceDAO;
import com.HRMS.model.AllowanceMaster;
import com.HRMS.services.AllowanceService;

@Component
public class AllowanceImpl implements AllowanceService {

	
//	Logger loger = LoggerFactory.getLogger(LoginImpl.class);
	
	@Autowired
	private AllowanceDAO allowancedao;

	public List<AllowanceMaster> getAllAllowanceService() {
		List<AllowanceMaster> findAll = null;
		try {
			findAll = (List<AllowanceMaster>) allowancedao.findAll();
			return findAll;
		} catch (Exception e) {
			e.printStackTrace();
			return findAll;
		}

	}

	public AllowanceMaster getAllowanceById(int allowanceid) {
		AllowanceMaster findById = null;
		try {
			
			findById = allowancedao.findById(allowanceid);
			return findById;

		} catch (Exception e) {
			
			e.printStackTrace();
			return findById;
		}

	}

	public AllowanceMaster addAllowance(AllowanceMaster allowance) {
		AllowanceMaster allowancesaved=null;
		try {
			allowancesaved= allowancedao.save(allowance);
			return allowancesaved;
			
		} catch (Exception e) {
			e.printStackTrace();
			return allowancesaved;
		}
		
	}

	@Override
	public AllowanceMaster updateallowance(AllowanceMaster allowance, int allowanceid) {

		AllowanceMaster updatedallowance=null;
		try
		{
			allowance.setAllowance_id(allowanceid);
			updatedallowance = allowancedao.save(allowance);
			return updatedallowance;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return updatedallowance;
		}
		
		
	}

	@Override
	public void deleteallowance(int allowanceid) {
		try
		{
			allowancedao.deleteById(allowanceid);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
