package com.javaketang.dao;

import java.util.List;
import java.util.Map;

import com.javaketang.base.dao.BaseDao;
import com.javaketang.entity.Student;

public interface StudentDao extends BaseDao<Student> {

	// 获取学生所有信息，连表查询
	List<Map> studentInfo();

	// 获取学生所有信息，映射封装
	List<Map> studentInfoTwo();
	
	
}
