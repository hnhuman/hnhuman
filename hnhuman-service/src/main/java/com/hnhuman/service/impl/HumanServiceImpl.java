package com.hnhuman.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hnhuman.dao.base.HumanDao;
import com.hnhuman.entity.Human;
import com.hnhuman.service.HumanService;

@Service("humanServiceImpl")
public class HumanServiceImpl extends BaseServiceImpl<Human, Long> implements HumanService {

	@Resource(name="humanDaoImpl") 
	HumanDao hnHumanDao;

	@Override
	public boolean isExitsMobile(String mobile) {
		return false;
	}
	
}
