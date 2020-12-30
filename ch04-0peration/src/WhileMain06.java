public class WhileMain06 {
	public static void mian(String[] args) {
		/*
		 * [실습] while문을 빠져나가는 경우
		 * 커피전문점에서 아메리카노가 4,000원 입니다.
		 * 마실 커피 수량을 정하고 돈을 지불하세요.
		 * 지불한 돈에서 발생한 거스르돈을 출력하고 상품의
		 * 총 비용보다 지불한 돈이 적어서 상품을 구매할수
		 * 없을 경우 "금액이 부족합니다."라고 알려준 후
		 * 다시 지불할 수 있는 프로그램 작성
		 * 
		 * [실행 예시]
		 * ==while문을 빠져나가는 경우==
		 * 구매 수량 입력:2
		 * 내가 지불한 금액:10000
		 * 거스름돈:2,000원
		 * 
		 * ==while문안에 남아있는 경우==
		 * 구매 수량 입력:2
		 * 내가 지불한 금액:5000
		 * 3,000원이 부족합니다.
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int price = 4000; //커피 가격
		// 구매수량,거스름돈,내가 지불금액,구매 총 금액
		int quantity,balance,payment,total;
		
		while(true) {
			//구매수량 입력
			System.out.print("구매 수량 입력>");
			quantity = input.nextInt();
			//내가 지불한 금액 입력
			System.out.print("내가 지불한 금액>");
			payment = input.nextInt();
			//구매 총 금액 구하기
			total = price * quantity;
			//거스름돈 조건 체크
			balance = payment - total;
			if(balance >= 0) {
				break;//while문을 빠져나감
			}
			System.out.printf("%,d원이 부족합니다.%n",balance);
			
		}
		//거스름돈 출력
		System.out.printf("거스름돈 : %,d원", balance);
		
		input.close(); //break를 넣어주면 에러표시 사라짐. 컴파일

	}

}
