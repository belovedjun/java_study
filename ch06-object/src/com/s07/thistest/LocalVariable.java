package com.s07.thistest;

public class LocalVariable {
	//������� : Ŭ���� �� ������ ���ǵ� ����
	int b = 200;
	
	public void make() {
		/*
		 * �������� : �޼���,������,��� �� ������
		 * 			������ ����, "�ش� ���� ����Ǹ�
		 * 			������ �Ҹ�"
		 */
		int a = 100;
		System.out.println("a : " + a);//��������
		System.out.println("b : " + b);//�������
	}
	
	public void fun() {
		//fun�޼��� �ȿ� a������ ���ǵ��� �ʾƼ� ȣ�� �Ұ�
		//System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//��� ������ ��������
			System.out.print(i + "\t");// \t ���������� ������ ���� ���
		}
		System.out.println("\n------------");// \n�� ���� Ű�� ����� ���´�.���� �ٲ۴�(new line)
		//��� ���� �������ͼ� i�� �Ҹ�Ǿ���
		//main�޼��忡 i�� ���ǵ��� �ʾƼ� ȣ�� �Ұ�
		//System.out.println(i);
		
		for(int i=0;i<10;i++) {
			System.out.print(i + "\t");
		}
		
		
	}
	
}