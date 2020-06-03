package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV1 {

	/*
	 * scores 인스턴스배열을 필드변수로 선언한 이유
	 * Ex클래스에서 Service클래스에서
	 * 총점계산, 평균계산, 리스트출력을 요청할텐데
	 * 요청을 할때마다 scores 인스턴스 배열을 매개변수로
	 * 전달할수 있지만
	 * 한번만 변수로 전달해 Service 클래스가 scores 인스턴스를 
	 * 보관하도록 하고 나머지 요청하는 메서드에서는 변수를 받는 부분을 제거하기 위함이다.
	 * 
	 * Ex클래스에서 요청들을 할때마다 scores 배열을 매개변수로
	 * 전달을 하면 요청과 요청사이에서 다른 코드에 의해 scores 배열 값이
	 * 변형되어 결과가 엉뚱하게 나타나는 것을
	 * 방지하는 목적도 있다.
	 */
	private ScoreVO[] scores;
	/*
	 * ScoreServiceV1 클래스를 사용해서
	 * 어떤 연산을 수행하려고 할때
	 * 반드시 setScore() method를 통해서 scores값을
	 * 매개변수로 주입을 해주어야 한다.
	 * 그렇지 않으면 scores 인스턴스 필드변수가 아직 준비가 안된 상태이기 때문에 이후에 호출되는 method() 들에서 NullPointException이 발생을 한다.
	 */
	
	public void scores(ScoreVO[] scores) {
		this.scores = scores;
	}
	/*
	 * 필드변수로 scores 선언되어 있기 때문에
	 * 학생 총점과 평균을 계산한 후 
	 * 어디에 저장해야 할지를 고민하지 않아도 된다.
	 */
	public void scoresSum() {
		for(int i = 0; i < scores.length; i++) {
			scores[i].setSum(scores[i].getKor()+scores[i].getEng()+scores[i].getMath()+scores[i].getMusic());
		}
		}
	public void scoresAvg() {
		for(int i = 0; i < scores.length; i++) {
			scores[i].setAvg(scores[i].getSum() / 4);
		}
	
			
	}
	public void scoresPrint() {

		LineService lineSerivce = new LineService();
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(lineSerivce.single(50));
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].getNum(),scores[i].getKor(),scores[i].getEng(),scores[i].getMath(),
					scores[i].getMusic(),scores[i].getSum(),scores[i].getAvg());
			System.out.println(lineSerivce.single(50));
		}
		
		
	}	
}

	
	

