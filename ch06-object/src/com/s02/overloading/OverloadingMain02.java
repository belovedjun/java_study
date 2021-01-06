package com.s02.overloading;

public class OverloadingMain02 {
	
	//Method Overloading(�ߺ�����)
	public void getLength(int a) {
		String s = String.valueOf(a);//int -> String(���ڿ����� ���� ������ ī���õȴ�.)
		getLength(s);    //valueof(a)�� String ���� ��ȯ������
	}
	
	public void getLength(float a) {
		String s = String.valueOf(a);//float -> String
		getLength(s);//�޼��峻���� �޼��� ȣ�� ����
	}
	//���� ��Ű�� ������ ȣ��
	int getLength(String str) {
		System.out.println(str.length());		
		return str.length();
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(10000);//10000 -> "10000", 5
		om.getLength(3.14f);//3.14f -> "3.14", 4
		om.getLength("bus");//"bus" -> 3
	}
}
