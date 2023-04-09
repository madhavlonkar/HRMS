package com.HRMS.controller;

import java.util.List;
import java.util.Optional;


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

import com.HRMS.model.AllowanceMaster;
import com.HRMS.services.AllowanceService;

@RestController
public class AllowanceController {


	
	@Autowired
	private AllowanceService allowanceservice;
	
	@GetMapping("/allowance")
	public ResponseEntity<List<AllowanceMaster>> getAllowanceController()
	{
		List<AllowanceMaster> allallowance = allowanceservice.getAllAllowanceService();
		if(allallowance.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		return ResponseEntity.of(Optional.of(allallowance));
	}
	
	
	@GetMapping("/allowance/{allowanceid}")
	public ResponseEntity<AllowanceMaster> getAllowance(@PathVariable("allowanceid") int allowanceid)
	{
		AllowanceMaster allowanceById = allowanceservice.getAllowanceById(allowanceid);
		if(allowanceById==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(allowanceById);
		
	}
	
	@PostMapping("/allowance")
	public ResponseEntity<AllowanceMaster> addAllowance(@RequestBody AllowanceMaster Allowance)
	{
		AllowanceMaster addAllowance=null; 
		
		try
		{
		addAllowance=this.allowanceservice.addAllowance(Allowance);
		return ResponseEntity.ok().body(addAllowance);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("allowance/{allowanceid}")
	public ResponseEntity<AllowanceMaster> updateallowance(@RequestBody AllowanceMaster allowance,@PathVariable int allowanceid)
	{
		AllowanceMaster allowance1=null;
			
		
		AllowanceMaster allowanceById = allowanceservice.getAllowanceById(allowanceid);
		if(allowanceById==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			allowance1=allowanceservice.updateallowance(allowance,allowanceid);
			return ResponseEntity.ok().body(allowance1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	@DeleteMapping("/allowance/{allowanceid}")
	public ResponseEntity<Void> deleteallowance(@PathVariable("allowanceid") int allowanceid)
	{
		AllowanceMaster allowanceById = allowanceservice.getAllowanceById(allowanceid);
		
		if(allowanceById==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			this.allowanceservice.deleteallowance(allowanceid);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
			
			
		
		
	}

}
