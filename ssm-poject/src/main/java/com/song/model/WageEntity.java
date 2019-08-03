package com.song.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class WageEntity {
    private Integer wageId;

    private Integer empId;

    private String years;

    private String months;

    private BigDecimal totalWage;	//总工资

    private BigDecimal baseWage;	//基本工资

    private BigDecimal perfWage;	//绩效工资

    private BigDecimal ovWage;		//加班费

    private BigDecimal rapWage;		//奖惩金

    private BigDecimal jinpoWage;	//社保

    private Integer state;

    private String descript;	//附议内容

    private String adminDescript;	//管理员审核内容
    
    private userEntity user;

	public Integer getWageId() {
		return wageId;
	}

	public void setWageId(Integer wageId) {
		this.wageId = wageId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getMonths() {
		return months;
	}

	public void setMonths(String months) {
		this.months = months;
	}

	public BigDecimal getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(BigDecimal totalWage) {
		this.totalWage = totalWage;
	}

	public BigDecimal getBaseWage() {
		return baseWage;
	}

	public void setBaseWage(BigDecimal baseWage) {
		this.baseWage = baseWage;
	}

	public BigDecimal getPerfWage() {
		return perfWage;
	}

	public void setPerfWage(BigDecimal perfWage) {
		this.perfWage = perfWage;
	}

	public BigDecimal getOvWage() {
		return ovWage;
	}

	public void setOvWage(BigDecimal ovWage) {
		this.ovWage = ovWage;
	}

	public BigDecimal getRapWage() {
		return rapWage;
	}

	public void setRapWage(BigDecimal rapWage) {
		this.rapWage = rapWage;
	}

	public BigDecimal getJinpoWage() {
		return jinpoWage;
	}

	public void setJinpoWage(BigDecimal jinpoWage) {
		this.jinpoWage = jinpoWage;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getAdminDescript() {
		return adminDescript;
	}

	public void setAdminDescript(String adminDescript) {
		this.adminDescript = adminDescript;
	}

	public userEntity getUser() {
		return user;
	}

	public void setUser(userEntity user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "WageEntity [wageId=" + wageId + ", empId=" + empId + ", years=" + years + ", months=" + months
				+ ", totalWage=" + totalWage + ", baseWage=" + baseWage + ", perfWage=" + perfWage + ", ovWage="
				+ ovWage + ", rapWage=" + rapWage + ", jinpoWage=" + jinpoWage + ", state=" + state + ", descript="
				+ descript + ", adminDescript=" + adminDescript + ", user=" + user + "]";
	}

    
    
}