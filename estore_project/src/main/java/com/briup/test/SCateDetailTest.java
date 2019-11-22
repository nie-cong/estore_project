package com.briup.test;

import java.util.List;

import com.briup.bean.SCateDetail;
import com.briup.service.SCateDetailService;

public class SCateDetailTest {
public static void main(String[] args) {
	SCateDetailService service = new SCateDetailService();
	List<SCateDetail> list = service.selectSCateDetail();
	System.out.println(list);
}
	
}
