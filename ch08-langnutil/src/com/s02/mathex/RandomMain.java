package com.s02.mathex;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"스마트폰","TV","냉장고","꽝!"};
						// 0       1     2     3
		
		//0.0 ~ 1.0미만의 난수 발생
		double ran = Math.random();
		System.out.println("발생한 난수 : " + ran);//매번 정해지지않은 임의의 수를 호출함.
		
		int index = (int)(ran*4);//0~3(배열에서 데이터를 읽어와야함) (1부터 시작하고싶으면 +1)
		System.out.println("발생한 난수 : " + index);
		System.out.println(
				"오늘의 선물 : " + gift[index]);
		
		System.out.println("---------------------");
		
		String[] luck = 
			{"로또당첨","즐거운 여행","맛집 투어","피곤해!!!"};
			//  0         1         2        3
		Random r1 = new Random();
		
		//0부터 인자로 전달된 값의 전까지의 범위로 난수 발생
		index = r1.nextInt(4);//0~3(난수를 정수로 반환 : nextInt)
		System.out.println("발생한 난수 : " + index);
		System.out.println("오늘의 운세 : " + luck[index]);
		
	}
}
