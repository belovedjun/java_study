package com.s08.array;
	
public class CarMain {
		/*
		 * [실습]
		 * 배열(car Array)생성, 길이는 4
		 * 총 구매 가격을 저장하는 변수(total)
		 * Car 객체 4개를 생성해서 배열에 저장
		 * 반복문을 이용해서 배열에 저장된 객체 호출, 정보 출력
		 * 반복문내에서 total에 가격을 누적함
		 * 반복문을 빠져나와서 자동차 총 구매 금액을 출력하시오.
		 */
	public static void main(String[] args) {
		Car[] carArray = new Car[4];
		int total = 0;
		
		//Car 객체 4개를 생성해서 배열에 저장
		carArray[0] = new Car("그랜져","검은색",15000);
		carArray[1] = new Car("모닝","하얀색",20000);
		carArray[2] = new Car("제네시스","회색",30000);
		carArray[3] = new Car("볼보","파란색",50000);
		
		//배열에 저장된 객체를 호출해서 정보를 출력하고
		//가격을 합산
		for(int i=0;i<carArray.length;i++) {
			System.out.println(
					"이름 :" + carArray[i].getName());
			System.out.println(
					"색상 :" + carArray[i].getColor());
			System.out.printf(
					"가격 : %,d원%n",carArray[i].getPrice());
			System.out.println("----------------");
			//가격 누적
			total += carArray[i].getPrice();
		}
		
		//합계 금액을 출력
		System.out.printf("자동차 총 구매 금액 : %,d원%n",total);
		
		System.out.println("========================");
		
		//확장for문을 이용한 배열의 요소 출력
		for(Car car : carArray) {
			System.out.println("이름 :" + car.getName());
			System.out.println("색상 :" + car.getColor());
			System.out.printf("가격 : %,d원%n",car.getPrice());
			System.out.println("---------------------");
		}
	}
}
