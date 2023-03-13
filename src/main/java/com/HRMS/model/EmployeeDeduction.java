package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Deduction_Master")
public class EmployeeDeduction {
	
	@Id
	@Column(name="allowance_id")
	private int allowance_id;
	
	@Id
	@Column(name="empid")
	private int empid;
	
	@Column(name="deduction_name")
	private String deduction_name;
	
	@Column(name="deduction_amount")
	private String deduction_amount;

	public int getAllowance_id() {
		return allowance_id;
	}

	public void setAllowance_id(int allowance_id) {
		this.allowance_id = allowance_id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDeduction_name() {
		return deduction_name;
	}

	public void setDeduction_name(String deduction_name) {
		this.deduction_name = deduction_name;
	}

	public String getDeduction_amount() {
		return deduction_amount;
	}

	public void setDeduction_amount(String deduction_amount) {
		this.deduction_amount = deduction_amount;
	}

	public EmployeeDeduction(int allowance_id, int empid, String deduction_name, String deduction_amount) {
		super();
		this.allowance_id = allowance_id;
		this.empid = empid;
		this.deduction_name = deduction_name;
		this.deduction_amount = deduction_amount;
	}

	public EmployeeDeduction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeDeduction [allowance_id=" + allowance_id + ", empid=" + empid + ", deduction_name="
				+ deduction_name + ", deduction_amount=" + deduction_amount + "]";
	}
	
	
	

}
