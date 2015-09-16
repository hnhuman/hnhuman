package com.hnhuman.dao.base;

import com.hnhuman.entity.Human;

public interface HumanDao extends BaseDao<Human, Long>{

	public Human find(Long id);
}
