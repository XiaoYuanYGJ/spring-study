package com.javaketang.test;

import java.util.List;
import java.util.Map;

import com.javaketang.dao.StudentDao;
import com.javaketang.dao.impl.StudentDaoImpl;

import net.sf.json.JSONArray;

public class Test {

	public static void main(String[] args) {

		// ����ѧ��dao��
		StudentDao studentDao = new StudentDaoImpl();

		// ���������ѯӳ����Ľ����
		List<Map> list = studentDao.studentInfo();

		// ���ݹ���ӳ����Ľ����
		List<Map> list_two = studentDao.studentInfoTwo();

		System.out.println("�����ѯӳ����Ľ����----->>>>>" + JSONArray.fromObject(list));

		System.out.println("����ӳ����Ľ����--->>>>>" + JSONArray.fromObject(list_two));

	}

}
