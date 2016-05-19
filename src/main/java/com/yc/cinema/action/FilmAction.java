package com.yc.cinema.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.service.FilmService;

public class FilmAction implements ModelDriven<FilmBean>, SessionAware {
	
	@Autowired
	private FilmService filmService;
	
	private FilmBean filmBean;
	private Map<String, Object> session;

	public String search() {
		List<FilmInfo> films = filmService.getFilmByFilmBean(filmBean);
		session.put("films", films);
		return "success";
	}

	public String add() {
		int result = filmService.addFilm(filmBean);
		if (1 == result) {
			return "success";
		}
		return "fail";
	}

	@Override
	public FilmBean getModel() {
		filmBean = new FilmBean();
		return filmBean;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
