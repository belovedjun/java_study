package com.s07.thistest;

class ThisTest{
	//����ȭ
	private int a; //�������a
	
	//ĸ��ȭ
	//����������� ����������� �����ϸ�
	//������������ ��õ� �޼��忡�� ����������
	//�켱������ ȣ���
	public void setA(int a) {//��������a
		//������� = ��������
		this.a = a;
	}
	public int getA() {
		return a;
	}
}

public class ThisMain02 {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
	}
}
