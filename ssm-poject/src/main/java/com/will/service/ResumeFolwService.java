package com.will.service;

import java.util.List;

import com.will.model.ResumeFlowEntity;

/**
* create by: william on 2018年9月29日
* 
* 类说明:
*/

public interface ResumeFolwService {
	
	//保存流程记录
	void save(ResumeFlowEntity flowEntity);

	//用简历id查找指定的流程
	List<ResumeFlowEntity> findByResumeId(int id);
}
