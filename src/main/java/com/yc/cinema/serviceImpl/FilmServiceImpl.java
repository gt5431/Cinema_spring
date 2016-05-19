package com.yc.cinema.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.mapper.FilmInfoMapper;
import com.yc.cinema.service.FilmService;
@Service("filmService")
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmInfoMapper filmInfoMapper;

	@Override
	public List<FilmInfo> getFilmByFilmBean(FilmBean filmBean) {
		List<FilmInfo> filminfo = filmInfoMapper.getFilmByFilmBean(filmBean);
		return filminfo;
	}

	@Override
	public int addFilm(FilmBean filmBean) {
		int result = filmInfoMapper.insertFilmInfo(filmBean);
		return result;
	}

}
