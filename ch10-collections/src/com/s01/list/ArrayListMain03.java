package com.s01.list;

import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		/*
		 * ���׸� ǥ�� : ��ü�� ������ �� ��ü�� ������ �� �ִ�
		 * 			  ����� Ÿ���� ����(ArrayList,Vector ���׸� ǥ��)
		 */
		//String���� �����ؼ� ����Ǵ� ��ü�� �ڷ����� String
		//�� ����, �ٸ� Ÿ���� ��ü�� �����ϸ� ���� �߻�
		ArrayList<String> al = new ArrayList<String>();
		al.add("��ȣ��"); //String -> Object
		al.add("�豸��"); //String -> Object
		//al.add(1000); //Integer -> Object(���ڿ��� �����ϴ°�찡 �����)
		al.add("�ڸ��"); //String -> Object
		
		//�ݺ����� �̿��ؼ� ����� ��� ���
		for(int i=0;i<al.size();i++) {      //������ ���������� �ҷ����°� ����.
			String name = al.get(i);//Integer�� String�� ��Ӱ��� ����.
			System.out.println(name);
		}
		
		System.out.println("-----------------------");
		//Ȯ�� for���� �̿��� ����� ���
		for(String name : al) {
			System.out.println(name);
		}
		
	}
}
