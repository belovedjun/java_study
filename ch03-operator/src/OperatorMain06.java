public class OperatorMain06 {
	public static void main(String[] args) {
		System.out.println("===비교(관계)연산자===");
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a > b;//10.0 > 10.5
		System.out.println("a > b : " + result);
		
		result = a < b;//10.0 < 10.5
		System.out.println("a < b : " + result);
		
		result = a >= b;//10.0 >= 10.5
		System.out.println("a >= b : " + result);
		
		result = a <= b;//10.0 <= 10.5
		System.out.println("a <= b : " + result);
		
		result = a== b;//10.0 == 10.05
		System.out.println("a == b " + result);
		
		result = a != b;//10.0 != 10.5
		System.out.println("a != b : "+ result);
	}
}
