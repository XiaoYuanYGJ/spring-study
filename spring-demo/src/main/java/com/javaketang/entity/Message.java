package com.javaketang.entity;

/**
 * 信息类
 * @author exam-pc
 *
 */
public class Message {
	// 信息内容
	private String message;
	
	// 自动id
	private Integer id;
	
	// 进制码
	private double quaternaryCode;

	// 状态
	private boolean state;
	
	// 结果
	private String reuslt;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getQuaternaryCode() {
		return quaternaryCode;
	}

	public void setQuaternaryCode(double quaternaryCode) {
		this.quaternaryCode = quaternaryCode;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getReuslt() {
		return reuslt;
	}

	public void setReuslt(String reuslt) {
		this.reuslt = reuslt;
	}
	
	
	
}
