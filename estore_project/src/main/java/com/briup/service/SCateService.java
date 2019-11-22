package com.briup.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.SCate;
import com.briup.dao.mapperInterface.SCateMapper;

public class SCateService {
	public List<SCate> selectAllSCate(){
		 SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
			
			SCateMapper mapper = sqlSession.getMapper(SCateMapper.class);
			List<SCate> listCate = mapper.selectAllSCate();
			return listCate;
	}
	
	public SCate selcetSCateByid(int id){
		 SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
			
			SCateMapper mapper = sqlSession.getMapper(SCateMapper.class);
			SCate sCate = mapper.selcetSCateByid(id);
			return sCate;
	}
	
}
