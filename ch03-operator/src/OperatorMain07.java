public class OperatorMain07 {
	public static void main(String[] args) {
		System.out.println("===��������===");
		
		boolean a,b,result;
		a = true;
		b = false;
		
		//����(�־��� ���ǵ��� ��� true�϶��� true�� ��Ÿ��)(&&:���忣��)
		result = a && b;
		System.out.println("a && b : " + result);
		
		//����(�־��� ���ǵ��� �ϳ��� true�̸� true�� ��Ÿ��) (||:������������)
		result = a || b;
		System.out.println("a || b : " + result);
		
		//����(true�� false�� false�� true�� ��Ÿ��)
		result = !a;
		System.out.println("!a : " + result);
	}
}
