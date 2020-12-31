public class SwitchMain03 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		//switch 문은 ==만 사용가능.
		int score;
		char grade;
		
		System.out.printf("성적 입력>");
		score = input.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못 입력했습니다.");
			//프로그램 종료
			System.exit(0);
		}
		
		switch(score/10) {// 0~10
		case 10:
		case 9: grade = 'A'; break; //10하고 9는 같은코드를 공유한다.
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default : grade = 'F';
		}
		
		System.out.printf("점수 : %d%n", score);
		System.out.printf("등급 : %c%n", grade);
		
		input.close();
	}

}
