package com.biz.grade;

import com.biz.score.Student;

public class Grade_06 {

	public static void main(String[] args) {
		
		String strName = "홍길동";
		int intAge = 33;
		String strTel = "010-111-1111";
		strName = "성춘향";
		String strN = strName;
		System.out.println(strN);
		

		
		Student st = new Student();
		st.make();
		strN = st.getName();
		
		
		System.out.println(strN);
		
		
		
	}
}
