package com.biz.classes;

import com.biz.classes.model.ScoreVO;
import com.biz.classes.sevice.LineService;
import com.biz.classes.sevice.ScoreService;


public class ClassEx_09 {

	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng = 80;
		int intMath = 78;
		int intMusic = 100;
		int intSci = 100;
		int intArt = 100;
		
		/*
		 * method의 매개변수 전달
		 * 전달하고자 하는 매개변수가 몇개 안될때는
		 * 매개변수를 잘못 전달하여 발생하는 문제가 별로 없다.
		 * 하지만 매개변수의 개수가 많아지면
		 * 값이 뒤바뀔수도 있고, 경우에 따라 누락되거나,
		 * 중복 등 잘못 전달 될수 있다.
		 * 
		 * 이럴때 매개변수를 담은 클래스를 만들고
		 * 인스턴스를 생성한 후 인스턴스의 맴버변수에 값을 담은 다음
		 * 인스턴스를 매개변수로 전달하면
		 * 1개의 매개변수만으로 코드를 해결할 수 있다.
		 * 
		 * 클래스를 만들고 인스턴스를 생성하는 절차가 번거롭기는 하지만
		 * 그만큼 오류가 발생할 확률이 낮은 코드 작성이 가능하다.
		 */
		LineService line = new LineService();
		ScoreService scoreService = new ScoreService();
		
		String d_line=line.do_line(30);
		String s_line=line.single(30);
		
		System.out.println(d_line);
		System.out.println("성적일람표");
		System.out.println(s_line);
		System.out.println("국어\t영어\t수학\t총점");
		System.out.println(s_line);
		System.out.printf("%d\t%d\t%d"
				+ "\t%d\n",intKor,intEng,intMath,scoreService.sum(intKor,intEng,intMath));
		
		ScoreVO score = new ScoreVO();
		score.setIntKor(intKor);
		score.setIntEng(intEng);
		score.setIntArt(intArt);
		score.setIntMath(intMath);
		score.setIntMusic(intMusic);
		score.setIntSci(intSci);
		scoreService.sum(score);
		int sum = scoreService.sum(score);
		System.out.println("총점 : " + sum);
				
	}
}
