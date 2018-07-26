package com.javaketang.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseDao<T> {

	int add(@Param("item")T t);// 添加

	int update(@Param("item")T t);// 修改

	int delete(@Param("item")Integer id);// 删除

	List<T> query();// 查询所有

}
