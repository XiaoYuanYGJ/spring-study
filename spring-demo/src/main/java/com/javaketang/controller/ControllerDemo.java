package com.javaketang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-mvc������ʵ��������@Controller������ע��
 * 
 * @author exam-pc
 *
 */
@Controller
//@RestController   // @Controller+@ResponseBody
public class ControllerDemo {

	/**
	 * ���÷���/index��ַʱ�����ص�test.jspҳ����
	 * 
	 * @param model
	 *            ʹ��ģ���࣬���ú�request��һ��
	 * @return
	 */
	// @GetMapping/@PostMapping/@DeleteMapping�������������ע��
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", "����index�������������ݣ�����ʹ��ModelAndView����ʹ�÷�ʽ��request����ʶ");
		
		return "/test";
	}

}
