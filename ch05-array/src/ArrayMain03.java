public class ArrayMain03 {
	public static void main(String[] args) {
		//배열의 선언, 생성(암시적 배열 생성), 초기화
		int[] score = {100,88,88,100,90};//배열을 사용하면 코드절약
		int sum = 0;
		float average = 0.0f;
		
		//반복문을 이용해서 배열의 요소를 호출(반복문 사용으로 코드 심플)
		for(int i=0;i<score.length;i++) {
			//총점구하기 (누적)
			sum += score[i];
		}
		//평균구하기
		average = sum / 5.0f;
		average = sum / (float)score.length;
		
		System.out.printf("총점 : %d%n",sum);
		System.out.printf("평균 : %.2f",average);
		
		
		
		
	}
}
