package com.s03.wrapper;

public class WrapperMain02 {
	public static void main(String[] args) {
		//�⺻�ڷ��� ������ -> �����ڷ��� ������ : auto boxing
		Integer obj1 = 10;
		Integer obj2 = 20;
		
		//�����ڷ��� ������ -> �⺻�ڷ��� ������ : auto unboxing
		int result = obj1 + obj2;
		System.out.println(result);
		
	}
}
