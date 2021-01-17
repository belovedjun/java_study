package com.s01.list;

import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		
		//요소를 저장
		v.add(100.3); //add는 저장
		v.add(3.14);
		v.add(1000.);//=1000.0으로 인식
		
		//확장 for문을 이용한 요소의 출력
		for(Double n : v) {
			System.out.println(n);
		}
		
		//자원검색
		double search = 1000.0; //검색할 요소
		int index = v.indexOf(search); //index 기능이 같다
		if(index != -1) {
			System.out.println(
					"검색 요소 " + search + "의 위치 : " + index);
		}else {
			System.out.println(
					"검색 요소 " + search + "이 없습니다.");
		}
		
		//자원 삭제
		double del = 3.14;
		//인자로 전달된 요소가 Vector의 요소인지 검사
		if(v.contains(del)) {
			v.remove(del);//삭제
			System.out.println(del + "삭제 완료!");
		}
		
		//Vector에 저장된 요소의 목록
		System.out.println(v);
		
		
	}
}
