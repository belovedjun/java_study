public class WhileMain04 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		int a = 0, total=0;
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		
		while(true) {
			System.out.print("누적할 숫자 입력>");
			a =input.nextInt();
			//입력한 값이 0이면 반복문을 빠져나감
			if(a==0) {
				break;
			}
			//누적
			total += a;
		}
		
		System.out.println("total = " + total);
		
		input.close();
	}

}
