package com.will.service;

import java.util.List;

import com.will.model.InviteInfoEntity;

/**
* create by: william on 2018年9月27日
* 
* 类说明:
*/

public interface InviterService {

	//增加招聘信息
	void addByEntity(InviteInfoEntity entity);

	//删除
	void deleteById(int id);

	//按id查找
	InviteInfoEntity findById(int id);

	//更新
	void updateInvite(InviteInfoEntity entity);

	//名字模糊查询
	List<InviteInfoEntity> findListByName(String findByName);

}
