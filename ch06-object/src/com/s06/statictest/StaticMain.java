package com.s06.statictest;

public class StaticMain {
	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println(         //클래스명 붙여서 호출
	"c : " + sc1.c + ", count : " + StaticCount.count);
		
		StaticCount sc2 = new StaticCount();
		System.out.println(
   "c : " +  sc2.c + ", count : " + StaticCount.count);
		
		StaticCount sc3= new StaticCount();
		System.out.println(
	"c : " +  sc3.c + ", count : " + StaticCount.count);
	}
}
