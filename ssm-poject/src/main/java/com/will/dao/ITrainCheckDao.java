package com.will.dao;

import com.will.model.TrainCheckEntity;

public interface ITrainCheckDao {
    int deleteByPrimaryKey(Integer checkId);

    int insert(TrainCheckEntity record);

    int insertSelective(TrainCheckEntity record);

    TrainCheckEntity selectByPrimaryKey(Integer checkId);

    int updateByPrimaryKeySelective(TrainCheckEntity record);

    int updateByPrimaryKey(TrainCheckEntity record);
}