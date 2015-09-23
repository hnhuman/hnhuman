package com.hnhuman.entity.ext;
/**
 * Entity - 返回码
 * 
 * @author candy.tam
 *
 */
public class ReturnCode {
	
	// 成功
	public static final int SUCCESS_CODE = 100;
	// 失败
	public static final int ERROR_CODE = 200;

	/**
	 * 注册返回码
	 * @author candy.tam
	 *
	 */
	public class Register {
		/** 手机号为空 */
		public static final int MOBILE_ERROR_CODE_1 = 301;
		public static final String MOBILE_ERROR_MSG_1 = "手机号不能为空";
		
		/** 该手机已经被注册 */
		public static final int MOBILE_ERROR_CODE_2 = 302;
		public static final String MOBILE_ERROR_MSG_2 = "该手机已经被注册";
		
		/** 短信码失效 */
		public static final int SMSCODE_ERROR_CODE_1 = 401;
		public static final String SMSCODE_ERROR_MSG_1 = "短信码已经失效 ";
	}
}
