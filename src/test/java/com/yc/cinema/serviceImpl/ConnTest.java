package com.yc.cinema.serviceImpl;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnTest {

	@Test
	public void testConn() {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		DataSource dataSource = (DataSource) cxt.getBean("dataSource");
		try {
			Connection con = dataSource.getConnection();
			assertNotNull("成功",con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConn02() {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) cxt.getBean("sqlSessionFactory");
		try {
			Connection con = sqlSessionFactory.openSession(true).getConnection();
			assertNotNull("成功",con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
