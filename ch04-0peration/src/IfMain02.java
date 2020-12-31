public class IfMain02 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("정수형 데이터 하나 입력:");
		int a = input.nextInt();
		
		if(a%2==1) {//홀수 (블럭)이true이면 수행
			System.out.println("홀수입니다.");	
		}else {//짝수 false일때 수행
		    System.out.println("짝수입니다");
		}
		input.close();
	}

}
