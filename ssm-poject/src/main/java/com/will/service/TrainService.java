package com.will.service;

import java.util.List;
import java.util.Map;

import com.will.model.NewMessageEntity;
import com.will.model.TrainEntity;

/**
* create by: william on 2018年9月29日
* 
* 类说明:
*/

public interface TrainService {

	//查出所有的培训信息
	List<TrainEntity> findAll();

	//增加培训信息
	void addTrain(TrainEntity entity);

	//删除培训
	void deleteTrainById(int id);

	//按id找培训
	TrainEntity findById(int id);

	//更新
	void update(TrainEntity entity);

	//用名字模糊查询
	List<TrainEntity> findByName(String name);

	//根据部门id找所有的培训信息
	List<TrainEntity> findByDeptId(Integer integer);

	List<NewMessageEntity> findTrainBytime(Integer deptId);

	//更具培训人id去查培训
	List<TrainEntity> findByUid(Integer userId);

	//查有成绩的培训记录
	TrainEntity findWityGrade(Map<String, Object> map);

}
