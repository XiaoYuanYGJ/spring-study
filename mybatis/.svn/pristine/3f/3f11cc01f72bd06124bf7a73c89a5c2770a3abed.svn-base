package com.javaketang.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 数据源获取帮助类
 * 
 * @author yuanguangjie
 *
 */
public class DBUtils {

	// 用于获取sqlSession工厂
	public static SqlSessionFactory getSessionFactory() {

		// 获取mybatis配置文件流
		InputStream is = DBUtils.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

		// 根据mybatis配置文件流获取SQLSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		return factory;

	}

	public static SqlSession getSqlSession() {
		
		SqlSession session = DBUtils.getSessionFactory().openSession();

		return session;

	}

}
