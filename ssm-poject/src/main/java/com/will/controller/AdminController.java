package com.will.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.will.model.userEntity;
import com.will.service.LoginService;
import com.will.utils.CommonMsg;
import com.will.utils.RoleState;
import com.will.utils.UserState;

/**
* create by: william 2018年9月24日
* 
* 类说明:管理员操作
*/

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/showDeptAndPostInfo")
	public String showDeptAndPostInfo(HttpSession session, Model model) {
		userEntity user = (userEntity)session.getAttribute("user");
		
		return "admin/deptAndPostInfo";
	}
	
	@RequestMapping("/showEmpInfo")
	public String showEmpInfo() {
		
		return "admin/empInfo";
	}
	
	@RequestMapping("/ajax_showEmpInfo/{pn}")
	@ResponseBody
	public CommonMsg ajax_showEmpInfo(@PathVariable(value="pn")int pn, String findByName, String state) {
		//每页显示5条数据
		PageHelper.startPage(pn, 5);
		List<userEntity> userLsit;
		userLsit = loginService.findAllEmployees();
		
/*		if(state.equals(UserState.All.getState())) {
			 userLsit = loginService.findByName(findByName);
		}else {
			 userLsit = loginService.findByNameAndState(findByName, state);
		}*/
			//分页底栏为3
			PageInfo pageInfo = new PageInfo(userLsit, 3);
			return CommonMsg.success().add("list", pageInfo);
	}
	
	/**
	 * 员工id找员工
	 */
	@RequestMapping(value="/getPerEmps/{id}", method=RequestMethod.GET)
	@ResponseBody
	public CommonMsg getPerEmps(@PathVariable(value="id")int id) {
		userEntity entity = loginService.findById(id);
		return CommonMsg.success().add("list", entity);
	}
	
	/**
	 * 删除员工
	 */
	@RequestMapping("/delEmp")
	@ResponseBody
	public CommonMsg delEmp(userEntity entity) {
		userEntity fUser = new userEntity();
		if(entity.getUserId() != null) {
			fUser = loginService.findById(entity.getUserId());
			fUser.setRoleId(RoleState.OUTUER.getCode());
			fUser.setReason(entity.getReason());
			fUser.setParentId(0);
			fUser.setState(UserState.OUTJOB.getState());
		}
		
		loginService.update(fUser);
		return CommonMsg.success();
	}
	
	//跳转到培训管理页面
	@RequestMapping("/showTrainInfo")
	public String showTrainInfo() {
		
		return "admin/trainInfo";
	}
	
	//跳转到招聘管理页面
	@RequestMapping("/showInviterInfo")
	public String showInviterInfo() {
		
		return "admin/inviterManage";
	}
	
	//跳到简历管理界面
	@RequestMapping("/showResumeInfo")
	public String showResumeInfo() {
		
		return "admin/resumeManage";
	}
	
	/**
	 * 跳到奖惩页面
	 */
	@RequestMapping("/showRapInfo")
	public String showRapInfo() {
		
		return "admin/rapManage";
	}
	
	/**
	 * 跳转到薪资管理页面
	 */
	@RequestMapping("/showWageInfo")
	public String showWageInfo() {
		
		return "admin/wageManage";
	}
	
}











