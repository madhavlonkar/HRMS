package com.HRMS.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.EmployeeAllowance;
import com.HRMS.services.EmployeeAllowanceService;

@RestController
public class EmployeeAllowanceController {

	static Logger logger = LogManager.getLogger(EmployeeAllowanceController.class);
	
	@Autowired
	private EmployeeAllowanceService EAService;
	
	@GetMapping("/employeeallowance/{empid}")
	public ResponseEntity<List<EmployeeAllowance>> EmployeeAllAllowance(@PathVariable("empid") int empid)
	{
		List<EmployeeAllowance> employeeAllAllowance = this.EAService.EmployeeAllAllowance(empid);
		if(employeeAllAllowance.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(employeeAllAllowance);
	}
	
	@PostMapping("/employeeallowance")
	public ResponseEntity<EmployeeAllowance> assignallowance(@RequestBody EmployeeAllowance empallowance)
	{
		EmployeeAllowance assignallowance = this.EAService.assignallowance(empallowance);
		if(assignallowance==null)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(assignallowance);
	}
	
	@PutMapping("/employeeallowance/{empid}")
	public ResponseEntity<EmployeeAllowance> updateallowance(@PathVariable("empid") int empid,@RequestBody EmployeeAllowance empallowance)
	{
		List<EmployeeAllowance> employeeAllAllowance = this.EAService.EmployeeAllAllowance(empid);
		if(employeeAllAllowance.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			int allowance_id=empallowance.getAllowanceId();
			EmployeeAllowance updateallowance = this.EAService.updateallowance(empid,empallowance,allowance_id);
			return ResponseEntity.status(HttpStatus.OK).body(updateallowance);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error(e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	@DeleteMapping("/employeeallowance")
	public ResponseEntity<Void> deleteallowance(@RequestBody EmployeeAllowance empallowance)
	{
		int empid=empallowance.getEmployeeId();
		List<EmployeeAllowance> employeeAllAllowance = this.EAService.EmployeeAllAllowance(empid);
		if(employeeAllAllowance.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		try {
			
			this.EAService.deleteallowance(empallowance);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
