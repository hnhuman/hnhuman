package com.hnhuman.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hnhuman.dao.base.HumanDao;
import com.hnhuman.entity.Human;
import com.hnhuman.entity.Human.Gender;
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
	@Resource(name="humanDaoImpl")
	HumanDao humanDao;
	@Resource(name="smsServiceImpl")
	SmsService smsService;

	@Override
	public void register(String mobile, String password, String smsCode) {
		if(smsService.checkValid(mobile, smsCode)){
			Human human = new Human();
			human.setCreateDate(new Date());
			human.setMobile(mobile);
			human.setGender(Gender.MAN);
			humanDao.persist(human);
		}
	}

}
