package com.hnhuman.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.hnhuman.entity.Human;
import com.hnhuman.entity.Human.Gender;
import com.hnhuman.entity.ext.ReturnCode;
import com.hnhuman.entity.ext.ReturnCode.Register;
import com.hnhuman.service.HumanService;
import com.hnhuman.service.RegisterService;
import com.hnhuman.service.SmsService;

/**
 * Service - 注册
 * 
 * @author candy.tam
 *
 */
@Service("registerServiceImpl")
public class RegisterServiceImpl implements RegisterService{
	@Resource(name="humanServiceImpl")
	HumanService humanService;
	@Resource(name="smsServiceImpl")
	SmsService smsService;

	@Override
	public int register(String mobile, String password, String smsCode) {
		if(!smsService.checkValid(mobile, smsCode)){
			return Register.SMSCODE_ERROR_CODE_1;
		}
		if(StringUtils.isEmpty(mobile)){
			return Register.MOBILE_ERROR_CODE_1;
		}
		if(humanService.isExitsMobile(mobile)){
			return Register.MOBILE_ERROR_CODE_2;
		}
		Human human = new Human();
		human.setCreateDate(new Date());
		human.setMobile(mobile);
		human.setGender(Gender.MAN);
		humanService.save(human);
		return ReturnCode.SUCCESS_CODE;
	}

}
