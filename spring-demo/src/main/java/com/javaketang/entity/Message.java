package com.javaketang.entity;

/**
 * ��Ϣ��
 * @author exam-pc
 *
 */
public class Message {
	// ��Ϣ����
	private String message;
	
	// �Զ�id
	private Integer id;
	
	// ������
	private double quaternaryCode;

	// ״̬
	private boolean state;
	
	// ���
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
