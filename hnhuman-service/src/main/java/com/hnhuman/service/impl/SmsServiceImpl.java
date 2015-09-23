package com.hnhuman.service.impl;

import org.springframework.stereotype.Service;

import com.hnhuman.service.SmsService;

@Service("smsServiceImpl")
public class SmsServiceImpl implements SmsService{

	@Override
	public boolean checkValid(String mobile, String smsCode) {
		return true;
	}

}
