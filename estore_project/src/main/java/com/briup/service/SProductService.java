package com.briup.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.SProduct;
import com.briup.dao.mapperInterface.SProductMapper;

public class SProductService {
		public List<SProduct> selectAllProduct(){
			 SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
				
				SProductMapper mapper = sqlSession.getMapper(SProductMapper.class);
				List<SProduct> list = mapper.selectAllProduct();
				return list;
		}
		public SProduct selectProductById(int id){
			 SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
				
				SProductMapper mapper = sqlSession.getMapper(SProductMapper.class);
				SProduct sp = mapper.selectProductById(id);
				return sp;
				
				
		}
		
}
