package com.briup.service;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.bean.SUser;
import com.briup.dao.mapperInterface.SUserMapper;



public class RegisterService {
	//通过名字查看用户是否存在
	public SUser existUser(String name) {
	SqlSession sqlSession=null;
	 SUser user=null;
	 
	 InputStream inputStream=null;
	try {
		inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession= sqlSessionFactory.openSession();
		
		//使用工厂创建sqlSession
//		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
//		sqlSession = MyBatisSqlSessionFactory.openSession();
		
			SUserMapper mapper = sqlSession.getMapper(SUserMapper.class);
			//获取用户名，看用户名是存在
			user = mapper.selectUserByName(name);
			
	} catch (IOException e) {
		e.printStackTrace();
	} return user;	
	}
	
	//插入用户
	public void addUser(SUser user) {
		SqlSession sqlSession=null;
		 
		 InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession= sqlSessionFactory.openSession();
			SUserMapper mapper = sqlSession.getMapper(SUserMapper.class);
			mapper.insertUser(user);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}
//			sqlSession = MyBatisSqlSessionFactory.openSession();
//				SUserMapper mapper = sqlSession.getMapper(SUserMapper.class);
//				 mapper.insertUser(user);
//				sqlSession.commit();
//		} 
}
	//通过用户名查密码
	public String  selectPasswordByUsername(String name) {
		
		SqlSession sqlSession=null;
		String passwordByName=null;
		 InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession= sqlSessionFactory.openSession();
			
				SUserMapper mapper = sqlSession.getMapper(SUserMapper.class);
				//获取用户名，看密码
			
				passwordByName = mapper.selectPasswordByName(name);
				
				
		} catch (IOException e) {
			e.printStackTrace();
		} return passwordByName;
	}
}
