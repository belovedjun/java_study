package com.s04.superex;

//�θ�Ŭ����
class People{
	int a = 100;
	
	//������
	public People() {
		super();//Object�� default ������ ȣ��
	}
}
//�ڽ�Ŭ����
class Child2 extends People{
	int b = 200;
	
	//������
	public Child2() {
		super();//�θ�Ŭ������ default ������ ȣ��
	}//�����Ϸ��� �ڵ������� ó������ object->people->Child �� ������ ������ ȣ��
}

public class SuperMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
