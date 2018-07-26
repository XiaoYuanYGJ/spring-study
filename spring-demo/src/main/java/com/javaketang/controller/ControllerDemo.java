package com.javaketang.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-mvc������ʵ��������@Controller������ע��
 * 
 * @author exam-pc
 *
 */
@Controller
// @RestController // @Controller+@ResponseBody
public class ControllerDemo {

	/**
	 * @RequestMapping�������ã� 
	 * value��������������url��ַ��
	 * method��������������ʽ��ͨ��RequestMethod�е�ö�����ͽ��и�ֵ���磺RequestMethod.GET
	 * produces���������÷���ֵ���ͺͷ���ֵ�����ʽ����json��ʽ��application/json; charset=utf-8
	 * ����ʵ����@RequestMapping(value="/test",method=RequestMethod.GET,produces="application/json; charset=utf-8")
	 */

	/**
	 * @RequestParam���ã���ȡ�������
	 * ��Ҫ����������ͽ��ܱ�����һ�£��磺�������Ϊname=��������ȡ����ʱ@RequestParam String name
	 * �������ã�
	 * value���������֣�����ε�����������֣���username��ʾ����Ĳ������е�����Ϊusername�Ĳ�����ֵ�����룻
	 * required���Ƿ���룬Ĭ����true����ʾ������һ��Ҫ����Ӧ�Ĳ��������򽫱�404�����룻
     * defaultValue��Ĭ��ֵ����ʾ���������û��ͬ������ʱ��Ĭ��ֵ
	 * ����ʵ����@RequestParam(value="username",required=true,defaultValue="����") String username
	 */
	
	/**
	 * @ResponseBody����Ӧ���ݣ����ڷ����ϻ򷽷����ز���ǰ
	 * ����ʵ����public @ResponseBody Integer test(){return 1000;}
	 */
	
	/**
	 * @PathVariable����URIģ�����ֵ����������ӳ���ȡURL�е�ռλ����Ŀ�귽���Ĳ�����
	 * ����ʵ����@RequestMapping(value="/test-{name}")
	 * public void test(@PathVariable("name")String name){System.out.println("url����ֵ��ȡ---������name:"+name);}
	 */
	
	/**
	 * @DateTimeFormat�����ڸ�ʽ��ע��
	 * �������ã�������Բ鿴���ͣ�https://www.cnblogs.com/ssslinppp/p/4600043.html
	 * iso������ΪDateTimeFormat.ISO;
	 * pattern������ΪString��ʹ���Զ����ʱ���ʽ��������"yyyy/mm/dd h:mm:ss"
	 * style������ΪString��ͨ����ʽָ������ʱ��ĸ�ʽ
	 * ����ʵ����@DateTimeFormat(iso=ISO.DATE)Date time
	 */
	
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

		// ���ģ�����ݣ�����չʾ��ҳ����
		model.addAttribute("message", "����index�������������ݣ�����ʹ��ModelAndView����ʹ�÷�ʽ��request����ʶ");

		// ���ﷵ�ص���jspҳ������֣�����ƴ��
		return "/test";
	}

	/**
	 * ��ʾ������ҳ���ϣ������������ΪGET���󣬷�ʽһ
	 * ʵ�������ַ��http://localhost:8080/spring-demo/show-value-one
	 * @return
	 */
	@RequestMapping(value = "/show-value-one", method = RequestMethod.GET)
	@ResponseBody // @ResponseBodyע�⣺��return��������Ϊ��Ӧ����
	public List showValue() {

		// ����list����
		List list = new ArrayList();

		list.add("valueֵһ");
		list.add("valueֵ��");
		list.add("valueֵ��");

		return list;
	}

	/**
	 * ��ʾ������ҳ���ϣ������������ΪGET���󣬷�ʽ��
	 * ʵ�������ַ��http://localhost:8080/spring-demo/show-value-two
	 * @return
	 */
	@RequestMapping(value = "/show-value-two", method = RequestMethod.GET)
	// @ResponseBodyע�⣺��return��������Ϊ��Ӧ����
	public @ResponseBody List showValueTwo() {

		// ����list����
		List list = new ArrayList();

		list.add("��ʽ����valueֵһ");
		list.add("��ʽ����valueֵ��");
		list.add("��ʽ����valueֵ��");

		return list;
	}

	/**
	 * �������������������ע��@RequestParam������ ������ʱ���Ĳ�����ʾ��ҳ����
	 * ʵ�������ַ��http://localhost:8080/spring-demo/show-param?value=����
	 * 
	 * @return
	 */
	@RequestMapping(value = "/show-param", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public @ResponseBody String paramValue(@RequestParam String value) {

		return "������������Ĳ���----��������" + value;
	}

	/**
	 * ������������������ע��@RequestParam������������ʱ�������в�����ʾ��ҳ����
	 * ʵ�������ַ��http://localhost:8080/spring-demo/show-param-two?value=2345&name=����
	 * @param value
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/show-param-two", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public @ResponseBody String paramValueTwo(@RequestParam Integer value,@RequestParam String name){
		
		return "����������---��������value:"+value+",---��������name:"+name;
	}
	
	/**
	 * ��������󣬲�����ע��@RequestParam����
	 * ʵ�������ַ��http://localhost:8080/spring-demo/show-param-three?password=ceshi
	 * @param name
	 * @param pwd
	 * @return
	 */
	@RequestMapping(value="/show-param-three", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public @ResponseBody String paramValueThree(@RequestParam(value="username",required=true,defaultValue="����") String username,@RequestParam(value="password",required=false) String password){
		
		return "����@RequestParamע��������������username:"+username+"---��������password:"+password;
	}
	
	/**
	 * URI�ϲ�����ȡ
	 * ʵ�������ַ��
	 * @param number
	 * @param time
	 * @return
	 */
	@RequestMapping(value="/show-param-{number}/{time}", method = RequestMethod.GET , produces = "application/json; charset=UTF-8")
	public @ResponseBody String paramValueFour(@PathVariable("number")String number,@PathVariable("time") @DateTimeFormat(iso=ISO.DATE)Date time ){
		
		return "��ȡURI��ռλ�����õĲ�����uri����ֵnumber:"+number+"--->>>time:"+time;
	}
	
}
