package com.javaketang.entity;

/**
 * 学生
 * 
 * @author yuanguangjie
 *
 */
public class Student {

	private Integer id;
	private String name;
	private Integer sex; // 性别：1/男、2/女
	private String text;

	public Student() {

	}

	public Student(Integer id, String name, Integer sex, String text) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.text = text;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
