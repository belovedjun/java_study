package com.s03.method;

import java.util.Scanner;

class Score{
	/*
	 * [�ǽ�]
	 * Score
	 * �������:�̸�(name),����(korean),����(english),
	 * 		  ����(math)
	 * ����޼���:����(int getSum()),���(double getAverage())
	 * 		   ���(String getGrade()) 0~100������ ����
	 *         ���� ���(void printScore())
	 *         ->�̸�,����,����,����,����,���,���
	 *ScoreMain
	 *Scanner ��ü ����
	 *score ��ü ����
	 *�̸�,����,����,����
	 *���� ���
	 */
	//��� ����
	String name;
	int korean;
	int math;
	int english;
	//��� �޼���
	//���� ���ϱ�
	public int getSum() {
		return korean + english + math;
	}
	//��� ���ϱ�
	public double getAverage() {
		return getSum() / 3.0; 
	}         
	//��� ���ϱ�
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

	//���� ���
	public void printScore() {
		System.out.println("�̸� : " + name);
		System.out.printf("���� : %d%n",korean);
		System.out.printf("���� : %d%n",math);
		System.out.printf("���� : %d%n",english);
		System.out.printf("���� : %d%n",getSum());
		System.out.printf(
				"��� : %.2f%n",getAverage());
		System.out.printf("��� : " + getGrade());
	}

}

public class ScoreMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Score s = new Score();//�빮�� Ȯ��!
		
		System.out.print("�̸� �Է�:");
		s.name = input.next();//next(���ڿ�)
		System.out.print("���� �Է�:");
		s.korean = input.nextInt();//nextInt(����)
		System.out.print("���� �Է�:");
		s.math = input.nextInt();
		System.out.print("���� �Է�:");
		s.english = input.nextInt();
		
		//�������
		s.printScore();
		
		input.close();
		
	}
}
