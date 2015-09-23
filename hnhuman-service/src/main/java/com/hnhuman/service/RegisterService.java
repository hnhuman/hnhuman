package com.hnhuman.service;
/**
 * Service - 注册
 * 
 * @author candy.tam
 *
 */
public interface RegisterService {
	/**
	 * 注册
	 * @param mobile
	 * @param password
	 * @param smCode
	 * @return 0. 服务器内部错误 , 1. 成功 , 2. 该手机已经注册 , 3. 手机短信已经失效 
	 */
	public int register(String mobile , String password , String smsCode);
}
