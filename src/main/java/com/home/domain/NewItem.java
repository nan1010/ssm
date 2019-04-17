package com.home.domain;

import java.io.Serializable;

public class NewItem implements Serializable {
    private Integer newitemid;

    private String newitemkind;

    private String newitemimage;

    private String newitemname;
    
    

    private static final long serialVersionUID = 1L;

	public Integer getNewitemid() {
		return newitemid;
	}

	public void setNewitemid(Integer newitemid) {
		this.newitemid = newitemid;
	}

	public String getNewitemkind() {
		return newitemkind;
	}

	public void setNewitemkind(String newitemkind) {
		this.newitemkind = newitemkind;
	}

	public String getNewitemimage() {
		return newitemimage;
	}

	public void setNewitemimage(String newitemimage) {
		this.newitemimage = newitemimage;
	}

	public String getNewitemname() {
		return newitemname;
	}

	public void setNewitemname(String newitemname) {
		this.newitemname = newitemname;
	}
   
}