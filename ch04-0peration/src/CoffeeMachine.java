public class CoffeeMachine {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 커피를 주문하는 커피 머신에서 커피를 주문하고
		 * 돈을 지불하면 보유한 동전의 양을 체크해서 동전이
		 * 있으면 거스름돈을 지불하고 동전이 부족하면
		 * "거스름돈 부족" 이라고 출석하는 프로그램 작성
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		//커피가격
		int price = 300;
		//보유 금액
		int amount = 0; //+
		//보유 동전(거스름돈)
		int coin = 1000; //-
		
		// 계속 반복하여 아래의 코드를 실행한다.
		while(true) {
			System.out.print("원하시는 행동을 선택해주세요. 1:커피마시기,2:종료>");
			// 사용자가 하려는 행동의 숫자
			int num = input.nextInt();
			// 커피마시기 
			if(num == 1) {
				System.out.printf("동전 입력>"); //한잔만 뽑기 가능
				// 보유금액				
				int payment = input.nextInt(); 
				//거스름돈(change) 연산
				int change = payment - price;
				//지불 금액 입력(payment)
				
				
				//거스름돈 지불 여부 체크
				if(coin < change) {
					//거스름돈을 지불할 수 없으면
					//"거스름돈 부족"
					System.out.println("거스름돈 부족!");
					continue;
				}
				
				//거스름돈을 지불할 수 있으면
				//coin에서 change를 차감
				//거스름돈을 출력함
				coin -= change;
				//payment를 amount에 누적
				amount += payment;
				
				//거스름돈을 출력함
				System.out.printf("거스름돈 : %,d%n", change);
				System.out.println(
						"맛 좋은 커피가 준비되었습니다.");
				
				//현재 자판기 정보 출력
				System.out.println("==현재자판기 정보==");
				System.out.printf("동전보유금액: %,d원%n",coin);
				System.out.printf("총투입금액: %,d원%n",amount);
				
			}else if(num == 2) {
				System.out.println("자판기 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력했습니다.");
			}
		}
		input.close();
	}
}
