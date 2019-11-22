package com.briup.test;

import com.briup.bean.SUser;
import com.briup.service.RegisterService;

public class SUserTest {
public static void main(String[] args) {
	RegisterService service = new RegisterService();
	SUser user = service.existUser("nc");
	System.out.println(user);
}
}
