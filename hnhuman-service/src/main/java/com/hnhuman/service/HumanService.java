package com.hnhuman.service;

import com.hnhuman.entity.Human;

public interface HumanService extends BaseService<Human, Long>{
	
	/**
	 * 手机号是否存在
	 * 
	 * @return true 存在, false 不存在
	 */
	public boolean isExitsMobile(String mobile);
}
