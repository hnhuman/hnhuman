package com.hnhuman.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hnhuman.dao.base.HumanDao;
import com.hnhuman.service.HumanService;

@Service("humanServiceImpl")
public class HumanServiceImpl implements HumanService {

	@Resource(name="humanDaoImpl") 
	HumanDao hnHumanDao;

	@Override
	public void find(Long id) {
		hnHumanDao.find(id);
	}
	
}
