package com.hnhuman.service;
/**
 * SERVICE - 短信
 * 
 * @author candy.tam
 *
 */
public interface SmsService {

	/**
	 * 检查短信是否有效
	 * @param mobile
	 * @param smsCode
	 * @return true 有效 , false 无效
	 */
	public boolean checkValid(String mobile ,String smsCode);
}
