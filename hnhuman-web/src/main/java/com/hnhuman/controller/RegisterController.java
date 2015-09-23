package com.hnhuman.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hnhuman.entity.Human.Gender;
import com.hnhuman.entity.ext.Message;
import com.hnhuman.entity.ext.ReturnCode;
import com.hnhuman.entity.ext.ReturnCode.Register;
import com.hnhuman.service.RSAService;
import com.hnhuman.service.RegisterService;

/**
 * Controller - 注册
 * 
 * @author candy.tam
 *
 */
@Controller("registerController")
@RequestMapping("/register")
public class RegisterController {
	
	@Resource(name="rsaServiceImpl")
	RSAService rsaService;
	@Resource(name="registerServiceImpl")
	RegisterService registerService;
	
	/**
	 * 注册页面
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		model.addAttribute("genders", Gender.values());
		return "/view/register/index";
	}
	
	/**
	 * 提交注册信息
	 * @return
	 */
	@RequestMapping(value = "/submit.do" , method = RequestMethod.POST)
	@ResponseBody
	public Message submit(String mobile , String smsCode , 
			HttpServletRequest request, HttpServletResponse response, HttpSession session){
		String password = rsaService.decryptParameter("enPassword", request);
		rsaService.removePrivateKey(request);
		int result = registerService.register(mobile, password, smsCode);
		switch (result) {
			case ReturnCode.SUCCESS_CODE:
				return Message.success("注册成功");
			case Register.MOBILE_ERROR_CODE_1:
				return Message.error(Register.MOBILE_ERROR_MSG_1);
			case Register.MOBILE_ERROR_CODE_2:
				return Message.error(Register.MOBILE_ERROR_MSG_2);
			case Register.SMSCODE_ERROR_CODE_1:
				return Message.error(Register.SMSCODE_ERROR_MSG_1);
			default :
				return null;
		}
	}
}
