package com.HRMS.model;

import java.sql.Date;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_candidateMaster")
public class CandidateMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotBlank(message = "Name is mandatory")
    private String name;

	
    @NotBlank(message = "Email is mandatory")
    @Column(nullable = false)
    private String email;

    @NotBlank(message = "Primary phone number is mandatory")
    @Column(nullable = false)
    private String primaryPhone;

    private String alternativePhone;

    @NotBlank(message = "Address is mandatory")
    @Column(nullable = false)
    private String address;

    @NotBlank(message = "Date of birth is mandatory")
    @Column(nullable = false)
    private Date dateOfBirth;

    @NotBlank(message = "Adhar number is mandatory")
    @Column(nullable = false)
    private String adharNumber;

    @NotBlank(message = "Gender is mandatory")
    @Column(nullable = false)
    private String gender;

    private String resume;

    @NotBlank(message = "Qualification is mandatory")
    @Column(nullable = false)
    private String qualification;

    private String skills;
    private String status;
    private String linkedinProfile;
    private String githubProfile;
    private String noticePeriod;
    private String reference;
    private String lastJob;
    private String areaOfInterest;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the primaryPhone
	 */
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	/**
	 * @return the alternativePhone
	 */
	public String getAlternativePhone() {
		return alternativePhone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @return the adharNumber
	 */
	public String getAdharNumber() {
		return adharNumber;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @return the linkedinProfile
	 */
	public String getLinkedinProfile() {
		return linkedinProfile;
	}
	/**
	 * @return the githubProfile
	 */
	public String getGithubProfile() {
		return githubProfile;
	}
	/**
	 * @return the noticePeriod
	 */
	public String getNoticePeriod() {
		return noticePeriod;
	}
	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	/**
	 * @return the lastJob
	 */
	public String getLastJob() {
		return lastJob;
	}
	/**
	 * @return the areaOfInterest
	 */
	public String getAreaOfInterest() {
		return areaOfInterest;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param primaryPhone the primaryPhone to set
	 */
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	/**
	 * @param alternativePhone the alternativePhone to set
	 */
	public void setAlternativePhone(String alternativePhone) {
		this.alternativePhone = alternativePhone;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @param adharNumber the adharNumber to set
	 */
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @param linkedinProfile the linkedinProfile to set
	 */
	public void setLinkedinProfile(String linkedinProfile) {
		this.linkedinProfile = linkedinProfile;
	}
	/**
	 * @param githubProfile the githubProfile to set
	 */
	public void setGithubProfile(String githubProfile) {
		this.githubProfile = githubProfile;
	}
	/**
	 * @param noticePeriod the noticePeriod to set
	 */
	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	/**
	 * @param lastJob the lastJob to set
	 */
	public void setLastJob(String lastJob) {
		this.lastJob = lastJob;
	}
	/**
	 * @param areaOfInterest the areaOfInterest to set
	 */
	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param primaryPhone
	 * @param alternativePhone
	 * @param address
	 * @param dateOfBirth
	 * @param adharNumber
	 * @param gender
	 * @param resume
	 * @param qualification
	 * @param skills
	 * @param status
	 * @param linkedinProfile
	 * @param githubProfile
	 * @param noticePeriod
	 * @param reference
	 * @param lastJob
	 * @param areaOfInterest
	 */
	public CandidateMaster(Long id, String name, String email, String primaryPhone, String alternativePhone,
			String address, Date dateOfBirth, String adharNumber, String gender, String resume, String qualification,
			String skills, String status, String linkedinProfile, String githubProfile, String noticePeriod,
			String reference, String lastJob, String areaOfInterest) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.primaryPhone = primaryPhone;
		this.alternativePhone = alternativePhone;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.adharNumber = adharNumber;
		this.gender = gender;
		this.resume = resume;
		this.qualification = qualification;
		this.skills = skills;
		this.status = status;
		this.linkedinProfile = linkedinProfile;
		this.githubProfile = githubProfile;
		this.noticePeriod = noticePeriod;
		this.reference = reference;
		this.lastJob = lastJob;
		this.areaOfInterest = areaOfInterest;
	}
	/**
	 * 
	 */
	public CandidateMaster() {
		super();
	}
	@Override
	public String toString() {
		return "CandidateMaster [id=" + id + ", name=" + name + ", email=" + email + ", primaryPhone=" + primaryPhone
				+ ", alternativePhone=" + alternativePhone + ", address=" + address + ", dateOfBirth=" + dateOfBirth
				+ ", adharNumber=" + adharNumber + ", gender=" + gender + ", resume=" + resume + ", qualification="
				+ qualification + ", skills=" + skills + ", status=" + status + ", linkedinProfile=" + linkedinProfile
				+ ", githubProfile=" + githubProfile + ", noticePeriod=" + noticePeriod + ", reference=" + reference
				+ ", lastJob=" + lastJob + ", areaOfInterest=" + areaOfInterest + "]";
	}

	
    
}
