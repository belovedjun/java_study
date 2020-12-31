public class OperatorMain16 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * A전자 대리점에서할는 그날 물건 판매액의 15%를 할인
		 * 해주기로 했습니다. 판매한 상품명과 상품의 단가,
		 * 수량을 키보드로 입력받아서 지불 금액을 출력시키는
		 * 프로그램을 작성하시오.
		 * (단, 출력시에는 소수이하는 절삭<--정수)
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
		String item = input.next();//문자열만 가능
		System.out.print("단가 입력:");
		int price = input.nextInt();
		System.out.print("판매 수량:");
		int quantity = input.nextInt();
       //double 
		int total = (int)(price*quantity*0.85);
		
		System.out.printf(
		"%s %d대의 가격은 %,d원", item,quantity,total); 
		/*
		 * System.out.printf("상품명 입력 = %s%n", item);
		 * System.out.printf("단가 입력 = %d%n", price);
		System.out.printf("판매 = %d%n", quantity);
		System.out.printf("지불금액 : %.0f원%n", total);
		 */
	
		
		input.close();
	}

}
