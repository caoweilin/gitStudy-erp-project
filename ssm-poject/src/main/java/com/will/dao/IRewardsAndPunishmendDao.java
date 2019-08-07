package com.will.dao;

import java.util.List;
import java.util.Map;

import com.will.model.AttendanceSheetEntity;
import com.will.model.RewardsAndPunishmendEntity;

public interface IRewardsAndPunishmendDao {
    int deleteByPrimaryKey(Integer rapId);

    int insert(RewardsAndPunishmendEntity record);

    int insertSelective(RewardsAndPunishmendEntity record);

    RewardsAndPunishmendEntity selectByPrimaryKey(Integer rapId);

    int updateByPrimaryKeySelective(RewardsAndPunishmendEntity record);

    int updateByPrimaryKey(RewardsAndPunishmendEntity record);

	List<RewardsAndPunishmendEntity> findAllRecords();

	List<RewardsAndPunishmendEntity> findUserRecords(Integer uId);

	List<RewardsAndPunishmendEntity> findByYearAndMonth(Map<String, Object> map);

	List<RewardsAndPunishmendEntity> findByYearAndMonthNoUser(Map<String, Object> map);
}