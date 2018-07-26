package com.javaketang.test;

import java.util.List;
import java.util.Map;

import com.javaketang.dao.StudentDao;
import com.javaketang.dao.impl.StudentDaoImpl;

import net.sf.json.JSONArray;

public class Test {

	public static void main(String[] args) {

		// 创建学生dao层
		StudentDao studentDao = new StudentDaoImpl();

		// 根据连表查询映射出的结果集
		List<Map> list = studentDao.studentInfo();

		// 根据关联映射出的结果集
		List<Map> list_two = studentDao.studentInfoTwo();

		System.out.println("连表查询映射出的结果集----->>>>>" + JSONArray.fromObject(list));

		System.out.println("关联映射出的结果集--->>>>>" + JSONArray.fromObject(list_two));

	}

}
