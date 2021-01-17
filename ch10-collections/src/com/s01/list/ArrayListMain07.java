package com.s01.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain07 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * �ζ� ���α׷� �����
		 * 1~45 �������� �ߺ����� ���� 6���� ���� ArrayList(��������)�� 
		 * �����ϰ� ����ϱ�
		 * ���� ó�� -> Math.random() : 0.0 ~ 1.0�̸�
		 * 		     0.0      ~0.999999999999
		 * 			x45		
		 * 			--------------------------
		 * 			0.0       ~44.999999999999
		 * 			---------------------------
		 * 			0         ~44
		 * 			+1
		 * 			----------------------------
		 * 			1		  ~45
		 * 			 (int)Math.random()*45)+1
		 * ArrayList�� ����� �������� ������ üũ -> size()
		 * �ߺ��� üũ contains()
		 */
		ArrayList<Integer> list = 
				new ArrayList<Integer>();
		while(list.size()<6) {
			int num = (int) (Math.random()*45)+1;
			//�ߺ��� üũ(�����Ͱ� ������ true��ȯ)
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		System.out.println(list);
		System.out.println("-----------");
		//����
		Collections.sort(list);
		for(int num : list) {
			System.out.print(num + "\t");
			}
		
	}
}
