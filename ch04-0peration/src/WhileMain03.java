public class WhileMain03 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		int a = 0, total = 0;
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		    //조건식
		while(true) {
			System.out.print("누적할 숫자 입력>");
			a =input.nextInt();
			if(a!=0) {
				//누적
				total += a;
			}else {//a == 0
				System.out.println("total = " + total);
				input.close();
				//프로그램 종료 break;사용 가능
				System.exit(0);
			}
		}
	}
}
