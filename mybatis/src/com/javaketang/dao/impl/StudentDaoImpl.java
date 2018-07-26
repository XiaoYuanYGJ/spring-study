package com.javaketang.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.javaketang.dao.StudentDao;
import com.javaketang.entity.Student;
import com.javaketang.util.DBUtils;

import net.sf.json.JSONArray;

public class StudentDaoImpl implements StudentDao {

	// 连表方式mapper命名空间
	private String nameSpace = "studentSpace.";

	// 映射方式mapper命名空间
	private String nameSpaceTwo = "studentSpaceTwo.";

	@Override
	public int add(Student t) {
		int line = 0;

		try {
			SqlSession session = DBUtils.getSqlSession();

			line = session.insert(nameSpace + "add", t);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return line;
	}

	@Override
	public int update(Student t) {

		int line = 0;

		try {
			SqlSession session = DBUtils.getSqlSession();

			line = session.insert(nameSpace + "update", t);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return line;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> studentInfo() {

		List<Map> list = null;

		try {
			SqlSession session = DBUtils.getSqlSession();

			list = session.selectList(nameSpace + "info");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map> studentInfoTwo() {
		List<Map> list = null;

		try {
			SqlSession session = DBUtils.getSqlSession();

			list = session.selectList(nameSpaceTwo + "query_student");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

}
