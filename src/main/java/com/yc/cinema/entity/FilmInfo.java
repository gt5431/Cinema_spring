package com.yc.cinema.entity;

import java.io.Serializable;

public class FilmInfo implements Serializable {

	private static final long serialVersionUID = 5302788065310348032L;

	private Integer filmid;

	private String filmname;

	private FilmType type;

	private String actor;

	private String director;

	private Double ticketprice;

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

	public FilmType getType() {
		return type;
	}

	public void setType(FilmType type) {
		this.type = type;
	}

	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
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

	public double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}

	public FilmInfo(Integer filmid, String filmname, FilmType type,
			String actor, String director, double ticketprice) {
		this.filmid = filmid;
		this.filmname = filmname;
		this.type = type;
		this.actor = actor;
		this.director = director;
		this.ticketprice = ticketprice;
	}

	public FilmInfo() {

	}

	@Override
	public String toString() {
		return "\nFilmInfo [filmid=" + filmid + ", filmname=" + filmname
				+ ", type=" + type + ", actor=" + actor + ", director="
				+ director + ", ticketprice=" + ticketprice + "]";
	}

}