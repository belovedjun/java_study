public class OperatorMain05 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로
		 * 나누어 줄 때 학생당 몇 개를 가질 수 있고,
		 * 최종적으로 몇 개가 남는지를 구하시오,
		 * 
		 * [출력예시]
		 * 학생 한 명이 가지는 연필 수 : **
		 * 남은 연필 수 : **
		 */
		
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int quantity = pencils / students;
		int avg = 534 / 30;
		
		System.out.printf(
				"학생 한명이 가지는 연필 수 : %d%n", quantity);
		
		//남은 연필 수
		int rest = pencils % students;
		System.out.println("남은 연필 수 : " + rest);
	}
}
