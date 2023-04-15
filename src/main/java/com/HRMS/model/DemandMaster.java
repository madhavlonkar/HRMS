package com.HRMS.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Demand")
public class DemandMaster {

	@Id
	int demand_id;
	
	@OneToOne
	@JoinColumn(name="project_id")
	ProjectMaster project_id;
	
	String DemandType;
	String Qualifictation;
	
	@OneToOne
	@JoinColumn(name="designation_id")
	DesignationMaster designation_id;
	
	String Job_Description;
	int Numberofposition;
	Date DatePosted;
	Date StartDate;
	Date DateClosed;
	String Status;
	String Mode;
	String Skills;
	/**
	 * @return the demand_id
	 */
	public int getDemand_id() {
		return demand_id;
	}
	/**
	 * @return the project_id
	 */
	public ProjectMaster getProject_id() {
		return project_id;
	}
	/**
	 * @return the demandType
	 */
	public String getDemandType() {
		return DemandType;
	}
	/**
	 * @return the qualifictation
	 */
	public String getQualifictation() {
		return Qualifictation;
	}
	/**
	 * @return the designation_id
	 */
	public DesignationMaster getDesignation_id() {
		return designation_id;
	}
	/**
	 * @return the job_Description
	 */
	public String getJob_Description() {
		return Job_Description;
	}
	/**
	 * @return the numberofposition
	 */
	public int getNumberofposition() {
		return Numberofposition;
	}
	/**
	 * @return the datePosted
	 */
	public Date getDatePosted() {
		return DatePosted;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return StartDate;
	}
	/**
	 * @return the dateClosed
	 */
	public Date getDateClosed() {
		return DateClosed;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * @return the mode
	 */
	public String getMode() {
		return Mode;
	}
	/**
	 * @return the skills
	 */
	public String getSkills() {
		return Skills;
	}
	/**
	 * @param demand_id the demand_id to set
	 */
	public void setDemand_id(int demand_id) {
		this.demand_id = demand_id;
	}
	/**
	 * @param project_id the project_id to set
	 */
	public void setProject_id(ProjectMaster project_id) {
		this.project_id = project_id;
	}
	/**
	 * @param demandType the demandType to set
	 */
	public void setDemandType(String demandType) {
		DemandType = demandType;
	}
	/**
	 * @param qualifictation the qualifictation to set
	 */
	public void setQualifictation(String qualifictation) {
		Qualifictation = qualifictation;
	}
	/**
	 * @param designation_id the designation_id to set
	 */
	public void setDesignation_id(DesignationMaster designation_id) {
		this.designation_id = designation_id;
	}
	/**
	 * @param job_Description the job_Description to set
	 */
	public void setJob_Description(String job_Description) {
		Job_Description = job_Description;
	}
	/**
	 * @param numberofposition the numberofposition to set
	 */
	public void setNumberofposition(int numberofposition) {
		Numberofposition = numberofposition;
	}
	/**
	 * @param datePosted the datePosted to set
	 */
	public void setDatePosted(Date datePosted) {
		DatePosted = datePosted;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	/**
	 * @param dateClosed the dateClosed to set
	 */
	public void setDateClosed(Date dateClosed) {
		DateClosed = dateClosed;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		Mode = mode;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		Skills = skills;
	}
	/**
	 * @param demand_id
	 * @param project_id
	 * @param demandType
	 * @param qualifictation
	 * @param designation_id
	 * @param job_Description
	 * @param numberofposition
	 * @param datePosted
	 * @param startDate
	 * @param dateClosed
	 * @param status
	 * @param mode
	 * @param skills
	 */
	public DemandMaster(int demand_id, ProjectMaster project_id, String demandType, String qualifictation,
			DesignationMaster designation_id, String job_Description, int numberofposition, Date datePosted,
			Date startDate, Date dateClosed, String status, String mode, String skills) {
		super();
		this.demand_id = demand_id;
		this.project_id = project_id;
		DemandType = demandType;
		Qualifictation = qualifictation;
		this.designation_id = designation_id;
		Job_Description = job_Description;
		Numberofposition = numberofposition;
		DatePosted = datePosted;
		StartDate = startDate;
		DateClosed = dateClosed;
		Status = status;
		Mode = mode;
		Skills = skills;
	}
	/**
	 * 
	 */
	public DemandMaster() {
		super();
	}
	@Override
	public String toString() {
		return "DemandMaster [demand_id=" + demand_id + ", project_id=" + project_id + ", DemandType=" + DemandType
				+ ", Qualifictation=" + Qualifictation + ", designation_id=" + designation_id + ", Job_Description="
				+ Job_Description + ", Numberofposition=" + Numberofposition + ", DatePosted=" + DatePosted
				+ ", StartDate=" + StartDate + ", DateClosed=" + DateClosed + ", Status=" + Status + ", Mode=" + Mode
				+ ", Skills=" + Skills + "]";
	}

	

}
