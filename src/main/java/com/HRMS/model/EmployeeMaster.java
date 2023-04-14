package com.HRMS.model;

import java.sql.Blob;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Employee_Master")
public class EmployeeMaster {
	
	@Id
	@Column(name="EmpId")
	private Integer empid;
	
	@Column(name="EmpName")
	private String empname;
	
	@Column(name="EmpAddress")
	private String empaddress;
	
	@Column(name="EmpState")
	private String empstate;
	
	@Column(name="EmpEmail")
	private String empemail;
	
	@Column(name="EmpMobileNo")
	private String empmobileno;
	
	@Column(name="EmpGender")
	private String empgender;

	@Column(name="EmpDob")
	private Date empDob;
	
	@Column(name="EmpPan")
	private String emppan;

	@Column(name="EmpAdhar")
	private String empAdhar;
	
	@Column(name="EmpDoj")
	private Date empDOJ;
	
	@Column(name="EmpDepartment")
	private String empdepartment;
	
	@Column(name="EmpDesignation")
	private String empdesignation;
	
	@Column(name="EmpBankAccNo")
	private String empbankaccno;
	
	@Column(name="EmpBankName")
	private String empbankname;

	@Column(name = "EmpResume")
	private Blob empResume;

	@Column(name = "EmpStatus")
	private String empStatus;

	@Column(name = "ManagerId")
	private Integer ManagerId;

	@OneToOne
	@JoinColumn(name = "ProjectID")
	private ProjectMaster Project_Id;

	@OneToOne
	@JoinColumn(name = "DemandID")
	private DemandMaster demand_id;

	public EmployeeMaster() {
	}

	public EmployeeMaster(Integer empid, String empname, String empaddress, String empstate, String empemail, String empmobileno, String empgender, Date empDob, String emppan, String empAdhar, Date empDOJ, String empdepartment, String empdesignation, String empbankaccno, String empbankname, Blob empResume, String empStatus, Integer managerId, ProjectMaster project_Id, DemandMaster demand_id) {
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.empstate = empstate;
		this.empemail = empemail;
		this.empmobileno = empmobileno;
		this.empgender = empgender;
		this.empDob = empDob;
		this.emppan = emppan;
		this.empAdhar = empAdhar;
		this.empDOJ = empDOJ;
		this.empdepartment = empdepartment;
		this.empdesignation = empdesignation;
		this.empbankaccno = empbankaccno;
		this.empbankname = empbankname;
		this.empResume = empResume;
		this.empStatus = empStatus;
		ManagerId = managerId;
		Project_Id = project_Id;
		this.demand_id = demand_id;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
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

	public Date getEmpDob() {
		return empDob;
	}

	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	public String getEmppan() {
		return emppan;
	}

	public void setEmppan(String emppan) {
		this.emppan = emppan;
	}

	public String getEmpAdhar() {
		return empAdhar;
	}

	public void setEmpAdhar(String empAdhar) {
		this.empAdhar = empAdhar;
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

	public Blob getEmpResume() {
		return empResume;
	}

	public void setEmpResume(Blob empResume) {
		this.empResume = empResume;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public Integer getManagerId() {
		return ManagerId;
	}

	public void setManagerId(Integer managerId) {
		ManagerId = managerId;
	}

	public ProjectMaster getProject_Id() {
		return Project_Id;
	}

	public void setProject_Id(ProjectMaster project_Id) {
		Project_Id = project_Id;
	}

	public DemandMaster getDemand_id() {
		return demand_id;
	}

	public void setDemand_id(DemandMaster demand_id) {
		this.demand_id = demand_id;
	}

	@Override
	public String toString() {
		return "EmployeeMaster{" +
				"empid=" + empid +
				", empname='" + empname + '\'' +
				", empaddress='" + empaddress + '\'' +
				", empstate='" + empstate + '\'' +
				", empemail='" + empemail + '\'' +
				", empmobileno='" + empmobileno + '\'' +
				", empgender='" + empgender + '\'' +
				", empDob=" + empDob +
				", emppan='" + emppan + '\'' +
				", empAdhar='" + empAdhar + '\'' +
				", empDOJ=" + empDOJ +
				", empdepartment='" + empdepartment + '\'' +
				", empdesignation='" + empdesignation + '\'' +
				", empbankaccno='" + empbankaccno + '\'' +
				", empbankname='" + empbankname + '\'' +
				", empResume=" + empResume +
				", empStatus='" + empStatus + '\'' +
				", ManagerId=" + ManagerId +
				", Project_Id=" + Project_Id +
				", demand_id=" + demand_id +
				'}';
	}
}
