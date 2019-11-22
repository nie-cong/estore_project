package com.briup.dao.mapperInterface;


import java.util.List;
import java.util.Map;

import com.briup.bean.SUser;

public interface SUserMapper {
    
    void insertUser(SUser user);
    SUser selectUserByName(String name);
    List<String> selectAllUserName();
    Map<String,String> selectAllUsernameAndPassword();
    String selectPasswordByName(String username);
}