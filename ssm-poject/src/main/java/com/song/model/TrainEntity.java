package com.song.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TrainEntity {
    private Integer trainId;

    private Integer deptId;

    private String trainName;

    @DateTimeFormat(pattern="yyyy-MM-dd")
   // @JSONField(format="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date trainTime;

    private String trainContent;

    private String recall;
    
    private int uid;	//培训的人
    
    private TrainGradeEntity trainGradeEntity;

	public Integer getTrainId() {
		return trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Date getTrainTime() {
		return trainTime;
	}

	public void setTrainTime(Date trainTime) {
		this.trainTime = trainTime;
	}

	public String getTrainContent() {
		return trainContent;
	}

	public void setTrainContent(String trainContent) {
		this.trainContent = trainContent;
	}

	public String getRecall() {
		return recall;
	}

	public void setRecall(String recall) {
		this.recall = recall;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public TrainGradeEntity getTrainGradeEntity() {
		return trainGradeEntity;
	}

	public void setTrainGradeEntity(TrainGradeEntity trainGradeEntity) {
		this.trainGradeEntity = trainGradeEntity;
	}

	@Override
	public String toString() {
		return "TrainEntity [trainId=" + trainId + ", deptId=" + deptId + ", trainName=" + trainName + ", trainTime="
				+ trainTime + ", trainContent=" + trainContent + ", recall=" + recall + ", uid=" + uid
				+ ", trainGradeEntity=" + trainGradeEntity + "]";
	}

    
}