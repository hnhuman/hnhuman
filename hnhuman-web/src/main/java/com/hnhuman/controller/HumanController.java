package com.hnhuman.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hnhuman.service.HumanService;

/**
 * Controller - 科技人
 * 
 * @author candy.tam
 *
 */
@Controller("humanController")
public class HumanController {
	
	@Resource(name="humanServiceImpl")
	HumanService humanService;

	@RequestMapping(value="list.do",method=RequestMethod.GET)
	public String list(){
		humanService.find(1L);
		return "index";
	}
}
