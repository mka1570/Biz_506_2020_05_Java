package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {

	public static void main(String[] args) {
		
		AddressVO[] addr_VO = new AddressVO[5];
		
		addr_VO[0] = new AddressVO();
		addr_VO[1] = new AddressVO();
		addr_VO[2] = new AddressVO();
		addr_VO[3] = new AddressVO();
		addr_VO[4] = new AddressVO();
		
		
		addr_VO[0].setInt_age(0);
		addr_VO[1].setInt_age(1);
		addr_VO[2].setInt_age(2);
		addr_VO[3].setInt_age(3);
		addr_VO[4].setInt_age(4);
		
		addr_VO[0].setStr_addr("광주");
		addr_VO[1].setStr_addr("서울");
		addr_VO[2].setStr_addr("부산");
		addr_VO[3].setStr_addr("대구");
		addr_VO[4].setStr_addr("청주");
		
		addr_VO[0].setStr_name("홍길동");
		addr_VO[1].setStr_name("이몽룡");
		addr_VO[2].setStr_name("성춘향");
		addr_VO[3].setStr_name("임꺽정");
		addr_VO[4].setStr_name("임사홍");
		
		addr_VO[0].setStr_tel("010-333");
		addr_VO[1].setStr_tel("010-111");
		addr_VO[2].setStr_tel("010-222");
		addr_VO[3].setStr_tel("010-444");
		addr_VO[4].setStr_tel("010-555");
		
		AddrServiceV1 addrList = new AddrServiceV1();
		// 배열을 매개변수를 통해 method에게 전달할때는 이름만 붙여주면 된다.
		addrList.addrList(addr_VO);
		
		
		
	}
}
