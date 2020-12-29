public class IfMain08 {
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
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int first = 0, second = 0, result =0;
		String operator;
		
		System.out.print("첫번째 수:");
		first = input.nextInt();
		
		System.out.print("연산자:");
		operator = input.next();
		
		System.out.print("두번째 수:");
		second = input.nextInt();
		
		
		if(operator.equals("+")) {
			result = first + second;
		}else if(operator.equals("-")) {
			result = first - second;
		}else if(operator.equals("*")) {
			result = first * second;
		}else if(operator.equals("/")) {
			if(second!=0 ) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌수 없습니다.");
				//프로그램 종료
				System.exit(0);
			}
		}else if(operator.equals("%")) {
			if(second!=0) {
				result = first % second;
			}else {
				System.out.println("0으로 나눌수 없습니다.");
				//프로그램종료
				System.exit(0);
			}
		}else {
			System.out.println("잘못된 연산자 입력");
			//프로그램 종료
			System.exit(0);
		}
		
		System.out.printf(
				"%d %s %d = %d", first,operator,second,result);
		
		input.close();
		//operator == "+" x
		//operator.equals("+") O
		//operator에 저장된 문자열과 "+"같으면 true
		//                          다르면 false
		//if(operator.equals("+")){
		//덧셈
	    //}
		
	}

}
