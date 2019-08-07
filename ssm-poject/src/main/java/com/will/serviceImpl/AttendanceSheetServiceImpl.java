package com.will.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IAttendanceSheetDao;
import com.will.model.AttendanceSheetEntity;
import com.will.service.AttendanceSheetService;

/**
* create by: william
* 
* 类说明:
*/

@Service
public class AttendanceSheetServiceImpl implements AttendanceSheetService{
	@Autowired
	private IAttendanceSheetDao attendanceSheetDao;

	public AttendanceSheetEntity findByDate(Map<String, Object> map) {
		return attendanceSheetDao.findByDate(map);
	}

	public void save(AttendanceSheetEntity entity) {
		attendanceSheetDao.insertSelective(entity);
	}

	public void update(AttendanceSheetEntity entity) {
		attendanceSheetDao.updateByPrimaryKeySelective(entity);
	}

	public List<AttendanceSheetEntity> findByUid(Integer userId) {
		return attendanceSheetDao.findByUid(userId);
	}

	public List<AttendanceSheetEntity> findByYearAndMonth(Map<String, Object> map) {
		return attendanceSheetDao.findByYearAndMonth(map);
	}

	public List<AttendanceSheetEntity> findByYearAndMonthAndDay(Map<String, Object> map) {
		return attendanceSheetDao.findByYearAndMonthAndDay(map);
	}

}
