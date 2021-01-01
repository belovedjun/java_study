public class ArrayMain11 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 단을 입력받아서 1~9까지 곱해서 값을 구하는데
		 * 각각의 값을 배열에 저장한 후 출력하시오.
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		//단 입력
		System.out.print("단 입력:");
		int dan = input.nextInt();
		System.out.println("===" + dan + "단===");
		
		int[] array = new int[9];
		
		//1부터 9까지 곱해서 결과값을 구하고 배열에 저장
		//저장된 데이터를 구구단 출력 형식(2*1=2)출력
		for(int i=0;i<array.length;i++) {
			//연산의 결과값             //배열은 index가 0부터 출발함.
	        array[i] = dan * (i + 1);//i -> 0~8 , 9를 추가하기위해서 i+1
	                         //i 1~8번만 들어감, 0이 빠져서 문제생김              
	        System.out.println(dan + "*" + (i+1) + "=" + array[i]);
		}                                                //배열 명시
		
		input.close();
	}

}
