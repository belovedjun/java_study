package com.s08.array;
	
public class CarMain {
		/*
		 * [�ǽ�]
		 * �迭(car Array)����, ���̴� 4
		 * �� ���� ������ �����ϴ� ����(total)
		 * Car ��ü 4���� �����ؼ� �迭�� ����
		 * �ݺ����� �̿��ؼ� �迭�� ����� ��ü ȣ��, ���� ���
		 * �ݺ��������� total�� ������ ������
		 * �ݺ����� �������ͼ� �ڵ��� �� ���� �ݾ��� ����Ͻÿ�.
		 */
	public static void main(String[] args) {
		Car[] carArray = new Car[4];
		int total = 0;
		
		//Car ��ü 4���� �����ؼ� �迭�� ����
		carArray[0] = new Car("�׷���","������",15000);
		carArray[1] = new Car("���","�Ͼ��",20000);
		carArray[2] = new Car("���׽ý�","ȸ��",30000);
		carArray[3] = new Car("����","�Ķ���",50000);
		
		//�迭�� ����� ��ü�� ȣ���ؼ� ������ ����ϰ�
		//������ �ջ�
		for(int i=0;i<carArray.length;i++) {
			System.out.println(
					"�̸� :" + carArray[i].getName());
			System.out.println(
					"���� :" + carArray[i].getColor());
			System.out.printf(
					"���� : %,d��%n",carArray[i].getPrice());
			System.out.println("----------------");
			//���� ����
			total += carArray[i].getPrice();
		}
		
		//�հ� �ݾ��� ���
		System.out.printf("�ڵ��� �� ���� �ݾ� : %,d��%n",total);
		
		System.out.println("========================");
		
		//Ȯ��for���� �̿��� �迭�� ��� ���
		for(Car car : carArray) {
			System.out.println("�̸� :" + car.getName());
			System.out.println("���� :" + car.getColor());
			System.out.printf("���� : %,d��%n",car.getPrice());
			System.out.println("---------------------");
		}
	}
}
