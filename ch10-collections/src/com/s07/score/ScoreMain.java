package com.s07.score;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	BufferedReader br;
	ArrayList<Score> list;
	//생성자
	public ScoreMain() {
		list = new ArrayList<Score>();//생성자 생성
		try {
			br = new BufferedReader(
					new InputStreamReader(System.in));//표준입력
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	//메뉴
	public void callMenu()throws IOException {
		while(true) {
			System.out.print(
					"1.성적입력,2.성적출력,3.종료>");
			
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input();
				}else if(num == 2) {
					output();
				}else if(num == 3) {
					System.out.println("성적관리를 종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요!");
			}
		}
		
	}
	//성적입력
	public void input()throws IOException {
		Score s =new Score();
		System.out.print("이름 입력:");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("국어 입력:"));//검증해주는 메서드
		s.setEnglish(parseInputData("영어 입력:"));
		s.setMath(parseInputData("수학 입력:"));
		
		//Score 객체를 ArrayList에 저장
		list.add(s);
	}
	//성적출력
	public void output() {
		System.out.println("=====================");
		System.out.println(
			  "이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("=====================");
		for(Score s : list) {
			System.out.printf("%s\t", s.getName());
			System.out.printf("%d\t", s.getKorean());
			System.out.printf("%d\t", s.getEnglish());
			System.out.printf("%d\t", s.getMath());
			System.out.printf("%d\t", s.makeSum());
			System.out.printf("%.2f\t", s.makeAvg());
			System.out.printf("%s\n", s.makeGrade());
		}
	}
	
	//성적 입력시 0~100 범위로 입력하는지 여부 체크
	public int parseInputData(String cours)
								throws IOException{
		while(true) {
			System.out.println(cours);
			try {
				int num = Integer.parseInt(
									br.readLine());
				if(num < 0 || num > 100) {
					throw new ScoreValueException(
							     "0~100사이의 값만 인정!!");
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요!");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new ScoreMain();
	}
}
