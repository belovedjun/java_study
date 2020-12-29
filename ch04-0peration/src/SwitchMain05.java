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
		int first = 0, second = 0, result =0;
		String operator;
		
		System.out.print("첫번째 수:");
		first = input.nextInt();
		
		System.out.print("두번째 수:");
		operator = input.next();
		
		System.out.print("세번째 수:");
		second = input.nextInt();
		
		switch(operator) {
		case "+":
		 result = first + second;
		  break;
		case "-":
		 result = first - second;
		  break;
		case "*":
		 result = first * second;
		  break;
		case "/":
		  result = first / second;
		  if(second!=0) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌수 없습니다.");
				System.exit(0);
			}
		break;
		case "%":
		 result = first % second;
		 if(second!=0) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌수 없습니다.");
				System.exit(0);
			}
		 break; 
		default:
		 System.out.println("잘못된 연산자 입력");
		 System.exit(0);
		}
		
		System.out.printf(
				"%d %s %d = %d", first,operator,second,result);
		
		input.close();
	}

}
