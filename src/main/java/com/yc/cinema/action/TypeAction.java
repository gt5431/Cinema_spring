package com.yc.cinema.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;

@Controller("typeAction")
public class TypeAction {
	
	@Autowired
	private TypeService typeService;
	
	private List<FilmType> filmTypes; // 响应数据

	public List<FilmType> getFilmTypes() {
		return filmTypes;
	}

	// struts json 插件处理异步请求，处理与正常请求一样
	public String getTypes() {
		filmTypes = typeService.getTypes(); // 响应数据
		return "success";
	}

}
