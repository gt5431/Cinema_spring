package com.yc.cinema.service;

import java.util.List;

import com.yc.cinema.entity.FilmType;

/**
 * 
 * @author gt
 *
 */
public interface TypeService {
	// 获取全部的类型
	List<FilmType> getTypes();
}