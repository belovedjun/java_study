public class ArrayMain12 {
	public static void main(String[] args) {
		//2차원 배열
		int test[][]; //2차원 배열 선언
		test = new int[2][3]; //2행 3열
		
		//2차원 배열 초기화   //1차원은 선이고 2차원 면으로 이해.
		//행번호 열번호
		test[0][0] = 100;
 		test[0][1] = 200;      //철수 하나의 행이 한사람에 대한 정보
 		test[0][2] = 300;
 		
 		test[1][0] = 400;
 		test[1][1] = 500;      //영희
 		test[1][2] = 600;
 		
 		//배열의 요소를 출력
 		System.out.println(test[0][0]);
 		System.out.println(test[0][1]);
 		System.out.println(test[0][2]);
 		
 		System.out.println(test[1][0]);
 		System.out.println(test[1][1]);
 		System.out.println(test[1][2]);
 		
 		System.out.println("------------------");
 		//객체를 사용하기 때문에 2차원 배열은 사용하지 않음.(데이터입력,호출 방법 기억만!)
 		//자바같은경우 1차원 배열을 자주씀 (2차원 가끔, 3차원 거의 안씀)
 		//반복문을 이용해서 배열의 요소를 출력
 		for(int i=0;i<test.length;i++) {//i : 행번호 0~1   이중for문
 			for(int j=0;j<test[i].length;j++) {//j : 열번호 0~2
 				System.out.println(
 						"test["+i+"]["+j+"]:" + test[i][j]);
 				
 			}
 		}
 		//배열은 기본데이터를 가지고 출발함.
 		//배열의 선언 및 생성
 		int[][] test2 = new int[2][3];
 		
 		//배열의 선언, 생성(명시적 배열 생성), 초기화
 		int[][] test3 = new int[][] {
 			                        {10,20,30,40},
 			                        {50,60,70,80}
 				
 			                        };
 			                        
 	    //배열의 선언, 생성(암시적 배열 생성), 초기화 
 	    int[][] test4 = {
 	    		        {10,20,30},
 	    		        {40,50,60},
 	    		        {70,80,90} 
 	                    };
	}
}
