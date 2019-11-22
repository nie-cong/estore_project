package com.briup.dao.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.bean.SProduct;

public interface SProductMapper {
    List<SProduct> selectAllProduct();
    //id在index页面跳到viewBook页面时使用了带参
    SProduct selectProductById(@Param("id") Integer id);
}