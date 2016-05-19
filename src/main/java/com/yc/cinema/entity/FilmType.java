package com.yc.cinema.entity;

import java.io.Serializable;

public class FilmType implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer typeid;

	private String typename;

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename == null ? null : typename.trim();
	}

	@Override
	public String toString() {
		return "\nFilmType [typeid=" + typeid + ", typename=" + typename + "]";
	}
	
	
}