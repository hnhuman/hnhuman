package com.hnhuman.dao.base.impl;

import org.springframework.stereotype.Repository;
import com.hnhuman.dao.base.HumanDao;
import com.hnhuman.entity.Human;

@Repository("humanDaoImpl")
public class HumanDaoImpl extends BaseDaoImpl<Human, Long> implements HumanDao {
	
}
