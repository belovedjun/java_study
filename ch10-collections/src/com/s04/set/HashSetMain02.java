package com.s04.set;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashSetMain02 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * �ζ� ���α׷� �����
		 * 1~45 �������� �ߺ����� ���� 6���� ���� HashSet(��������)�� 
		 * �����ϰ� ����ϱ�(�ߺ��� üũ)
		 * ���� ó�� -> Math.random() : 0.0 ~ 1.0�̸�
		 * 			 (int)Math.random()*45)+1
		 * HasSet(Ư���� ����üũ �����ʾƵε�)�� ����� �������� ������ üũ -> size()
		 */
		//add�� �ߺ��� �ɷ���
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<6) {
			int num = (int) (Math.random()*45)+1;//1~45
			//�ߺ����� ������� ����
			hs.add(num);
		}
		
		
		//Ȯ�� for��
		for(int num : hs) {
			System.out.println(num + "\t");
		}
		
		System.out.println("\n------------------");
		
		//����
		List<Integer> list = 
						  new ArrayList<Integer>(hs);
		Collections.sort(list);
			
		for(int num : list) {
			System.out.print(num + "\t");
		}
	}
}
