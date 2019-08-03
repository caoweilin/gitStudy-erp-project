package com.song.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.dao.IInviteInfoDao;
import com.song.model.InviteInfoEntity;
import com.song.service.InviterService;

/**
* create by: song on 2017年9月27日
* 
* 类说明:
*/

@Service
public class InviterServiceImpl implements InviterService{
	@Autowired
	private IInviteInfoDao inviterInfoDao;

	public void addByEntity(InviteInfoEntity entity) {
		inviterInfoDao.insertSelective(entity);
	}

	public void deleteById(int id) {
		inviterInfoDao.deleteByPrimaryKey(id);
		
	}

	public InviteInfoEntity findById(int id) {
		return inviterInfoDao.selectByPrimaryKey(id);
	}

	public void updateInvite(InviteInfoEntity entity) {
		inviterInfoDao.updateByPrimaryKeySelective(entity);
		
	}

	public List<InviteInfoEntity> findListByName(String name) {
		return inviterInfoDao.findListByName(name);
	}

}
