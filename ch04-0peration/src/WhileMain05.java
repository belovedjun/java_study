public class WhileMain05 {
	public static void main(String[] args) {
		//은행 프로그램
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		int balance = 0; //초기값은 상황에 따라 달라짐
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			
		    System.out.print("메뉴 선택>");
		    int num = input.nextInt();
		    
		    if(num == 1) {
		    	System.out.print("예금액>");
		    	//누적 (대입연산자 사용)
		    	balance += input.nextInt();//잔고
		    }else if(num == 2) {
		    	System.out.print("출금액>");
		    	//차감
		    	balance -= input.nextInt();
		    }else if(num == 3) {
		    	System.out.printf("잔고 : %,d원%n",balance);
		    }else if(num == 4) {
		    	System.out.println("프로그램 종료");
		    	break;//while문을 빠져나감
		    }else {
		    	System.out.println("잘못 입력했습니다.");
		    }
		}
		
		input.close();
	}

}
