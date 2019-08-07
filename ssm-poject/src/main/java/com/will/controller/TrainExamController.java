package com.will.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.will.model.TrainExamEntity;
import com.will.model.TrainGradeEntity;
import com.will.model.userEntity;
import com.will.service.TrainExamService;
import com.will.service.TrainGrageService;
import com.will.utils.CommonMsg;

/**
* create by: william on 2018年10月13日
* 
* 类说明:试题操作
*/
@Controller
@RequestMapping("/trainExam")
public class TrainExamController {
	@Autowired
	private TrainExamService trainExamService;
	@Autowired
	private TrainGrageService trainGradeService;
	
	/**
	 * 发试卷（选题）
	 */
	@RequestMapping("/sendTrainExam")
	@ResponseBody
	public CommonMsg sendTrainExam(@RequestParam(value="trainId")int trainId) {
		//随机找出10道没有发过的题
		List<TrainExamEntity> teList = trainExamService.findExamNoTrainId();
		if(teList.size() == 5) {
			for (TrainExamEntity trainExamEntity : teList) {
				trainExamEntity.setTrainId(trainId);
				trainExamService.update(trainExamEntity);
			}
		}
		return CommonMsg.success().add("teCount", teList.size());
	}
	
	/**
	 * 判断是否有发试题
	 */
	@RequestMapping("/ifSendExam/{trainId}")
	@ResponseBody
	public CommonMsg ifSendExam(@PathVariable(value="trainId")int trainId) {
		List<TrainExamEntity> teList = trainExamService.findExamByTrainId(trainId);
		if(teList.size() != 0) {
			return CommonMsg.success().add("teList", teList);
		}
		return CommonMsg.fail();
	}
	
	/**
	 * 提交成绩单
	 */
	@RequestMapping("/updateTrainGrade/{trainId}")
	@ResponseBody
	public CommonMsg updateTrainGrade(@PathVariable(value="trainId")int trainId,
			HttpSession session, int grade) {
		userEntity user = (userEntity)session.getAttribute("user");
		TrainGradeEntity tgEntity = new TrainGradeEntity();
		tgEntity.setUserId(user.getUserId());
		tgEntity.setTrainId(trainId);
		tgEntity.setGrade(grade);
		trainGradeService.save(tgEntity);
		
		return CommonMsg.success();
	}
	
}














