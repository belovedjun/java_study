package com.s02.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		//����(Stack) : ���Լ��� LIFO(Last-In First-Out)���(���߿� �ԷµȰ��� �������´�)
		String[] array = {"���޷�","����","������","����","���"};
				
		Stack<String> st = new Stack<String>();	
		
		for(int i=0;i<array.length;i++) {
			st.push(array[i]); // ��ü ����
		}
		//Stack�� ����� ����� ���
		System.out.println(st);
		System.out.println("-------------------");
		
		while(!st.isEmpty()) {//Stack�� ����ִ��� ����
			//Stack�� ����� ��ü�� ������ ��Ҹ� ��ȯ
			System.out.print(st.pop() + "\t");
		}
		
		System.out.println();//�ٹٲ�
		System.out.println(st);
		
		
	}
}
