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
 * API����ʽ����;��������ʱ����
 * @author exam-pc
 *
 */
public class Config extends JFinalConfig{

	/**
	 * ��������jfinal����ֵ�������ÿ���ģʽdevMode�����ã��ڿ���ģʽ�£�jfinal���ÿ������������棬���
	 * �����url��controller��method�Լ�����Ĳ���
	 */
	public void configConstant(Constants con) {
		// TODO Auto-generated method stub
		
		System.out.println("jfinal������ʼ���á���������������");
		
		// ʹ��propkit����base_config���������ļ���ʹ��PropKit.get(...)��ȡֵ
		PropKit.use("base_config.txt");
		
		// ���ÿ���ģʽ����
		con.setDevMode(PropKit.getBoolean("devMode"));
	}

	/**
	 * ����ͨ��ҳ��ģ��
	 */
	public void configEngine(Engine arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ���ô����� 
	 */
	public void configHandler(Handlers hand) {
		// TODO Auto-generated method stub

	}

	/**
	 * ����������
	 */
	public void configInterceptor(Interceptors inter) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ���ò��
	 */
	public void configPlugin(Plugins plug) {
		// ����c3p0���ݿ����ӳز��
		DruidPlugin druid  = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"),PropKit.get(""));
		plug.add(druid);
		
		// ����ActiveRecord���ݿ���ʲ��
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druid);
		
		plug.add(arp);
	}

	/**
	 * ���÷���·��
	 */
	public void configRoute(Routes routes) {
		// TODO Auto-generated method stub
		// ���ÿ�����ӳ����ͼ·��������������Ϊ��controller����ͼ���·��
		routes.add("/", DemoController.class, "view/demo");
 	}
	
}
