package com.s02.input;

import java.io.IOException;

public class StandardInput01 {
	public static void main(String[] args) {
		//�ڹ��� �⺻ �Է�
		try {
		System.out.print("������ 1�� �Է�:");
		//���� �ϳ� �Է¹޾Ƽ� �ƽ�Ű �ڵ�� ��ȯ
		int a = System.in.read();
		System.out.println(a + ", " + (char)a);
		
		System.in.read();//enter ó�� \r 13
		System.in.read();//enter ó��  \n 10 ������� ó��
		
		System.out.println("--------------");
		System.out.print("����1�� �Է�:");
		int b = System.in.read() - 48;
		System.out.println(b);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}