package com.hnhuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller - 科技人
 * 
 * @author candy.tam
 *
 */
@Controller("humanController")
public class HumanController {

	@RequestMapping(value="list.do",method=RequestMethod.GET)
	public String list(){
		return "index";
	}
}
