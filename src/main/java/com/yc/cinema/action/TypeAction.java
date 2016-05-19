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
	
	private List<FilmType> filmTypes; // ��Ӧ����

	public List<FilmType> getFilmTypes() {
		return filmTypes;
	}

	// struts json ��������첽���󣬴�������������һ��
	public String getTypes() {
		filmTypes = typeService.getTypes(); // ��Ӧ����
		return "success";
	}

}
