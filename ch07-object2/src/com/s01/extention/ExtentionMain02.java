package com.s01.extention;

//�θ�Ŭ����
class people{
	public void eat() {
		System.out.println("�Ļ��ϴ�");
	}
}
//�ڽ�Ŭ����
class Student extends people{
	public void study() {
		System.out.println("�����ϴ�");
	}
}

public class ExtentionMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();//people�� �޼��带 ��� �޾Ƽ� ȣ��
		s.study();//Student�� �޼���
		//object�� �޼���
		System.out.println(s.toString());
	}
}
