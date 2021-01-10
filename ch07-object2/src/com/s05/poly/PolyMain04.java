package com.s05.poly;

//부모클래스
class Product{
	int price;//제품 가격
	int bonusPoint;//제품 구매시 제공되는 보너스 점수
	
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
	public String getName() {
		return "상품";
	}
	
}
//자식클래스
class Tv extends Product {
	public Tv() {
		//부모클래스의 인자의 타입이 int인 생성자를 호출
		super(100);
	}
	//메서드 오버라이딩(재정의)
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
		return "컴퓨터";
	}
}


class Audio extends Product{
	public Audio() {
		super(300);
	}
	@Override
	public String getName() {
		return "오디오";
	}
}

class Buyer{
	int money = 1000;//1000만원
	int bonusPoint = 0;
	
	public void buy(Product p) {//buy를 product로 제품을 통합해서 나열할수있다는 장점
		if(money < p.price) {
			System.out.println(
					"잔액이 부족하여 물건을 살 수 없습니다");
			//실행 중인 메서드를 빠져나감(메서드 종료) void형일때 가능
			return;
		}
		
		money -= p.price;//가진 돈에서 구입한 제품의 가격을 차감
		bonusPoint += p.bonusPoint; //제품의 보너스 점수를 누적
		
		System.out.println(p.getName() + "을/를 구입하셨습니다.");
		System.out.println("현재 남은 돈은 " + money + "만원입니다.");
		System.out.println("현재 포너스 점수는 " + bonusPoint + "점입니다.");
	}
}

public class PolyMain04 {
	public static void main(String[] args) {
		//구매자 객체 생성
		Buyer b = new Buyer();
		//TV 객체 생성
		Tv tv = new Tv();
		//컴퓨터 객체 생성
		Computer com = new Computer();
		//오디오 객체 생성
		Audio au = new Audio();
		
		//구매자가 상품을 구매
		b.buy(tv);//Tv -> Product 형변환
		b.buy(com);//Computer -> Product 형변환
		b.buy(au);//Audio -> Product 형변환
		
	}
}












