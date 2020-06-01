package com.biz.classes;

import com.biz.classes.sevice.ScoreService;

public class ClassEx_10 {

	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng = 80;
		int intMath = 70;
		int intMusic = 90;
		int intArt = 99;
		int intSci = 100;
		
		ScoreService score = new ScoreService();
		 int sum = score.sum(intKor, intEng, intMath, intMusic, intArt, intSci);
		 
		 
		 
	}
}
