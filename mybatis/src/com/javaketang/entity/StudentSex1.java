package com.javaketang.entity;

import java.util.Date;

/**
 * Ůѧ��
 * @author yuanguangjie
 *
 */
public class StudentSex1 {

	private Integer id;
	private Integer stuId;
	private Date date;
	private String xin;
	private String gan;
	private String pi;
	private String fei;
	private String shen;
	private String zigong;
	private String text;

	public StudentSex1() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getXin() {
		return xin;
	}

	public void setXin(String xin) {
		this.xin = xin;
	}

	public String getGan() {
		return gan;
	}

	public void setGan(String gan) {
		this.gan = gan;
	}

	public String getPi() {
		return pi;
	}

	public void setPi(String pi) {
		this.pi = pi;
	}

	public String getFei() {
		return fei;
	}

	public void setFei(String fei) {
		this.fei = fei;
	}

	public String getShen() {
		return shen;
	}

	public void setShen(String shen) {
		this.shen = shen;
	}

	public String getZigong() {
		return zigong;
	}

	public void setZigong(String zigong) {
		this.zigong = zigong;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public StudentSex1(Integer id, Integer stuId, Date date, String xin, String gan, String pi, String fei, String shen,
			String zigong, String text) {
		super();
		this.id = id;
		this.stuId = stuId;
		this.date = date;
		this.xin = xin;
		this.gan = gan;
		this.pi = pi;
		this.fei = fei;
		this.shen = shen;
		this.zigong = zigong;
		this.text = text;
	}

}
