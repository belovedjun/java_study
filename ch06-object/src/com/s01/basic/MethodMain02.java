package com.s01.basic;
public class MethodMain02 {
	//public :����������(���ٰ���), int :��ȯ��, increase:�޼ҵ��
	//���� ���� ��� : ���� ���� ȣ��
	//�⺻�ڷ����� ���� ���ڷ� �����ϴ� ���, ���� �����Ͽ� ����
	public int increase(int n) {
		++n;              //����
		return n;//�����
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		//��ü ���� �� ����
		MethodMain02 m = new MethodMain02();
		int var2 = m.increase(var1);
		System.out.println("var1 = " + var1 + ", var2 = " + var2);
	}
}
