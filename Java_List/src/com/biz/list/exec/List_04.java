package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}
		
		/*
		 * intList.get(i) method
		 * public int get(int i) {
		 *  return x; 
		 *  }
		 */
		for (int i = 0; i < 100; i++) {
			int num = intList.get(i);
			if (num == 55) {
				System.out.println("출력 : " + num);
			}
			
		}
		

	}
}
