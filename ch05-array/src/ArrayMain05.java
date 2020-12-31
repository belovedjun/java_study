public class ArrayMain05 {
	public static void main(String[] args) {
		//배열 선언,생성,초기화
		int[] array = {10,20,30,40,50,60};//많은 경우가 처음부터 데이터를 초기화하고 출발함.
		
		//반복문을 이용한 배열의 요소 출력(일반적으로 배열의 요소에 접근할때 for문을 사용)
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"] : " + array[i]);
		}
		System.out.println("-------------------");
		
		//개선된 루프(확장 for문)
		//num배열의 요소가 저장되는 변수 : 배열명
		for(int num : array) {
			System.out.println(num);//데이터 출력
		}
	}

}
