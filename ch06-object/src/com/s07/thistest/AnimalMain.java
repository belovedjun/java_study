package com.s07.thistest;

import com.s05.constructor.MyClass;

public class AnimalMain {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���ڰ� ���� �����ڸ� �̿��ؼ� Animal ��ü ����
		 * set�޼��带 �̿��ؼ�, �̸�,����,���࿩�� ����
		 * �̸�,����,���࿩�� ���
		 * 
		 * [��� ����]
		 * �̸� : �⸰
		 * ���� : 12��
		 * ���࿩�� : �Ұ���
		 */
		//��ü ����
		Animal a1 = new Animal();
		//������ ����
		a1.setName("�⸰");
		a1.setAge(12);
		a1.setFly(false);
		
		System.out.println("�̸� : " + a1.getName());
		System.out.println("���� : " + a1.getAge() + "��");
		System.out.println("���࿩�� : " + printFly(a1.isFly()));
		
		System.out.println("-----------------");
		
		//���ڰ� �ִ� �����ڷ� ��ü ����
		Animal a2 = new Animal("�ڳ���",2,false);
		//�̸�,����,���࿩�� ���
		System.out.println("�̸� : " + a2.getName());
		System.out.println("���� : " + a2.getAge() + "��");
		System.out.println("���࿩�� : " + printFly(a2.isFly()));
	}//end of main
	
	private static String printFly(boolean fly) {
		return fly ? "����" : "�Ұ���";
	}
	
}
