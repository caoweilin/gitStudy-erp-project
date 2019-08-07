package com.will.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IWageDao;
import com.will.model.WageEntity;
import com.will.service.WageService;

/**
* create by: william on 2017年10月10日
* 
* 类说明:
*/

@Service
public class WageServiceImpl implements WageService{
	@Autowired
	private IWageDao wageDao;

	public List<WageEntity> findWageByUid(Integer id) {
		return wageDao.findWageByUid(id);
	}

	public void updateUserWage(WageEntity entity) {
		wageDao.updateByPrimaryKeySelective(entity);
	}

	public List<WageEntity> getReConsiderWage() {
		return wageDao.getReConsiderWage();
	}

	public void save(WageEntity wageEntity) {
		wageDao.insertSelective(wageEntity);
	}

	public int checkRecords(String years, String months) {
		return wageDao.checkRecords(years, months);
	}

}
