package com.javaketang.dao;

import java.util.List;
import java.util.Map;

import com.javaketang.base.dao.BaseDao;
import com.javaketang.entity.Student;

public interface StudentDao extends BaseDao<Student> {

	// ��ȡѧ��������Ϣ��������ѯ
	List<Map> studentInfo();

	// ��ȡѧ��������Ϣ��ӳ���װ
	List<Map> studentInfoTwo();
	
	
}