package com.will.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IResumeFlowDao;
import com.will.model.ResumeFlowEntity;
import com.will.service.ResumeFolwService;

/**
* create by: william on 2017年9月28日
* 
* 类说明:
*/

@Service
public class ResumeFlowServiceImpl implements ResumeFolwService{
	@Autowired
	private IResumeFlowDao resumeDao;

	public void save(ResumeFlowEntity flowEntity) {
		resumeDao.insertSelective(flowEntity);
	}

	public List<ResumeFlowEntity> findByResumeId(int id) {
		return resumeDao.findByResumeId(id);
	}
}
















