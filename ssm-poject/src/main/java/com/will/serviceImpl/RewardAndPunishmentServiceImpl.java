package com.will.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IRewardsAndPunishmendDao;
import com.will.model.AttendanceSheetEntity;
import com.will.model.RewardsAndPunishmendEntity;
import com.will.service.RewardAndPunishmentService;

/**
* create by: william on 2017年10月1日
* 
* 类说明:
*/

@Service
public class RewardAndPunishmentServiceImpl implements RewardAndPunishmentService{
	@Autowired
	private IRewardsAndPunishmendDao rewardAndPunishmentDao;

	public List<RewardsAndPunishmendEntity> findAllRecords() {
		return rewardAndPunishmentDao.findAllRecords();
	}

	public List<RewardsAndPunishmendEntity> findUserRecords(Integer uId) {
		return rewardAndPunishmentDao.findUserRecords(uId);
	}

	public void save(RewardsAndPunishmendEntity rapEntity) {
		rewardAndPunishmentDao.insertSelective(rapEntity);
	}

	public List<RewardsAndPunishmendEntity> findByYearAndMonth(Map<String, Object> map) {
		return rewardAndPunishmentDao.findByYearAndMonth(map);
	}

	public List<RewardsAndPunishmendEntity> findByYearAndMonthNoUser(Map<String, Object> map) {
		return rewardAndPunishmentDao.findByYearAndMonthNoUser(map);
	}

	public void delById(int id) {
		rewardAndPunishmentDao.deleteByPrimaryKey(id);
	}

	public RewardsAndPunishmendEntity findRecordById(int id) {
		return rewardAndPunishmentDao.selectByPrimaryKey(id);
	}

	public void update(RewardsAndPunishmendEntity entity) {
		rewardAndPunishmentDao.updateByPrimaryKeySelective(entity);
	}
	
	

}



