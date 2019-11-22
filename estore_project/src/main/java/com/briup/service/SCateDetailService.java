package com.briup.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.SCateDetail;
import com.briup.dao.mapperInterface.SCateDetailMapper;

public class SCateDetailService {
public List<SCateDetail> selectSCateDetail(){
	
	 SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		
		SCateDetailMapper mapper = sqlSession.getMapper(SCateDetailMapper.class);
		List<SCateDetail> list = mapper.selectAllCateDetail();
		return list;
}
public int selectScateIdBYid(Long id){
	
	 SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		
		SCateDetailMapper mapper = sqlSession.getMapper(SCateDetailMapper.class);
		int scId = mapper.selectScateIdBYid(id);
		return scId;
}
}
