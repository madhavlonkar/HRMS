package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.LoginDAO;
import com.HRMS.model.LoginMaster;
import com.HRMS.services.LoginService;
import com.HRMS.utility.CeaserCipher_Encryption;
import com.HRMS.utility.Encryption_Decryption;
import com.HRMS.utility.OTPGENERATE_AND_MAIL;

@Service
public class LoginImpl implements LoginService {

	Logger loger = LoggerFactory.getLogger(LoginImpl.class);
	
	
	@Autowired
	private LoginDAO logindao;
	
	@Override
	public List<LoginMaster> getalllogins() {
		List<LoginMaster> findAll =(List<LoginMaster>) this.logindao.findAll();
		return findAll;
	}

	


	@Override
	public LoginMaster logincheck(LoginMaster login) {

		int num=(int)(10000*Math.random());
		OTPGENERATE_AND_MAIL mail=new OTPGENERATE_AND_MAIL();
		
		LoginMaster log=logindao.findByusername(login.getUsername());
		
//		Encryption_Decryption e =new Encryption_Decryption();
		CeaserCipher_Encryption c=new CeaserCipher_Encryption();
		
		String EncryptedPassword=c.encrypt(login.getPassword());
		
		
		
		if(login.getUsername().equals(log.getUsername()))
		{
			
			if(EncryptedPassword.equals(log.getPassword()))
			{
				
				if(log.getRole().equals("Admin"))
				{
					//mail.sendEmail(num);
					loger.info("Worked");
					return log;
				}
				else if(log.getRole().equals("Employee"))
				{
					//mail.sendEmail(num);
					loger.info("Worked");
					return log;
				}
				else if(log.getRole().equals("HR"))
				{
					//mail.sendEmail(num);
					loger.info("Worked");
					return log;
				}
			}
		}
		
		
		
		
//		String Username=login.getUsername();
//		String Password=login.getPassword();
//		String Role=login.getRole();
//		
//		List<LoginMaster> log=logindao.findByusername(Username);
//		//int userid=login.getUserid();
//		
//		if(Username.equals(logindao.findByusername(Username)))
//		{
//			if(Password.equals()
//			{
//				
//			}
//		}
//		
		
		return null;
	}




	@Override
	public LoginMaster addlogin(LoginMaster login) {
		
		CeaserCipher_Encryption c=new CeaserCipher_Encryption();
		
//		Encryption_Decryption e=new Encryption_Decryption();
		String EncryptString=c.encrypt(login.getPassword());
		login.setPassword(EncryptString);
		
		LoginMaster loginMaster = this.logindao.save(login);
		return loginMaster;
		
	}





	

}
