public class SwitchMain05 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 2개를 입력하고 연산자(+,-,*,/,%)를 입력해서 
		 * 결과값을 구하고 결과값을 출력하시오.
		 * 
		 * [출력예시]
		 * 첫번째 수:10
		 * 연산자:-
		 * 두번째 수:5
		 * 10 - 5 = 5
		 */
		
		/*
		 * switch(operator){
		 * case "+":
		 * 		수행문;
		 *      break;
		 *}
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int result =0; //0으로 초기화를 해야됨. 컴파일 할때
		
		System.out.print("첫번째 수:");
		int first = input.nextInt();
		System.out.print("연산자:");
		String operator = input.next();
		System.out.print("세번째 수:");
		int second = input.nextInt();
		
		switch(operator) {
		case "+":
		 result = first + second;break;
		case "-":
		 result = first - second;break;
		case "*":
		 result = first * second;break;
		case "/":
		  if(second!=0) {
				result = first / second;break;
			}else {
				System.out.println("0으로 나눌수 없습니다."); //0으로 나누는 경우 문제발생
				System.exit(0); //프로그램 종료
			}
		case "%":
		 if(second!=0) {
				result = first % second;break;
			}else {
				System.out.println("0으로 나눌수 없습니다.");
				System.exit(0); //프로그램 종료
			} 
		default:
		 System.out.println("잘못된 연산자 입력");
		 System.exit(0); //프로그램 종료
		}
		
		System.out.printf(
				"%d %s %d = %d", first,operator,second,result);
		
		input.close();
	}

}
