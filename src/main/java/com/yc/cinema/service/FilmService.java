package com.yc.cinema.service;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;

public interface FilmService {

	List<FilmInfo> getFilmByFilmBean(FilmBean filmBean);

	int addFilm(FilmBean filmBean);
}
