package com.biz.exec;

import com.biz.model.AddressVO;

public class Ex_01 {

	// ^F11를 사용해서 프로젝트를 Run하려면 main() method
	public static void main(String[] args) {
		
		AddressVO addr_VO = new AddressVO();
		AddressVO addr_VO2 = new AddressVO();
		AddressVO addr_VO3 = new AddressVO();
		
		addr_VO.setStr_addr("주소");
		addr_VO.setStr_tel("전화번호");
		addr_VO.setStr_name("이름");
		addr_VO.setInt_age(0);
		
		addr_VO2.setStr_addr("주소");
		addr_VO2.setStr_tel("전화번호");
		addr_VO2.setStr_name("이름");
		addr_VO2.setInt_age(0);
		
		addr_VO3.setStr_addr("주소");
		addr_VO3.setStr_tel("전화번호");
		addr_VO3.setStr_name("이름");
		addr_VO3.setInt_age(0); 
		
		// address* 인스턴스에 저장된 주소들을
		// 별도의 문자열 변수에 복사하여 Console에 출력
		String addr1 = addr_VO.getStr_addr();
		String addr2 = addr_VO2.getStr_addr();
		String addr3 = addr_VO3.getStr_addr();
		
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(addr3);
		// 직접 get method가 return 한 값을 Console에 출력
		System.out.println(addr_VO.getInt_age());
		System.out.println(addr_VO2.getInt_age());
		System.out.println(addr_VO3.getInt_age());
		
	}
}
