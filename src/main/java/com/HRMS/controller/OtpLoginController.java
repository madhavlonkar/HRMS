package com.HRMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.OtpLoginMaster;
import com.HRMS.services.OtpLoginService;

@RestController
public class OtpLoginController {

	@Autowired
	private OtpLoginService otpLoginService;
	
	
	@PostMapping("/otplogin")
	public OtpLoginMaster saveotp(@RequestBody OtpLoginMaster otplogin)
	{
		OtpLoginMaster saveotp = this.otpLoginService.saveotp(otplogin);
		return saveotp;
		
	}

}
