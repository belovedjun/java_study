public class IfMain06 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 하나를 입력받아서 짝수이면 10을 더하고 홀수이면
		 * 20을 더하여 결과값을 출력하시오.
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
	    int a, result;
	    System.out.print("정수 하나 입력>");
	    a = input .nextInt();
	    
		if(a%2==0){//짝수
			result = a + 10;
		}else {//홀수
			result = a + 20;
		}
		
		System.out.println(result);
		
		input.close();
	}

}
