package com.s05.poly;

//�θ�Ŭ����
class Parent{
	int a = 100;
}
//�ڽ�Ŭ����
class Child extends Parent{
	int b = 200;
}

public class PolyMain01 {
	public static void main(String[] args) {
		//�����ڷ���
		Child ch = new Child();//��� ������ �־ ������ ������.(����)
		System.out.println(ch.a);
		System.out.println(ch.b);
		//�����ڷ����� ����ȯ �� ��쿡�� �θ�� �ڽ�Ŭ���� ���̿����� �����ϴ�.
		
		Parent p = ch;//parent�� ��� ������ �پ��. parent������ ������. 
					  //�ڽ�Ŭ���� Ÿ�� -> �θ�Ŭ����Ÿ�� ����ȯ ��ĳ����, �ڵ������� ����ȯ	
		System.out.println(p.a);
		//ȣ�� ������ ��� ȣ�� �Ұ�
		//System.out.println(p.b);
		
		Child ch2 = (Child)p;//�θ�Ŭ���� Ÿ�� -> �ڽ�Ŭ����Ÿ������ ����ȯ
							//�ٿ�ĳ����, ��������� ����ȯ	
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}
}
