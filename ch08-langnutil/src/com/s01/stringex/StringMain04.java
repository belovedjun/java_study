package com.s01.stringex;

public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���ڿ����� �ҹ��ڴ� �빮��, �빮�ڴ� �ҹ��ڷ� �����Ͻÿ�.
		 * �ƽ�Ű�ڵ� : 65~90 �빮�� 
		 * 			97~122 �ҹ���
		 * ���ڿ��� ���� : length()
		 * ���ڿ����� ���� : charAt(index)
		 * �ҹ��� -> �빮�� : toUpperCase()
		 * �빮�� -> �ҹ��� : toLowerCase()
		 * ���� -> ���ڿ� : String.valuof(����)
		 */
		String str = "abcMDye-4W?EWzz";
						//���ڿ��� ����
		String result = "";
		for(int i=0;i<str.length();i++) {
			//�ε��� �����ϰ� ���ڸ� ����
			char c = str.charAt(i);//���� ����
			
			//���ڰ� �ҹ��� �������� �빮�� �������� üũ
			if(c>=65 && c<=90) {//�빮�� -> �ҹ���
							//����->���ڿ�
				result += String.valueOf(c).toLowerCase();
			}else if(c>=97 && c<=122) {//�ҹ��� -> �빮��
				result += String.valueOf(c).toUpperCase();
			}else {//�빮�ڵ� �ҹ��ڵ� �ƴ� ���
				result += c;
			}
		}
		//����� ���
		System.out.println(result);
		
		System.out.println("---------------------");
		
		String result2 = "";
		//�ƽ�Ű�ڵ���
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);//���� ����
			if(c>=65 && c<=90) {//�빮�� -> �ҹ���
				result2 += (char)(c + 32);
			}else if(c>=97 && c<=122) {//�ҹ��� -> �빮��
				result2 += (char)(c - 32);
			}else {//�빮�ڵ� �ҹ��ڵ� �ƴ� ���
				result2 += c;
			}
		}
		System.out.println(result2);
		
		System.out.println("--------------------");
		
		String result3 = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {//�빮��
						//�빮�� -> �ҹ���
				result += Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {//�ҹ���
						//�ҹ��� -> �빮��
				result += Character.toUpperCase(c);
			}else {//�빮�ڵ� �ҹ��ڵ� �ƴ� ���
				
			}
		}
		System.out.println(result3);
	}
}




