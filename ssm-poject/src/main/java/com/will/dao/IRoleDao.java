package com.will.dao;

import com.will.model.RoleEntity;

public interface IRoleDao {
    int deleteByPrimaryKey(Integer roleId);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    RoleEntity selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);
}