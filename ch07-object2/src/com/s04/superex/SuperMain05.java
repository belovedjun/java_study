package com.s04.superex;

//�θ�Ŭ����
class Parent2{
	int a;
	int b;
	//���ڰ� �ִ� ������
	public Parent2(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
//�ڽ�Ŭ����
class Child3 extends Parent2{
	public Child3(int a, int b) {
		super(a,b);
	}
}

public class SuperMain05 {
	public static void main(String[] args) {
		Child3 ch = new Child3(60,30);
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
