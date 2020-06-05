package com.biz.list.exe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.ScoreVO;
import com.biz.list.service.ScoreServiceV2;

public class ScoreEx {

	public static void main(String[] args) {

		List<ScoreVO> scoreList = new ArrayList<>();
		Random rnd = new Random();

		ScoreVO scoreVO;
		for (int i = 0; i < 10; i++) {
			scoreVO = new ScoreVO();

			scoreVO.setNum("" + i);
			scoreVO.setKor(rnd.nextInt(50) + 51);
			scoreVO.setEng(rnd.nextInt(50) + 51);
			scoreVO.setMath(rnd.nextInt(50) + 51);
			scoreVO.setStSum(scoreVO.getKor()+scoreVO.getEng()+scoreVO.getMath());
			scoreVO.setStAvg(scoreVO.getStSum()/3);
			scoreList.add(scoreVO);

		}

		ScoreServiceV2 scores = new ScoreServiceV2();
		scores.scoreList(scoreList);

	}

}
