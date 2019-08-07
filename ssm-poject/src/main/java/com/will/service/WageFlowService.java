package com.will.service;

import java.util.List;

import com.will.model.WageFlowEntity;

/**
* create by: william on 2018年10月29日
* 
* 类说明:
*/

public interface WageFlowService {

	//保存复议记录
	void save(WageFlowEntity wfEntity);

	//根据记录wageid找所有的记录
	List<WageFlowEntity> findByWageId(int id);

}
