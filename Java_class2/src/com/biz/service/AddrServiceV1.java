package com.biz.service;

import com.biz.model.AddressVO;

public class AddrServiceV1 {

	public void addrList(AddressVO[] addr_VO) {
		
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("주소록");
		System.out.println(s_line);
		System.out.println("이름\t전화번호\t주소\t나이");
		System.out.println(s_line);
		
		for(int i = 0; i < addr_VO.length; i++) {
			System.out.println(addr_VO[i].getInt_age());
			System.out.println(addr_VO[i].getStr_addr());
			System.out.println(addr_VO[i].getStr_name());
			System.out.println(addr_VO[i].getStr_tel());
			
		}
		System.out.println(d_line);
	}
		
	
}
