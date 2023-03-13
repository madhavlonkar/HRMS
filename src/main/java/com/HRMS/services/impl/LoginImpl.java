package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.LoginDAO;
import com.HRMS.model.LoginMaster;
import com.HRMS.services.LoginService;
import com.HRMS.utility.Encryption_Decryption;

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

		LoginMaster log=logindao.findByusername(login.getUsername());
		
		Encryption_Decryption e =new Encryption_Decryption();
		
		String EncryptedPassword=e.encrypt(login.getPassword(), "Maddy");
		
		
		
		if(login.getUsername().equals(log.getUsername()))
		{
			if(EncryptedPassword.equals(log.getPassword()))
			{
				if(log.getRole().equals("Admin"))
				{
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
		
		Encryption_Decryption e=new Encryption_Decryption();
		String EncryptString=e.encrypt(login.getPassword(), "Maddy");
		login.setPassword(EncryptString);
		
		LoginMaster loginMaster = this.logindao.save(login);
		return loginMaster;
		
	}





	

}
