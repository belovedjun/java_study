public class OperatorMain15 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 3개의 정수를 입력받아서 최대값, 최소값을 출력하는
		 * 프로그램을 작성하시오.
		 * 
		 * 3개의 정수를 저장하는 변수명(first,second,third)
		 * 최대값을 저장하는 변수명(max)
		 * 최소값을 저장하는 변수명(min)
		 */
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		System.out.print("첫번째 정수:");
		int first = input.nextInt();
		System.out.print("두번째 정수:");
		int second = input.nextInt();
		System.out.print("세번째 정수:");
		int third = input.nextInt();
		
		//최대값 구하기
				//     조건       ? 참값   : 거짓값
		int max = first > second ? first : second;
			//    조건     ? 참값  : 거짓값
		max = max > third ? max : third;
		System.out.printf("최대값 = %d%n ", max);
		
		//최소값 구하기
		 	//          조건      ? 참값    : 거짓값
		int min = first > second ? first : second;
         //      조건      ? 참값    : 거짓값
		min = min < third ? min : third;
		System.out.printf("최소값 = %d%n ", min);
		
		input.close();
	}

}
