public class OperatorMain06 {
	public static void main(String[] args) {
		System.out.println("===��(����)������===");
		boolean result; 
		int a = 10; //(������ ���� �ʱ�ȭ)
		double b = 10.5;//(�Ǽ��� ���� �ʱ�ȭ)
		
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
