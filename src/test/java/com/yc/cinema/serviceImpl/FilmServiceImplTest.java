package com.yc.cinema.serviceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.service.FilmService;
@ContextConfiguration("classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FilmServiceImplTest {
	
	@Autowired
	private FilmService fs;
	
	@Test
	public void testGetFilmByFilmBean() {
		FilmBean filmbean = new FilmBean();
		List<FilmInfo> list = fs.getFilmByFilmBean(filmbean);
		System.out.println(list);
		assertNotNull("没有找到数据", list);
	}

}
