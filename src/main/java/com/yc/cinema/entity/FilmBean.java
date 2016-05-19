package com.yc.cinema.entity;

import java.io.Serializable;

public class FilmBean implements Serializable {

	private static final long serialVersionUID = 5110613206909676175L;

	private Integer filmid;

	private String filmname;

	private String typeid;

	private String actor;

	private String director;
	private Double ticketprice;
	private Double minticketprice;
	private Double maxticketprice;

	public Double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}

	public Integer getFilmid() {
		return filmid;
	}

	public void setFilmid(Integer filmid) {
		this.filmid = filmid;
	}

	public String getFilmname() {
		return filmname;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public String getTypeid() {
		return typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Double getMinticketprice() {
		return minticketprice;
	}

	public void setMinticketprice(Double minticketprice) {
		this.minticketprice = minticketprice;
	}

	public Double getMaxticketprice() {
		return maxticketprice;
	}

	public void setMaxticketprice(Double maxticketprice) {
		this.maxticketprice = maxticketprice;
	}

	public FilmBean() {

	}

	public FilmBean(String filmname, String typeid, String actor,
			String director, Double ticketprice) {
		this.filmname = filmname;
		this.typeid = typeid;
		this.actor = actor;
		this.director = director;
		this.ticketprice = ticketprice;
	}

	public FilmBean(Integer filmid, String filmname, String typeid,
			String actor, String director, Double minticketprice,
			Double maxticketprice, Double ticketprice) {
		this.filmid = filmid;
		this.filmname = filmname;
		this.typeid = typeid;
		this.actor = actor;
		this.director = director;
		this.minticketprice = minticketprice;
		this.maxticketprice = maxticketprice;
		this.ticketprice = ticketprice;
	}

	@Override
	public String toString() {
		return "FilmBean [filmid=" + filmid + ", filmname=" + filmname
				+ ", typeid=" + typeid + ", actor=" + actor + ", director="
				+ director + ", ticketprice=" + ticketprice
				+ ", minticketprice=" + minticketprice + ", maxticketprice="
				+ maxticketprice + "]";
	}

}
