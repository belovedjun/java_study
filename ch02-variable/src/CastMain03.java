public class CastMain03 {
	public static void main(String[] args) {
		int a = 2;
		char b = 'A'; //아스키코드 65 컴퓨터는 숫자로 인식
		              //char->int 자동적 형변환
		int result =  a + b;//b -> 65
		System.out.println("result = " + result);
								//int->char 명시적(강제) 형변환
		System.out.println("result = " + (char)result);
		//아스키 코드로 인식
	}
}
