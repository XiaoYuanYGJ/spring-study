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
 * spring-mvc控制器实例，配置@Controller控制器注解
 * 
 * @author exam-pc
 *
 */
@Controller
// @RestController // @Controller+@ResponseBody
public class ControllerDemo {

	/**
	 * @RequestMapping参数设置： 
	 * value：参数设置请求url地址；
	 * method：参数设置请求方式，通过RequestMethod中的枚举类型进行赋值；如：RequestMethod.GET
	 * produces：参数设置返回值类型和返回值编码格式，如json格式：application/json; charset=utf-8
	 * 完整实例：@RequestMapping(value="/test",method=RequestMethod.GET,produces="application/json; charset=utf-8")
	 */

	/**
	 * @RequestParam作用：获取请求参数
	 * 需要请求参数名和接受变量名一致；如：请求参数为name=张三，获取参数时@RequestParam String name
	 * 参数设置：
	 * value：参数名字，即入参的请求参数名字，如username表示请求的参数区中的名字为username的参数的值将传入；
	 * required：是否必须，默认是true，表示请求中一定要有相应的参数，否则将报404错误码；
     * defaultValue：默认值，表示如果请求中没有同名参数时的默认值
	 * 完整实例：@RequestParam(value="username",required=true,defaultValue="张三") String username
	 */
	
	/**
	 * @ResponseBody：响应内容；用在方法上或方法返回参数前
	 * 完整实例：public @ResponseBody Integer test(){return 1000;}
	 */
	
	/**
	 * @PathVariable：绑定URI模板变量值，可以用来映射获取URL中的占位符到目标方法的参数中
	 * 完整实例：@RequestMapping(value="/test-{name}")
	 * public void test(@PathVariable("name")String name){System.out.println("url参数值获取---》》》name:"+name);}
	 */
	
	/**
	 * @DateTimeFormat：日期格式化注解
	 * 参数设置：这里可以查看博客：https://www.cnblogs.com/ssslinppp/p/4600043.html
	 * iso：类型为DateTimeFormat.ISO;
	 * pattern：类型为String，使用自定义的时间格式化串，如"yyyy/mm/dd h:mm:ss"
	 * style：类型为String，通过样式指定日期时间的格式
	 * 完整实例：@DateTimeFormat(iso=ISO.DATE)Date time
	 */
	
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

		// 添加模型数据，用于展示在页面上
		model.addAttribute("message", "这是index方法带来的数据，可以使用ModelAndView对象，使用方式和request很相识");

		// 这里返回的是jsp页面的名字，用于拼接
		return "/test";
	}

	/**
	 * 显示数据至页面上，这里必须设置为GET请求，方式一
	 * 实例请求地址：http://localhost:8080/spring-demo/show-value-one
	 * @return
	 */
	@RequestMapping(value = "/show-value-one", method = RequestMethod.GET)
	@ResponseBody // @ResponseBody注解：将return的数据作为响应内容
	public List showValue() {

		// 创建list集合
		List list = new ArrayList();

		list.add("value值一");
		list.add("value值二");
		list.add("value值三");

		return list;
	}

	/**
	 * 显示数据至页面上，这里必须设置为GET请求，方式二
	 * 实例请求地址：http://localhost:8080/spring-demo/show-value-two
	 * @return
	 */
	@RequestMapping(value = "/show-value-two", method = RequestMethod.GET)
	// @ResponseBody注解：将return的数据作为响应内容
	public @ResponseBody List showValueTwo() {

		// 创建list集合
		List list = new ArrayList();

		list.add("方式二：value值一");
		list.add("方式二：value值二");
		list.add("方式二：value值三");

		return list;
	}

	/**
	 * 单个请求参数，不设置注解@RequestParam参数： 将请求时带的参数显示在页面上
	 * 实例请求地址：http://localhost:8080/spring-demo/show-param?value=参数
	 * 
	 * @return
	 */
	@RequestMapping(value = "/show-param", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public @ResponseBody String paramValue(@RequestParam String value) {

		return "这是请求过来的参数----》》》》" + value;
	}

	/**
	 * 多个请求参数，不设置注解@RequestParam参数：将请求时带的所有参数显示在页面上
	 * 实例请求地址：http://localhost:8080/spring-demo/show-param-two?value=2345&name=张三
	 * @param value
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/show-param-two", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public @ResponseBody String paramValueTwo(@RequestParam Integer value,@RequestParam String name){
		
		return "多个请求参数---》》》》value:"+value+",---》》》》name:"+name;
	}
	
	/**
	 * 多参数请求，并设置注解@RequestParam参数
	 * 实例请求地址：http://localhost:8080/spring-demo/show-param-three?password=ceshi
	 * @param name
	 * @param pwd
	 * @return
	 */
	@RequestMapping(value="/show-param-three", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public @ResponseBody String paramValueThree(@RequestParam(value="username",required=true,defaultValue="李四") String username,@RequestParam(value="password",required=false) String password){
		
		return "设置@RequestParam注解参数，请求参数username:"+username+"---》》》》password:"+password;
	}
	
	/**
	 * URI上参数获取
	 * 实例请求地址：
	 * @param number
	 * @param time
	 * @return
	 */
	@RequestMapping(value="/show-param-{number}/{time}", method = RequestMethod.GET , produces = "application/json; charset=UTF-8")
	public @ResponseBody String paramValueFour(@PathVariable("number")String number,@PathVariable("time") @DateTimeFormat(iso=ISO.DATE)Date time ){
		
		return "获取URI上占位符设置的参数，uri参数值number:"+number+"--->>>time:"+time;
	}
	
}
