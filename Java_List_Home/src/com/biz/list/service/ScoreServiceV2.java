package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	List<ScoreVO> scoreList;

	int sum = 0;

	public void stSum(List<ScoreVO> scoreList) {
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO sVO = scoreList.get(i);

			sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();

			System.out.println(sum);

		}

	}

	int avg = 0;

	public void stAvg(List<ScoreVO> scoreList) {
		for (int i = 0; i < scoreList.size(); i++) {
			avg = sum / 3;
		}
		return;
	}

	public void scoreList(List<ScoreVO> scoreList) {
		System.out.println("=======================================");
		System.out.println("성적리스트");
		System.out.println("---------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");

		for (int i = 0; i < scoreList.size(); i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", scoreList.get(i).getNum(), scoreList.get(i).getKor(),
					scoreList.get(i).getEng(), scoreList.get(i).getMath(), scoreList.get(i).getStSum(),
					scoreList.get(i).getStAvg());
		}
	}
}
