public class OperatorMain13 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 국어(korean),영어(english),수학(math) 성적을
		 * 입력받아서 총점(sum), 평균(avg)을 구하고
		 * 국어,영어,수학,총점,평균을 출력
		 * 자료형 : 국어,영어,수학,총점 -> int 
		 *        평균 -> double
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in); //입출력문법
		System.out.print("국어:");
		int korean = input.nextInt();//정수만 출력
		System.out.print("영어:");
		int english = input.nextInt();
		System.out.print("수학:");
		int math = input.nextInt();
		
		//총점구하기
		int sum = korean + english + math;
		//평균구하기	 
		double avg = sum / 3.0;
		
		System.out.printf("국어 = %d%n", korean);
		System.out.printf("영어 = %d%n", english);
		System.out.printf("수학 = %d%n", math);
		System.out.printf("총점 : %d점%n", sum);
	    System.out.printf("평균 : %.1f점%n", avg);
		
		
		
		
		
		input.close();
	}

}


