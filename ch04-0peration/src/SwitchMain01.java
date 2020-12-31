public class SwitchMain01 {
	public static void main(String[] ares) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.printf("정수 하나 입력>");
		int a = input.nextInt();
		      //인자값
		switch(a) {//long형을 제외한 정수형(byte,short,int)
				   //char (int로 형변환 가능)
		case 1://조건값과 인자값이 일치하면 수행문 실행
			System.out.println("1입력");
			break;
		case 2:
			System.out.println("2입력");
			break;
		case 3:
			System.out.println("3입력");
			break;
		default : //다중if문 else같은 마무리 역할
			System.out.println("1,2,3이 아닌 숫자 입력");
		
		}
		
		input.close();
	}
}
