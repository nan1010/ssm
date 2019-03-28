package com.home.domain;

import java.sql.Time;

public class Order {
	private int id;
	
	private int userid;
	
	private Time createDate;
	
	private String note;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Time getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Time createDate) {
		this.createDate = createDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
