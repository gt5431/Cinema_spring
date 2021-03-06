package com.yc.cinema.serviceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;
@ContextConfiguration("classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TypeServiceImplTest {
	
	@Autowired
	private TypeService typeService;
	
	@Test
	public void testGetTypes() {
		List<FilmType> types = typeService.getTypes();
		System.out.println(types);
		assertNotNull(types);
	}

}
