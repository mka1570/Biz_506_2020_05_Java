package com.biz.model;
/*
 * 명명규칙
 * 1. 클래스 : 첫글자 대문자, 파일이름과 같게
 * 2. 변수 : 첫글자 소문자
 * 3. method : 첫글자 소문자
 * 
 * 2번째부터는 숫자 _ 가능
 * 빈칸 넣지 않기
 * 2개단어 이상으로 조합해서 만드는 것을 권장
 * 2개 이상 단어를 조합할때 두번째 단어부터는 첫글자를 대문자로
 * 
 * 클래스 : StudentClass
 * 변수 : studentName
 * method : studentList()
 */

// 데이터를 담아서 method들 간에 이동할때 사용하는 클래스 
public class AddressVO {

	private String str_name; // 이름
	private String str_tel; // 전화번호
	private String str_addr; // 주소
	private int int_age; // 나이
	
	
	public String getStr_name() {
		return str_name;
	}
	public void setStr_name(String str_name) {
		this.str_name = str_name;
	}
	public String getStr_tel() {
		return str_tel;
	}
	public void setStr_tel(String str_tel) {
		this.str_tel = str_tel;
	}
	public String getStr_addr() {
		return str_addr;
	}
	public void setStr_addr(String str_addr) {
		this.str_addr = str_addr;
	}
	public int getInt_age() {
		return int_age;
	}
	public void setInt_age(int int_age) {
		this.int_age = int_age;
	}
	
	
}
