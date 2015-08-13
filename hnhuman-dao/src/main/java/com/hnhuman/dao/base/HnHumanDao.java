package com.hnhuman.dao.base;

import com.hnhuman.entity.HnHuman;

public interface HnHumanDao extends BaseDao<HnHuman, Long>{

	public HnHuman find(Long id);
}
