package com.hnhuman.dao.base.impl;

import org.springframework.stereotype.Repository;

import com.hnhuman.dao.base.HnHumanDao;
import com.hnhuman.entity.HnHuman;

@Repository("hnHumanDaoImpl")
public class HnHumanDaoImpl extends BaseDaoImpl<HnHuman, Long> implements HnHumanDao {
	
}
