package com.javaketang.config;

import com.javaketang.controller.DemoController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

/**
 * API引导式配置;配置运行时环境
 * @author exam-pc
 *
 */
public class Config extends JFinalConfig{

	/**
	 * 用于配置jfinal常量值；如设置开发模式devMode的配置，在开发模式下，jfinal会对每次请求输出报告，输出
	 * 请求的url、controller、method以及请求的参数
	 */
	public void configConstant(Constants con) {
		// TODO Auto-generated method stub
		
		System.out.println("jfinal常量开始配置。。。。。。。。");
		
		// 使用propkit加载base_config基本配置文件，使用PropKit.get(...)获取值
		PropKit.use("base_config.txt");
		
		// 设置开发模式参数
		con.setDevMode(PropKit.getBoolean("devMode"));
	}

	/**
	 * 配置通用页面模板
	 */
	public void configEngine(Engine arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 配置处理器 
	 */
	public void configHandler(Handlers hand) {
		// TODO Auto-generated method stub

	}

	/**
	 * 配置拦截器
	 */
	public void configInterceptor(Interceptors inter) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins plug) {
		// 配置c3p0数据库连接池插件
		DruidPlugin druid  = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"),PropKit.get(""));
		plug.add(druid);
		
		// 配置ActiveRecord数据库访问插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druid);
		
		plug.add(arp);
	}

	/**
	 * 配置访问路径
	 */
	public void configRoute(Routes routes) {
		// TODO Auto-generated method stub
		// 配置控制器映射视图路径，第三个参数为该controller的视图存放路径
		routes.add("/", DemoController.class, "view/demo");
 	}
	
}
