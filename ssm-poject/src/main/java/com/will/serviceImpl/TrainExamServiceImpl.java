package com.will.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.ITrainExamDao;
import com.will.model.TrainExamEntity;
import com.will.service.TrainExamService;

/**
* create by: william on 2017年10月13日
* 
* 类说明:
*/
@Service
public class TrainExamServiceImpl implements TrainExamService{
	@Autowired
	private ITrainExamDao trainExamDao;

	public List<TrainExamEntity> findExamNoTrainId() {
		return trainExamDao.findExamNoTrainId();
	}

	public void update(TrainExamEntity trainExamEntity) {
		trainExamDao.updateByPrimaryKeySelective(trainExamEntity);
	}

	public List<TrainExamEntity> findExamByTrainId(int trainId) {
		return trainExamDao.findExamByTrainId(trainId);
	}

}






