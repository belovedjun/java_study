public class ArrayMain01 {
	public static void main(String[] args) {
		char[] ch;//배열 선언(배열생성x)만들준비. 주소를 만들기위해서~
		ch = new char[4];//배열 생성
		
		//배열 초기화 (연속적인 공간에 0->'j'...)
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열에 저장된 데이터(요소)를 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		//반복문을 이용해서 배열의 요소(저장된 데이터) 출력(코드절약할수있음)
					//배열의 길이(방의 개수)
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch["+i+"] : " + ch[i]);
			                    //ch[0] :까지생성   배열의 방 직접호출
		}   //순차적으로 증가 , i<4 0부터~3까지
		
		System.out.println("---------------");
		
		//배열의 선언, 생성
		int it[] = new int[6];
		//[]앞에 있어도 인식됨.
		
	   for(int i=0;i<it.length;i++) {
		   System.out.println(it[1]);//배열생성을 하면 데이터를 넣은적이 없는데 생겨있음
		                             //자료형(정수)이 기본값으로 초기화함. 
	   }
	   
	   System.out.println("-------------------");
	   
	   //1.배열의 선언, 생성(명시적 배열 생성), 초기화 
	   char[] ch2 = new char[] {'J','a','v','a'};//방의 길이 명시하면 에러, 원하는값만 명시.
	   
	   for(int i=0;i<ch2.length;i++) {
		   System.out.println(ch2[i]);
	   }
	   
	   //2.배열의 선언, 생성(암시적 배열 생성), 초기화
	   char[] ch3 = {'자','바'}; //new char 생략 가능
	}

}
