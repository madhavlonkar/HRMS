package com.HRMS.services;

import com.HRMS.model.OtpLoginMaster;

public interface OtpLoginService {

	boolean saveotp(String username, int otp);
	String checkotp(OtpLoginMaster otpmaster);

	
}
