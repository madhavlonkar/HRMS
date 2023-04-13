package com.HRMS.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
class EmployeeAllowanceId implements Serializable {
    private int employeeId;
    private int allowanceId;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getAllowanceId() {
		return allowanceId;
	}
	public void setAllowanceId(int allowanceId) {
		this.allowanceId = allowanceId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(allowanceId, employeeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeAllowanceId other = (EmployeeAllowanceId) obj;
		return Objects.equals(allowanceId, other.allowanceId) && Objects.equals(employeeId, other.employeeId);
	}
	
	

    
    // constructors, getters, and setters
    // make sure to implement equals() and hashCode() methods as well
}

@Entity
@Table(name="employee_allowance_master")
@IdClass(EmployeeAllowanceId.class)
public class EmployeeAllowance {
	

//@OneToOne(cascade = CascadeType.ALL)
	@Id
    private int employeeId;

    @Id
    private int allowanceId;
	
	@Column(name="allowance_name")
	private String allowance_name;
	
	@Column(name="allowance_amount")
	private int allowance_amount;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getAllowanceId() {
		return allowanceId;
	}

	public void setAllowanceId(int allowanceId) {
		this.allowanceId = allowanceId;
	}

	public String getAllowance_name() {
		return allowance_name;
	}

	public void setAllowance_name(String allowance_name) {
		this.allowance_name = allowance_name;
	}

	public int getAllowance_amount() {
		return allowance_amount;
	}

	public void setAllowance_amount(int allowance_amount) {
		this.allowance_amount = allowance_amount;
	}

	
	
	
	

}
