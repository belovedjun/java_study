package com.s04.superex;
	
//�θ�Ŭ����
class Parent{
	int a = 100;
	public void play() {
		System.out.println("Parent�� play �޼���");
	}
}
//�ڽ�Ŭ����
class Child extends Parent{
	int a = 200;
	
	public Child() {
		System.out.println(super.a);//100
		super.play();//ParentŬ������ play�޼��� ȣ��
		System.out.println("-----------------");
	}
	
	//�޼��� ������
	@Override
	public void play() {
		System.out.println("Child�� paly �޼���");
	}
}


public class SuperMain02 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		ch.play();
	}
}
