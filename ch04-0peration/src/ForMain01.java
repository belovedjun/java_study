public class ForMain01 {
	public static void main(String[] args) {
			//초기식;조건식(5까지 증가할때까지 루프.);증감식
		for(int i=1;i<=5;i++) {//for문 시작 i : 1~5
			System.out.println(i);
		}//for문 끝
		
		System.out.println("----------------");
		//수행문이 한 줄일 경우 for {}블럭 생략 가능
		for(int i=1;i<=5;i++)
			System.out.println(i);
		
		System.out.println("프로그램 끝");

	}

}
