package com.s03.overriding;

//�θ�Ŭ����
class Mother{
	public String getLunch() {
		return "��";
	}
}

class Son extends Mother{
	
}

class Daugther extends Mother{
	//�޼��� ������
	@Override
	public String getLunch() {
		return "��";
	}
}

public class OverridingMain02 {
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(
				"�Ƶ��� " + s.getLunch() + "�� �Խ��ϴ�.");
		
		Daugther d = new Daugther();
		System.out.println(
				"���� " + d.getLunch() + "�� �Խ��ϴ�.");
		
	}
}
