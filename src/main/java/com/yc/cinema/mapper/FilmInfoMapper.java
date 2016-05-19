package com.yc.cinema.mapper;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;

public interface FilmInfoMapper {

	List<FilmInfo> getAllFileInfo();

	List<FilmInfo> getFilmByFilmBean(FilmBean filmbean);

	int insertFilmInfo(FilmBean filmbean);
}