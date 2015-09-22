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
import com.hnhuman.service.HumanService;
import com.hnhuman.service.RSAService;

/**
 * Controller - 注册
 * 
 * @author candy.tam
 *
 */
@Controller("registerController")
public class RegisterController {
	
	@Resource(name="rsaServiceImpl")
	RSAService rsaService;
	@Resource(name="humanServiceImpl")
	HumanService HumanService;

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
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Message submit(String username , String smCode , 
			HttpServletRequest request, HttpServletResponse response, HttpSession session){
		String password = rsaService.decryptParameter("enPassword", request);
		rsaService.removePrivateKey(request);
		return Message.success("注册成功");
	}
}
