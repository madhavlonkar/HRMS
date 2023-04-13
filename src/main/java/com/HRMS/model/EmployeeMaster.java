package com.HRMS.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Master")
public class EmployeeMaster {
	
	@Id
	@Column(name="empid")
	private int empid;
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="empaddress")
	private String empaddress;
	
	@Column(name="empstate")
	private String empstate;
	
	@Column(name="empemail")
	private String empemail;
	
	@Column(name="empmobileno")
	private String empmobileno;
	
	@Column(name="empgender")
	private String empgender;
	
	@Column(name="emppan")
	private String emppan;
	
	@Column(name="empDOJ")
	private Date empDOJ;
	
	@Column(name="empdepartment")
	private String empdepartment;
	
	@Column(name="empdesignation")
	private String empdesignation;
	
	@Column(name="empbankaccno")
	private String empbankaccno;
	
	@Column(name="empbankname")
	private String empbankname;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getEmpstate() {
		return empstate;
	}

	public void setEmpstate(String empstate) {
		this.empstate = empstate;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getEmpmobileno() {
		return empmobileno;
	}

	public void setEmpmobileno(String empmobileno) {
		this.empmobileno = empmobileno;
	}

	public String getEmpgender() {
		return empgender;
	}

	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}

	public String getEmppan() {
		return emppan;
	}

	public void setEmppan(String emppan) {
		this.emppan = emppan;
	}

	public Date getEmpDOJ() {
		return empDOJ;
	}

	public void setEmpDOJ(Date empDOJ) {
		this.empDOJ = empDOJ;
	}

	public String getEmpdepartment() {
		return empdepartment;
	}

	public void setEmpdepartment(String empdepartment) {
		this.empdepartment = empdepartment;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

	public String getEmpbankaccno() {
		return empbankaccno;
	}

	public void setEmpbankaccno(String empbankaccno) {
		this.empbankaccno = empbankaccno;
	}

	public String getEmpbankname() {
		return empbankname;
	}

	public void setEmpbankname(String empbankname) {
		this.empbankname = empbankname;
	}

	public EmployeeMaster(int empid, String empname, String empaddress, String empstate, String empemail,
			String empmobileno, String empgender, String emppan, Date empDOJ, String empdepartment,
			String empdesignation, String empbankaccno, String empbankname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.empstate = empstate;
		this.empemail = empemail;
		this.empmobileno = empmobileno;
		this.empgender = empgender;
		this.emppan = emppan;
		this.empDOJ = empDOJ;
		this.empdepartment = empdepartment;
		this.empdesignation = empdesignation;
		this.empbankaccno = empbankaccno;
		this.empbankname = empbankname;
	}

	public EmployeeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeMaster [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empstate="
				+ empstate + ", empemail=" + empemail + ", empmobileno=" + empmobileno + ", empgender=" + empgender
				+ ", emppan=" + emppan + ", empDOJ=" + empDOJ + ", empdepartment=" + empdepartment + ", empdesignation="
				+ empdesignation + ", empbankaccno=" + empbankaccno + ", empbankname=" + empbankname + "]";
	}


}
