package com.briup.dao.mapperInterface;

import java.util.List;

import com.briup.bean.SCate;

public interface SCateMapper {
	List<SCate> selectAllSCate();
	SCate selcetSCateByid(int id);
}