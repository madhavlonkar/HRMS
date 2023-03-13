package com.HRMS.services.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.controller.EmployeeAllowanceController;
import com.HRMS.dao.EmployeeAllowanceDAO;
import com.HRMS.model.EmployeeAllowance;
import com.HRMS.services.EmployeeAllowanceService;

@Service
public class EmployeeAllowanceImpl implements EmployeeAllowanceService {

	static Logger logger = LogManager.getLogger(EmployeeAllowanceController.class);

	@Autowired
	private EmployeeAllowanceDAO EADAO;

	public List<EmployeeAllowance> EmployeeAllAllowance(int empid) {
		try {

			List<EmployeeAllowance> findByEmpid_empid = EADAO.findByEmployeeId(empid);
			return findByEmpid_empid;

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return null;
		}

	}

	@Override
	public EmployeeAllowance assignallowance(EmployeeAllowance empallowance) {
		try {
			EmployeeAllowance employeeAllowance = this.EADAO.save(empallowance);
			return employeeAllowance;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return null;
		}

	}

	@Override
	public EmployeeAllowance updateallowance(int empid, EmployeeAllowance empallowance, int allowance_id) {
		try {
			empallowance.setEmployeeId(empid);
			empallowance.setAllowanceId(allowance_id);
			EmployeeAllowance employeeAllowance = this.EADAO.save(empallowance);
			return employeeAllowance;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return null;
		}

	}

	@Override
	public void deleteallowance(EmployeeAllowance empallowance) {
		try {
			this.EADAO.delete(empallowance);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}

	}

}
