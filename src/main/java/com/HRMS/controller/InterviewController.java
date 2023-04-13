package com.HRMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.InterviewMaster;
import com.HRMS.services.InterviewService;

@RestController
public class InterviewController {
	
	@Autowired
	private InterviewService interviewService;
	
	@GetMapping("/interview")
	public void getallinterview()
	{
		this.interviewService.getallinterview();
		
	}
	
	@GetMapping("/interview/{id}")
	public void getinterview(@PathVariable("id") int id)
	{
		this.interviewService.getinterview(id);
	}
	
	@PostMapping("/interview")
	public void addinterview(@RequestBody InterviewMaster interviewMaster)
	{
		this.interviewService.addinterview(interviewMaster);
	}
	
	@PutMapping("/interview/{id}")
	public void updateinterview(@RequestBody InterviewMaster interviewMaster,@PathVariable("id") int id)
	{
		this.interviewService.updateinterview(interviewMaster,id);
	}
	
	@DeleteMapping("/interview/{id}")
	public void deleteinterview(@PathVariable("id") int id)
	{
		this.interviewService.deleteinterview(id);
	}
	
	
}
