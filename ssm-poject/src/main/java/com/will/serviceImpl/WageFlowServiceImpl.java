package com.will.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IWageFlowDao;
import com.will.model.WageFlowEntity;
import com.will.service.WageFlowService;

/**
* create by: william on 2017年10月10日
* 
* 类说明:
*/

@Service
public class WageFlowServiceImpl implements WageFlowService{
	@Autowired
	private IWageFlowDao wageFlowDao;

	public void save(WageFlowEntity wfEntity) {
		wageFlowDao.insertSelective(wfEntity);
	}

	public List<WageFlowEntity> findByWageId(int id) {
		return wageFlowDao.findByWageId(id);
	}
	

}
