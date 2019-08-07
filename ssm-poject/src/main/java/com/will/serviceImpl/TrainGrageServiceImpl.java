package com.will.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.ITrainGradeDao;
import com.will.model.TrainGradeEntity;
import com.will.service.TrainGrageService;

/**
* create by: william on 2017年10月13日
* 
* 类说明:
*/
@Service
public class TrainGrageServiceImpl implements TrainGrageService{
	@Autowired
	private ITrainGradeDao trainGradeDao;

	public void save(TrainGradeEntity tgEntity) {
		trainGradeDao.insertSelective(tgEntity);		
	}

}
