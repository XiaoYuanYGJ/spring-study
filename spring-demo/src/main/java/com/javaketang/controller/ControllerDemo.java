package com.javaketang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-mvc控制器实例，配置@Controller控制器注解
 * 
 * @author exam-pc
 *
 */
@Controller
//@RestController   // @Controller+@ResponseBody
public class ControllerDemo {

	/**
	 * 配置访问/index地址时，返回到test.jsp页面上
	 * 
	 * @param model
	 *            使用模型类，作用和request域一样
	 * @return
	 */
	// @GetMapping/@PostMapping/@DeleteMapping。。。。：组合注解
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", "这是index方法带来的数据，可以使用ModelAndView对象，使用方式和request很相识");
		
		return "/test";
	}

}
