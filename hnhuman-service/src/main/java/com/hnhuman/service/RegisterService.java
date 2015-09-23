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
	 */
	public void register(String mobile , String password , String smsCode);
}
