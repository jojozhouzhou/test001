package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
@Controller
@RequestMapping("shw")
public class TestController  {

	@RequestMapping("one")
	public String one(){
		System.out.println("�����һ������");
		return "/show";
	}
	@RequestMapping("/shw/two")
	public String two(){
		System.out.println("����ڶ�������");
		return "/show";
	}
	@RequestMapping("three")
	public String three(){
		System.out.println("�������������");
		return "/show";
	}
	@RequestMapping(params="method=four")
	public String four(){
		System.out.println("������ĸ�����");
		return "/show";
	}
	
	@RequestMapping(params="method=four")
	public String five(){
		System.out.println("������������");
		return "/show";
	}
	//@RequestMapping(value="five",method=RequestMethod.POST)
	//@RequestMapping(value="five",method=RequestMethod.GET)
	@RequestMapping(value="five",method={RequestMethod.POST,RequestMethod.GET})
	public String fifth(){
		System.out.println("������������");
		return "/show";
	}
}
