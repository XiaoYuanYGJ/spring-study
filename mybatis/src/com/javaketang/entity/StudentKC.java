package com.javaketang.entity;

/**
 * 
 * @author yuanguangjie
 *
 */
public class StudentKC {

	private Integer kcId;
	private String kcName;
	private String text;

	public StudentKC() {

	}

	public StudentKC(Integer kcId, String kcName, String text) {
		this.kcId = kcId;
		this.kcName = kcName;
		this.text = text;
	}

	public Integer getkcId() {
		return kcId;
	}

	public void setkcId(Integer kcId) {
		this.kcId = kcId;
	}

	public String getkcName() {
		return kcName;
	}

	public void setkcName(String kcName) {
		this.kcName = kcName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
