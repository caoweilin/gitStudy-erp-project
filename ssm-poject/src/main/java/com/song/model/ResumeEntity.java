package com.song.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ResumeEntity {
    private Integer resumeId;

    private Integer userId;

    private Integer toadminId;

    private String name;

    private String gender;

    private Integer age;

    private String phoneNumber;
    
    private String jobDept;

    private String jobPositon;

    private String preJob;

    private String exceptSalary;

    private String education;

    private String email;

    private String politicsStatus;  //政治面貌

    private String jobExp;

    private String hobbies;

    private String mark;

    private Integer state;
    
    @JSONField(format="yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date interviewDate;

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getToadminId() {
		return toadminId;
	}

	public void setToadminId(Integer toadminId) {
		this.toadminId = toadminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobDept() {
		return jobDept;
	}

	public void setJobDept(String jobDept) {
		this.jobDept = jobDept;
	}

	public String getJobPositon() {
		return jobPositon;
	}

	public void setJobPositon(String jobPositon) {
		this.jobPositon = jobPositon;
	}

	public String getPreJob() {
		return preJob;
	}

	public void setPreJob(String preJob) {
		this.preJob = preJob;
	}

	public String getExceptSalary() {
		return exceptSalary;
	}

	public void setExceptSalary(String exceptSalary) {
		this.exceptSalary = exceptSalary;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPoliticsStatus() {
		return politicsStatus;
	}

	public void setPoliticsStatus(String politicsStatus) {
		this.politicsStatus = politicsStatus;
	}

	public String getJobExp() {
		return jobExp;
	}

	public void setJobExp(String jobExp) {
		this.jobExp = jobExp;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	@Override
	public String toString() {
		return "ResumeEntity [resumeId=" + resumeId + ", userId=" + userId + ", toadminId=" + toadminId + ", name="
				+ name + ", gender=" + gender + ", age=" + age + ", phoneNumber=" + phoneNumber + ", jobDept=" + jobDept
				+ ", jobPositon=" + jobPositon + ", preJob=" + preJob + ", exceptSalary=" + exceptSalary
				+ ", education=" + education + ", email=" + email + ", politicsStatus=" + politicsStatus + ", jobExp="
				+ jobExp + ", hobbies=" + hobbies + ", mark=" + mark + ", state=" + state + ", interviewDate="
				+ interviewDate + "]";
	}

    
}