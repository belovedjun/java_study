package com.s01.list;

import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		
		//��Ҹ� ����
		v.add(100.3); //add�� ����
		v.add(3.14);
		v.add(1000.);//=1000.0���� �ν�
		
		//Ȯ�� for���� �̿��� ����� ���
		for(Double n : v) {
			System.out.println(n);
		}
		
		//�ڿ��˻�
		double search = 1000.0; //�˻��� ���
		int index = v.indexOf(search); //index ����� ����
		if(index != -1) {
			System.out.println(
					"�˻� ��� " + search + "�� ��ġ : " + index);
		}else {
			System.out.println(
					"�˻� ��� " + search + "�� �����ϴ�.");
		}
		
		//�ڿ� ����
		double del = 3.14;
		//���ڷ� ���޵� ��Ұ� Vector�� ������� �˻�
		if(v.contains(del)) {
			v.remove(del);//����
			System.out.println(del + "���� �Ϸ�!");
		}
		
		//Vector�� ����� ����� ���
		System.out.println(v);
		
		
	}
}
