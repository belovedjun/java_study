package com.s06.statictest;

public class StaticCount {
	//�ν��Ͻ� ����(��ü�� �����ɶ� ��ü�� ����)
	int c;
	//static(Ŭ����) ����(��ü�� ���Ե��� ����)
	static int count;
	
	//������
	public StaticCount() {
		c++;
		count++;
	}
}
