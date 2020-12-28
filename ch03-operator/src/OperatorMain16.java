public class OperatorMain16 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * A전자 대리점에서는 그날 물건 판매액의 15%를 할인
		 * 해주기로 했습니다. 판매한 상품명과 상품의 단가,
		 * 수량을 키보드로 입력받아서 지불 금액을 출력시키는
		 * 프로그램을 작성하시오.
		 * (단, 출력시에는 소수이하는 절삭)
		 * 
		 * [출력예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 냉장고 3대의 가격은 1,275,000원
		 */
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		System.out.print("상품명 입력:");
		String item = input.next();
		int price = input.nextInt();
		System.out.print("단가 입력:");
		int quantity = input.nextInt();
		System.out.print("판매 수량:");
		System.out.print("지불금액 : %.1f원%n");
		
		
		input.close();
	}

}
