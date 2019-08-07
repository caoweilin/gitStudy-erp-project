package com.will.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.will.model.ResumeFlowEntity;
import com.will.model.WageFlowEntity;
import com.will.service.WageFlowService;
import com.will.utils.CommonMsg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
* create by: william on 2018年10月10日
* 
* 类说明:工资复议流程
*/

@Controller
@RequestMapping("/wageFlow")
public class WageFlowCntroller {
	@Autowired
	private WageFlowService wageFlowServce;
	
	@RequestMapping(value="/getFlowData/{id}", method=RequestMethod.GET)
	@ResponseBody
	public CommonMsg getFlowData(@PathVariable(value="id")int id) {
		List<WageFlowEntity> wfList = wageFlowServce.findByWageId(id);
		
		return CommonMsg.success().add("wfList", wfList);
	}

}










