public class ForMain03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1;i<=100;i++) {
			//누적 (대입연산자가 코드가 제일간다)
			sum += i;//sum = sum + i // 증가 +=
		}
		//차감은 -=생각
		System.out.println("1부터 100까지의 합 : " + sum);
	
	}

}
