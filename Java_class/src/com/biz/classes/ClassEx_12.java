package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.sevice.BankServiceV2;

public class ClassEx_12 {

	public static void main(String[] args) {
		
		BankVO[] bankList = new BankVO [5];
		
		bankList[0] = new BankVO();
		bankList[1] = new BankVO();
		bankList[2] = new BankVO();
		bankList[3] = new BankVO();
		bankList[4] = new BankVO();
		
		bankList[0].setNum("001");
		bankList[1].setNum("002");
		bankList[2].setNum("003");
		bankList[3].setNum("004");
		bankList[4].setNum("005");
		
		bankList[0].setDate("6월 1일");
		bankList[1].setDate("6월 1일");
		bankList[2].setDate("6월 1일");
		bankList[3].setDate("6월 1일");
		bankList[4].setDate("6월 1일");
		
		bankList[0].setInput(5000);
		bankList[2].setInput(5000);
		
		bankList[1].setOuput(1000);
		bankList[3].setOuput(1000);
		bankList[4].setOuput(1000);
		
		// 기본형 변수들...
		// primitive variable
		int num = 0; // integer 형 변수 num를 선언하고 0으로 clear
		long num1 = 0L;// long 형 변수 num1을 선언하고 0으로 clear
		float num2 = 0.0f;
		double num3 = 0.0;
		boolean bYes = false;
		char char1 = 'c';// charactor형 변수 num를 선언하고 문자 c 를 저장
		
		// String(문자열)형 변수는
		// 변수처럼 사용하지만 실제로는
		// 일반변수와 달리 String 클래스로 만든 String형 인스턴스라고 해야한다.
		String strName = "홍길동";
		// String strName = new String ("홍길동");
		String strNation = new String();
		
		// BankServiceV2 클래스를 사용해서
		// bankService라는 변수를 선언
		// bankService 변수를 "객체(object)", "인스턴스(Instance)"
		BankServiceV2 bankService = new BankServiceV2();
		// bankService 인스턴스를 통해서
		// bankSerivce() method를 호출하면
		// BankSerivceV2 클래스내에 정의된 
		// bankList() method 내의 코드들이 순서대로 실행된다.
		bankService.banklist();
		
	}
}
