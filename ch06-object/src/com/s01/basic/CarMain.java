package com.s01.basic;
public class CarMain {
	//��� ����
	String company = "�����ڵ���";
	String model = "�ҳ�Ÿ"; 
	String color = "����";
	int maxspeed = 350;
	int speed = 60;
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		CarMain myCar = new CarMain();
		
		//��ü�� ��� ������ �� ���
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxspeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
		//��������� �� ����
		myCar.speed = 100;
		
		System.out.println("����� �ӵ� : " + myCar.speed);
	}
}
