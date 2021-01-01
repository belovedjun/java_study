public class ForMain04 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("단 입력:");
		int dan = input.nextInt(); //문자열 입력할때는 next, nextInt 정수만 출력
		
		System.out.println(dan + "단");
		System.out.println("--------------");
		
		for(int i=1;i<=9;i++) {
			System.out.println(
					dan + "*" + i + "=" + dan * i); 
		}
		input.close(); //반복문을 사용할때 무한루프에 빠지지 않게주의

	}

}
