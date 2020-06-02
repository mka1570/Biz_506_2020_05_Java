package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Ex_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		ScoreVO[] score = new ScoreVO[20];
		
		for(int i = 0; i < score.length ; i++) {
			score[i] = new ScoreVO();
		}
		
		for(int i = 0; i < score.length; i++) {
			score[i].setKor(rnd.nextInt(50)+51);
			score[i].setMath(rnd.nextInt(50)+51);
			score[i].setEng(rnd.nextInt(50)+51);
			score[i].setName(""+i);
		}
		
		
		
	}
	
	
	
}
