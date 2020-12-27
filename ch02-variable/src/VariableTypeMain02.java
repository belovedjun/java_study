import javax.sound.midi.SysexMessage;

public class VariableTypeMain02 {
	public static void main(String[] args ) {
		System.out.println("===정수형===");
		//byte, 크기 : 1byte, 표현범위 : -128~127 (중요!)
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		
		//short, 크기 : 2byte, 표현범위 : -32,768 ~ 32,767 (중요!)
		short s1=32767;
		System.out.println("s1 = " + s1);
		
		//int, 크기 : 4byte, 
		//표현범위 : -20억대~ 20억대
		//정수를 표현할 때 기본 사용 (중요!)
		int in = 12345;
		System.out.println("in = " + in);
		
		//long, 크기 : 8byte (중요!)
		long lg = 12345L;
		System.out.println("lg = " + lg);
		
		System.out.println("===실수형===");
		//float, 크기 : 4byte (중요!)
		float f1 = 9.1f; //f를 안붙이면 double로 인식 에러 (접미사 붙이는거 잊지않기!)
		System.out.println("f1 = " + f1);
		
		//double, 크기 : 8 byte (중요!)
		//실수를 표현할 때 기본 사용
		double du = 9.8;
		System.out.println("du = " + du);
		
		System.out.println("===문자열===");
		//문자열을 표시할 때 참조자료형을 사용함.
		String str = "Hello world!";
		System.out.println("str = " + str);	
	}
}
