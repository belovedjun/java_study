package com.s01.stringex;

public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
					//012345678910 , ���ڿ��� ���� = 11
		
		int index = s1.indexOf('n');//�� �տ� �ִ� ���ڸ� ã���ش�
		System.out.println(
				"�� ó�� ���� n�� ��ġ : " + index);
		
		index = s1.indexOf("Sun"); //�޼��� �����ε�
		System.out.println(
				"���ڿ� Sun�� ��ġ : " + index);
		
		index = s1.lastIndexOf('n');//�ߺ��� ���ڸ� Ž��
		System.out.println(
				"������ ���� n�� ��ġ : " + index);
		
		char c = s1.charAt(index);//���� ����
		System.out.println("������ ���� : " + c);
		
		index = s1.indexOf('S');
		//������ �ε������� ������ �ε������� ���ڿ� ����
		String str = s1.substring(index);
		System.out.println(
				"�빮�� S���� ������ �߶󳻱� : " + str);
		
		//���� �ε������� �� �ε��������� ���ڿ� ����(���ε��� ����x)
		str = s1.substring(index, index+3); //5,8
		System.out.println("�빮�� S�κ��� 3�ڱ��� �߶󳻱� : " + str);
		
		int length = s1.length();
		System.out.println("s1�� ���� : " + length);
		
		String[] array = s1.split(" ");
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]:"+array[i]);
		}
		
	}
}
