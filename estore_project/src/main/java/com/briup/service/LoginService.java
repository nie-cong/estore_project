package com.briup.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.dao.mapperInterface.SUserMapper;

public class LoginService {
//	//查询所有用户名密码
//public Map<String, String> selectUsrnameAndPassword() {
//	
//	SqlSession sqlSession=null;
//	Map<String,String> map=null;
//	 InputStream inputStream=null;
//	try {
//		inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		sqlSession= sqlSessionFactory.openSession();
//		
//			SUserMapper mapper = sqlSession.getMapper(SUserMapper.class);
//			//获取用户名，看用户名是存在
//			map = mapper.selectAllUsernameAndPassword();
//			System.out.println(map);
//			
//	} catch (IOException e) {
//		e.printStackTrace();
//	} return map;
//}
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
