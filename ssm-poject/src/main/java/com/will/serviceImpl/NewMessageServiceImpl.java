package com.will.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.INewMessageDao;
import com.will.model.NewMessageEntity;
import com.will.service.NewMessageService;

/**
* create by: william on 2017年9月29日
* 
* 类说明:
*/

@Service
public class NewMessageServiceImpl implements NewMessageService{
	@Autowired
	private INewMessageDao newMessageDao;
	
	
	public void save(NewMessageEntity messageEntity) {
		newMessageDao.insertSelective(messageEntity);		
	}


	public List<NewMessageEntity> findInterViewByUId(Integer userId) {
		return newMessageDao.findInterViewByUId(userId);
	}


	public void update(NewMessageEntity newMessageEntity) {
		newMessageDao.updateByPrimaryKeySelective(newMessageEntity);		
	}


	public List<NewMessageEntity> findAllInterViewByUId(Integer userId) {
		return newMessageDao.findAllInterViewByUId(userId);
	}


	public List<NewMessageEntity> findAppointByUId(Integer userId) {
		return newMessageDao.findAppointByUId(userId);
	}


	public List<NewMessageEntity> findAllAppointByUId(Integer userId) {
		return newMessageDao.findAllAppointByUId(userId);
	}


	public List<NewMessageEntity> findTrainByUid(Integer userId) {
		return newMessageDao.findTrainByUid(userId);
	}


	public List<NewMessageEntity> findAllMessageByUId(Integer userId) {
		return newMessageDao.findAllMessageByUId(userId);
	}


	public List<NewMessageEntity> findTrainBytime(Integer uid) {
		return newMessageDao.findTrainBytime(uid);
	}



}
