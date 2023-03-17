package com.HRMS.services.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.OtpLoginDAO;
import com.HRMS.model.OtpLoginMaster;
import com.HRMS.services.OtpLoginService;

@Service
public class OtpLoginImpl implements OtpLoginService {

	@Autowired
	private OtpLoginDAO otpLoginDAO;
	
	@Override
	public OtpLoginMaster saveotp(OtpLoginMaster otplogin) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		otplogin.setTs(timestamp);
		
		OtpLoginMaster OtpSaved = this.otpLoginDAO.save(otplogin);
		
		return OtpSaved;
	}

	

}
