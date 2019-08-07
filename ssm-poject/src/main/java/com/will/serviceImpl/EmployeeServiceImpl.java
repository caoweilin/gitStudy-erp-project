package com.will.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IUserDao;
import com.will.service.EmployeeService;

/**
* create by: william
* 
* 类说明:
*/

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private IUserDao userDao;

}
