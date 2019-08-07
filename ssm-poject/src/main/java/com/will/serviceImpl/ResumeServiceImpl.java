package com.will.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IResumeDao;
import com.will.model.ResumeEntity;
import com.will.service.ResumeService;

/**
* create by: william on 2017年9月24日
* 
* 类说明:
*/

@Service
public class ResumeServiceImpl implements ResumeService{
	@Autowired
	private IResumeDao resumeDao;

	public void save(ResumeEntity entity) {
		resumeDao.insertSelective(entity);		
	}

	public ResumeEntity findByUid(Integer userId) {
		return resumeDao.findByUid(userId);
	}

	public void updateById(ResumeEntity entity) {
		resumeDao.updateByPrimaryKeySelective(entity);
	}

	public List<ResumeEntity> findAll() {
		return resumeDao.findAll();
	}

	public ResumeEntity findById(int id) {
		return resumeDao.findById(id);
	}

	public void deleteById(int id) {
		resumeDao.deleteByPrimaryKey(id);
		
	}

	public List<ResumeEntity> findResumeByAppId(Integer userId) {
		return resumeDao.findResumeByAppId(userId);
	}

}
