package com.s05.poly;

//�θ�Ŭ����
class Product{
	int price;//��ǰ ����
	int bonusPoint;//��ǰ ���Ž� �����Ǵ� ���ʽ� ����
	
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
	public String getName() {
		return "��ǰ";
	}
	
}
//�ڽ�Ŭ����
class Tv extends Product {
	public Tv() {
		//�θ�Ŭ������ ������ Ÿ���� int�� �����ڸ� ȣ��
		super(100);
	}
	//�޼��� �������̵�(������)
	@Override
	public String getName() {
		return "TV";
	}
}

class Computer extends Product{
	public Computer() {
		super(200);
	}
	@Override
	public String getName() {
		return "��ǻ��";
	}
}


class Audio extends Product{
	public Audio() {
		super(300);
	}
	@Override
	public String getName() {
		return "�����";
	}
}

class Buyer{
	int money = 1000;//1000����
	int bonusPoint = 0;
	
	public void buy(Product p) {//buy�� product�� ��ǰ�� �����ؼ� �����Ҽ��ִٴ� ����
		if(money < p.price) {
			System.out.println(
					"�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			//���� ���� �޼��带 ��������(�޼��� ����) void���϶� ����
			return;
		}
		
		money -= p.price;//���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint; //��ǰ�� ���ʽ� ������ ����
		
		System.out.println(p.getName() + "��/�� �����ϼ̽��ϴ�.");
		System.out.println("���� ���� ���� " + money + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + bonusPoint + "���Դϴ�.");
	}
}

public class PolyMain04 {
	public static void main(String[] args) {
		//������ ��ü ����
		Buyer b = new Buyer();
		//TV ��ü ����
		Tv tv = new Tv();
		//��ǻ�� ��ü ����
		Computer com = new Computer();
		//����� ��ü ����
		Audio au = new Audio();
		
		//�����ڰ� ��ǰ�� ����
		b.buy(tv);//Tv -> Product ����ȯ
		b.buy(com);//Computer -> Product ����ȯ
		b.buy(au);//Audio -> Product ����ȯ
		
	}
}












