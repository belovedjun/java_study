public class OperatorMain11 {
	public static void main(String [] args) {
		System.out.println("===조건(삼항)연산자===");
		
		char ch = 'b';
		String s;
			//       조건       ? 참값 : 거짓값   
		s =(ch>='A' && ch<='z') ? "대문자가 아님" : "대문자임";
		
		System.out.println(ch + "=>" + s);
	}

}
