package com.song.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.dao.IResumeDao;
import com.song.model.ResumeEntity;
import com.song.service.ResumeService;

/**
* create by: song on 2017年9月24日
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
