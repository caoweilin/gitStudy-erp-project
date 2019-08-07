package com.will.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IInviteInfoDao;
import com.will.model.InviteInfoEntity;
import com.will.service.VisitorService;

/**
* create by: william on 2017年9月23日
* 
* 类说明:
*/

@Service
public class VisitorServiceImpl implements VisitorService{
	@Autowired
	private IInviteInfoDao inviterInfoDao;

	public List<InviteInfoEntity> getAllInviter() {
		return inviterInfoDao.findAll();
	}

}
