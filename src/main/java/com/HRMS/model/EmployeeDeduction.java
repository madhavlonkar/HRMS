package com.HRMS.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;


class EmployeeDeductionId{
	private int empid;
	private int deduction_id;
	public int getEmpid() {
		return empid;
	}
	public int getDeduction_id() {
		return deduction_id;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setDeduction_id(int deduction_id) {
		this.deduction_id = deduction_id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(deduction_id, empid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDeductionId other = (EmployeeDeductionId) obj;
		return deduction_id == other.deduction_id && empid == other.empid;
	}
	@Override
	public String toString() {
		return "EmployeeDeductionId [empid=" + empid + ", deduction_id=" + deduction_id + "]";
	}
	public EmployeeDeductionId(int empid, int deduction_id) {
		super();
		this.empid = empid;
		this.deduction_id = deduction_id;
	}
	public EmployeeDeductionId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

@Entity
@Table(name="Employee_Deduction_Master")
@IdClass(EmployeeDeductionId.class)
public class EmployeeDeduction {
	
	@Id
	@Column(name="deduction_id")
	private int deduction_id;
	
	@Id
	@Column(name="emp_id")
	private int empid;

	@Column(name="deduction_name")
	private String deduction_name;
	
	@Column(name="deduction_amount")
	private String deduction_amount;

	public int getDeduction_id() {
		return deduction_id;
	}

	public int getEmpid() {
		return empid;
	}

	public String getDeduction_name() {
		return deduction_name;
	}

	public String getDeduction_amount() {
		return deduction_amount;
	}

	public void setDeduction_id(int deduction_id) {
		this.deduction_id = deduction_id;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setDeduction_name(String deduction_name) {
		this.deduction_name = deduction_name;
	}

	public void setDeduction_amount(String deduction_amount) {
		this.deduction_amount = deduction_amount;
	}

	@Override
	public String toString() {
		return "EmployeeDeduction [deduction_id=" + deduction_id + ", empid=" + empid + ", deduction_name="
				+ deduction_name + ", deduction_amount=" + deduction_amount + "]";
	}

	public EmployeeDeduction(int deduction_id, int empid, String deduction_name, String deduction_amount) {
		super();
		this.deduction_id = deduction_id;
		this.empid = empid;
		this.deduction_name = deduction_name;
		this.deduction_amount = deduction_amount;
	}

	public EmployeeDeduction() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	
	
	
	
	

}
