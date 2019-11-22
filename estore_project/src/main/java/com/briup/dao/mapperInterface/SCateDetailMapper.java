package com.briup.dao.mapperInterface;

import java.util.List;

import com.briup.bean.SCateDetail;

public interface SCateDetailMapper {
	List<SCateDetail> selectAllCateDetail();
	int selectScateIdBYid(Long id);
}