package com.song.model;

import lombok.Data;

@Data
public class InviteInfoEntity {
    private Integer inviteId;

    private String name;

    private String address;

    private String requires;

    private String jobPosition;

    private String welfare;

    private String salary;

	public Integer getInviteId() {
		return inviteId;
	}

	public void setInviteId(Integer inviteId) {
		this.inviteId = inviteId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRequires() {
		return requires;
	}

	public void setRequires(String requires) {
		this.requires = requires;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getWelfare() {
		return welfare;
	}

	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "InviteInfoEntity [inviteId=" + inviteId + ", name=" + name + ", address=" + address + ", requires="
				+ requires + ", jobPosition=" + jobPosition + ", welfare=" + welfare + ", salary=" + salary + "]";
	}

    
}