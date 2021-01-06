package com.s05.constructor;

class Student {
	/*
	 * [실습]
	 * Student
	 * 멤버변수 : 국어(korean),영어(english),수학(math),
	 * 			역사(history),과목수(num)
	 * 생성자 : 국어,영어,수학,과목수를 입력받는 생성자
	 *        국어,영어,수학,역사,과목수를 입력받는 생성자
	 * 멤버메서드 : 총점구하기(int getTotal())
	 * 			 평균구하기(int getAverage())
	 * StudentMain
	 * Student객체 생성   <-- 국어,영어,수학, 3
	 * 총점과 평균 출력
	 * Student객체 생성  <- 국어,영어,수학,역사, 4
	 * 총점과 평균 출력
	 */
	//멤버변수
	int korean;
	int english;
	int math;
	int history;
	int num;
	
	//생성자
	public Student(int k, int e, int m, int n) {
		korean = k;
		english = e;
		math = m;
		num = n; //과목수 초기값 넣기
	}
	
	public Student(int k, int e, int m, int h, int n) {
		korean = k;
		english = e;
		math = m;
		history = h;
		num = n; //과목수 초기값 넣기
	}
	
	public int getTotal() {
		return korean + english + math;
	}
	
	public int getTotal02() {
		return korean + english + math + history;
	}
	
	public int getAverage() {
		return getTotal() / 3; 
	}
	public int getAverage02() {
		return getTotal02() / 4; 
	}
	
}

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student(95,96,97,3); //3지우기
		
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		
		System.out.println("----------------");
		
		Student s2 = new Student(95,96,97,89,4); //4지우기
		
		System.out.println("총점 : " + s.getTotal02());
		System.out.println("평균 : " + s.getAverage02());
		
	}
}
