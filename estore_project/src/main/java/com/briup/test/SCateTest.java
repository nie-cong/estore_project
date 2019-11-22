package com.briup.test;

import java.util.List;

import com.briup.bean.SCate;
import com.briup.service.SCateService;

public class SCateTest {
public static void main(String[] args) {
	SCateService service = new SCateService();
	List<SCate> list = service.selectAllSCate();
	System.out.println(list);
}
}
