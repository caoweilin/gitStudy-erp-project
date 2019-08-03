package com.song.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
/**
 * 规则： type=1 : 游客面试消息;  type=2 : 指定面试人（面试官）消息;
 * @author song
 *
 */
@Data
public class NewMessageEntity {
    private Integer messageId;

    private Integer userId;	//消息指派人

    private Integer assignId;	//指定消息实体类型id

    private Integer type;	//消息的类型

    private String content;	//消息内容

    private Integer messageState;	//消息状态

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;	//消息创建时间
    
    private String sender; //发送人
    
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date appointedtime;	//指定操作时间

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAssignId() {
		return assignId;
	}

	public void setAssignId(Integer assignId) {
		this.assignId = assignId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getMessageState() {
		return messageState;
	}

	public void setMessageState(Integer messageState) {
		this.messageState = messageState;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Date getAppointedtime() {
		return appointedtime;
	}

	public void setAppointedtime(Date appointedtime) {
		this.appointedtime = appointedtime;
	}

	@Override
	public String toString() {
		return "NewMessageEntity [messageId=" + messageId + ", userId=" + userId + ", assignId=" + assignId + ", type="
				+ type + ", content=" + content + ", messageState=" + messageState + ", createTime=" + createTime
				+ ", sender=" + sender + ", appointedtime=" + appointedtime + "]";
	}

    
}