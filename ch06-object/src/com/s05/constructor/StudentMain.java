package com.s05.constructor;

class Student {
	/*
	 * [�ǽ�]
	 * Student
	 * ������� : ����(korean),����(english),����(math),
	 * 			����(history),�����(num)
	 * ������ : ����,����,����,������� �Է¹޴� ������
	 *        ����,����,����,����,������� �Է¹޴� ������
	 * ����޼��� : �������ϱ�(int getTotal())
	 * 			 ��ձ��ϱ�(int getAverage())
	 * StudentMain
	 * Student��ü ����   <-- ����,����,����, 3
	 * ������ ��� ���
	 * Student��ü ����  <- ����,����,����,����, 4
	 * ������ ��� ���
	 */
	//�������
	int korean;
	int english;
	int math;
	int history;
	int num;
	
	//������
	public Student(int k, int e, int m, int n) {
		korean = k;
		english = e;
		math = m;
		num = n; //����� �ʱⰪ �ֱ�
	}
	
	public Student(int k, int e, int m, int h, int n) {
		korean = k;
		english = e;
		math = m;
		history = h;
		num = n; //����� �ʱⰪ �ֱ�
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
		Student s = new Student(95,96,97,3); //3�����
		
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
		
		System.out.println("----------------");
		
		Student s2 = new Student(95,96,97,89,4); //4�����
		
		System.out.println("���� : " + s.getTotal02());
		System.out.println("��� : " + s.getAverage02());
		
	}
}
