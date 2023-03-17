package com.HRMS.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OtpLoginMaster {

	@Id
	@GeneratedValue
	private int id;
	
	private String Username;
	
	private int pin;
	
	@CreationTimestamp
	private LocalDateTime ts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public LocalDateTime getTs() {
		return ts;
	}

	public void setTs(LocalDateTime ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "OtpLoginMaster [id=" + id + ", Username=" + Username + ", pin=" + pin + ", ts=" + ts + "]";
	}

	public OtpLoginMaster(int id, String username, int pin, LocalDateTime ts) {
		super();
		this.id = id;
		Username = username;
		this.pin = pin;
		this.ts = ts;
	}

	public OtpLoginMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
