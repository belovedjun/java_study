package com.s03.method;

import java.util.Scanner;

class Score{
	/*
	 * [실습]
	 * Score
	 * 멤버변수:이름(name),국어(korean),영어(english),
	 * 		  수학(math)
	 * 멤버메서드:총점(int getSum()),평균(double getAverage())
	 * 		   등급(String getGrade()) 0~100까지만 기준
	 *         점수 출력(void printScore())
	 *         ->이름,국어,영어,수학,총점,평균,등급
	 *ScoreMain
	 *Scanner 객체 생성
	 *score 객체 생성
	 *이름,국어,영어,수학
	 *점수 출력
	 */
	//멤버 변수
	String name;
	int korean;
	int math;
	int english;
	//멤버 메서드
	//총점 구하기
	public int getSum() {
		return korean + english + math;
	}
	//평균 구하기
	public double getAverage() {
		return getSum() / 3.0; 
	}         
	//등급 구하기
	public String getGrade() {
		String grade;

		switch((int)(getAverage()/10)) {
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;	
		default : grade = "F";
		}
		return grade;
	}

	//정보 출력
	public void printScore() {
		System.out.println("이름 : " + name);
		System.out.printf("국어 : %d%n",korean);
		System.out.printf("수학 : %d%n",math);
		System.out.printf("영어 : %d%n",english);
		System.out.printf("총점 : %d%n",getSum());
		System.out.printf(
				"평균 : %.2f%n",getAverage());
		System.out.printf("등급 : " + getGrade());
	}

}

public class ScoreMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Score s = new Score();//대문자 확인!
		
		System.out.print("이름 입력:");
		s.name = input.next();//next(문자열)
		System.out.print("국어 입력:");
		s.korean = input.nextInt();//nextInt(문자)
		System.out.print("수학 입력:");
		s.math = input.nextInt();
		System.out.print("영어 입력:");
		s.english = input.nextInt();
		
		//정보출력
		s.printScore();
		
		input.close();
		
	}
}
