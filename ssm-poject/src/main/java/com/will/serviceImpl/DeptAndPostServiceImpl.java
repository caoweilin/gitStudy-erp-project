package com.will.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.asm.IElementHandleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.dao.IDeptDao;
import com.will.dao.IJobPostDao;
import com.will.dao.IUserDao;
import com.will.model.DeptEntity;
import com.will.model.JobPostEntity;
import com.will.model.userEntity;
import com.will.service.DeptAndPostSeivice;

/**
* create by: william
* 
* 类说明:
*/

@Service
public class DeptAndPostServiceImpl implements DeptAndPostSeivice{
	@Autowired
	private IDeptDao deptDao;
	@Autowired
	private IJobPostDao jobPostDao;
	@Autowired
	private IUserDao userDao;
	
	
	public List<DeptEntity> findAllDepts() {
		return deptDao.findAllDepts();
	}


	public List<JobPostEntity> findPostByEmptId(int emptId) {
		return jobPostDao.findPostByEmptId(emptId);
	}


	public JobPostEntity findPostById(int id) {
		return jobPostDao.findPostById(id);
	}


	public DeptEntity findDempById(Integer parentId) {
		return deptDao.findDempByPid(parentId);
	}


	public void save(DeptEntity entity) {
		deptDao.insert(entity);
		
	}


	public void update(DeptEntity entity) {
		deptDao.updateByPrimaryKeySelective(entity);
		
	}


	public int deleteById(int id) {
		return deptDao.deleteByPrimaryKey(id);
	}


	public void savePost(JobPostEntity entity) {
		jobPostDao.insert(entity);
	}


	public void updatePost(JobPostEntity entity) {
		jobPostDao.updateByPrimaryKeySelective(entity);
	}


	public void deletePostById(int id) {
		jobPostDao.deleteByPrimaryKey(id);
		
	}


	public List<JobPostEntity> findAllPosts() {
		return jobPostDao.findAllPosts();
	}


	//通过deptId找到所有员工
	public List<userEntity> findAllEmpByDid(Integer deptId) {
		List<userEntity> allEmpsList = new ArrayList<userEntity>();
		List<JobPostEntity> postList = jobPostDao.findPostByEmptId(deptId);
		for (JobPostEntity jobPostEntity : postList) {
			List<userEntity> empList = userDao.findAllEmps(jobPostEntity.getPostId());
			allEmpsList.addAll(empList);
		}
		return allEmpsList;
	}


}
