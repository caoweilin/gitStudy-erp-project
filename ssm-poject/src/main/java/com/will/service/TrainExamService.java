package com.will.service;

import java.util.List;

import com.will.model.TrainExamEntity;

/**
* create by: william on 2018年10月31日
* 
* 类说明:
*/

public interface TrainExamService {

	//选出无培训的试题
	List<TrainExamEntity> findExamNoTrainId();

	//更新
	void update(TrainExamEntity trainExamEntity);

	//根据培训id找试题
	List<TrainExamEntity> findExamByTrainId(int trainId);

}
