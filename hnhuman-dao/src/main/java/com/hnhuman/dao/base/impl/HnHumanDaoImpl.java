package com.hnhuman.dao.base.impl;

import java.util.List;
import javax.persistence.LockModeType;
import com.hnhuman.dao.base.HnHumanDao;
import com.hnhuman.dao.utils.Filter;
import com.hnhuman.dao.utils.Order;
import com.hnhuman.dao.utils.Page;
import com.hnhuman.dao.utils.Pageable;
import com.hnhuman.entity.HnHuman;

public class HnHumanDaoImpl implements HnHumanDao  {
	
	@Override
	public HnHuman find(Long id, LockModeType lockModeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HnHuman> findList(Integer first, Integer count,
			List<Filter> filters, List<Order> orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<HnHuman> findPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Filter... filters) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void persist(HnHuman entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HnHuman merge(HnHuman entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(HnHuman entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh(HnHuman entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh(HnHuman entity, LockModeType lockModeType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getIdentifier(HnHuman entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isManaged(HnHuman entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void detach(HnHuman entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lock(HnHuman entity, LockModeType lockModeType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HnHuman find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
