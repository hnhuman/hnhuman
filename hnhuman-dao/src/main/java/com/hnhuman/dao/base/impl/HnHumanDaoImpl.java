package com.hnhuman.dao.base.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hnhuman.dao.base.HnHumanDao;
import com.hnhuman.entity.HnHuman;

public class HnHumanDaoImpl implements HnHumanDao  {
	
	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public void find(Long id) {
		entityManager.find(HnHuman.class, id);
	}
	
	
	
}
