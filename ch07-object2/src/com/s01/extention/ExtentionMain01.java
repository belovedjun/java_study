package com.s01.extention;

//�θ� Ŭ����
class parent{//extends object ����
			//Ŭ������ �����ϸ� �ڵ������� object�� ��ӵ�
	int a = 500;
}
//�ڽ� Ŭ����
class Child extends parent{//�ڹٿ����� ��Ӱ��踦 ��������� parent�� �Ҹ� -> Child �θ�Ŭ������ object
	int b =200;
}

public class ExtentionMain01 {//
	public static void main(String[] args) {
		Child ch = new Child();
		//Child Ŭ������ ��ӵ� parent Ŭ������ ������� ȣ��
		System.out.println(ch.a);
		//Child Ŭ������ ������� ȣ��
		System.out.println(ch.b);
	}
}
