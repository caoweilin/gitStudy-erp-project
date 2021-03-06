package com.will.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.ITrainDao;
import com.will.model.NewMessageEntity;
import com.will.model.TrainEntity;
import com.will.service.TrainService;

/**
* create by: william on 2017年9月26日
* 
* 类说明:
*/

@Service
public class TrainServiceImpl implements TrainService{
	@Autowired
	private ITrainDao trainDao;

	public List<TrainEntity> findAll() {
		return trainDao.findAll();
	}

	public void addTrain(TrainEntity entity) {
		trainDao.insert(entity);
	}

	public void deleteTrainById(int id) {
		trainDao.deleteByPrimaryKey(id);
	}

	public TrainEntity findById(int id) {
		return trainDao.selectByPrimaryKey(id);
	}

	public void update(TrainEntity entity) {
		trainDao.updateByPrimaryKeySelective(entity);		
	}

	public List<TrainEntity> findByName(String name) {
		return trainDao.findByName(name);
	}


	public List<NewMessageEntity> findTrainBytime(Integer deptId) {
		return trainDao.findTrainBytime(deptId);
	}

	public List<TrainEntity> findByUid(Integer userId) {
		return trainDao.findByUid(userId);
	}

	public List<TrainEntity> findByDeptId(Integer deptId) {
		return trainDao.findByDeptId(deptId);
	}

	public TrainEntity findWityGrade(Map<String, Object> map) {
		return trainDao.findWityGrade(map);
	}

}
