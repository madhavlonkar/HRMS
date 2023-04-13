package com.HRMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.services.DemandService;
import com.HRMS.model.DemandMaster;

@RestController
public class DemandController {
	
	
	@Autowired
	private DemandService demandservice;
	
	@GetMapping("/demand")
	public List<DemandMaster> getDemand()
	{
		List<DemandMaster> demand = this.demandservice.getDemand();
		return demand;
	}
	
	@GetMapping("/demand/{id}")
	public Optional<DemandMaster> getDemandbyid(@PathVariable("id") int id)
	{
		
		Optional<DemandMaster> demandbyid = this.demandservice.getDemandbyid(id);
		return demandbyid;
	}
	
	@PostMapping("/demand")
	public DemandMaster addDemand(@RequestBody DemandMaster demandMaster)
	{
		DemandMaster addDemand = this.demandservice.addDemand(demandMaster);
		return addDemand;
	}
	
	@PutMapping("/demand/{id}")
	public DemandMaster updateDemand(@RequestBody DemandMaster demandMaster,@PathVariable("id") int id)
	{
		DemandMaster updateDemand = this.demandservice.updateDemand(demandMaster,id);
		return updateDemand;
	}
	
	@DeleteMapping("/demand/{id}")
	public void deleteDemand(@PathVariable("id") int id)
	{
		this.demandservice.deleteDemand(id);
	}
}
