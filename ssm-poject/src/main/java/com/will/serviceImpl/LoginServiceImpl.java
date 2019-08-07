package com.will.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IUserDao;
import com.will.model.userEntity;
import com.will.service.LoginService;

/**
* create by: william on 2017年9月23日
* 
* 类说明:
*/

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private IUserDao userDao;

	public userEntity find(userEntity entity) {
		
		return userDao.find(entity);
	}

	public void save(userEntity entity) {
		userDao.insertSelective(entity);
	}

	public List<userEntity> findAllEmps(int postId) {
		return userDao.findAllEmps(postId);
	}

	public void update(userEntity entity) {
		userDao.updateByPrimaryKeySelective(entity);
	}

	public userEntity findById(Integer userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	public List<userEntity> findAll() {
		return userDao.findAll();
	}

	public List<userEntity> findByName(String name) {
		return userDao.findByName(name);
	}

	public List<userEntity> findEmpByRoleId() {
		return userDao.findEmpByRoleId();
	}

	public List<userEntity> findByNameAndState(String findByName, String state) {
		return userDao.findByNameAndState(findByName, state);
	}

	public userEntity getEmpById(int id) {
		return userDao.getEmpById(id);
	}

	public userEntity checkUser(String empName) {
		return userDao.checkUser(empName);
	}
	
	public List<userEntity> findAllEmployees() {
		return userDao.findAllEmployees();
	}

}















