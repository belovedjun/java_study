package com.s05.poly;

//�θ�Ŭ���� 
class Parent2{
	public void make() {
		System.out.println("�θ�Ŭ������ make");
	}
}
//�ڽ�Ŭ����
class Child2 extends Parent2{
	//�޼��� �������̵�(������)
	@Override
	public void make() {
		System.out.println("�ڽ�Ŭ������ make");
	}
}

public class PolyMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.make();
		
		Parent2 p = ch;//�ڽ�Ŭ����Ÿ��->�θ�Ŭ����Ÿ�� ����ȯ
						//��ĳ����,�ڵ������� ����ȯ
		//�θ�Ŭ����Ÿ������ ����ȯ�� �Ǿ
		//�����ǵ� �޼���� �θ�Ŭ������ �޼��尡 ȣ��Ǵ� ����
		//�ƴ϶� �ڽ�Ŭ������ ������ �� �޼��尡 ȣ���
		p.make();
		
	}
}