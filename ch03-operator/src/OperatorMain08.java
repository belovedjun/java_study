public class OperatorMain08 {
	public static void main(String[] args) {
		//����������1, �񱳿�����4, ��������    6����  
		
		int a, b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++;
			   //   10      11
		       //     false         X
		System.out.println(a + ", " + b);
		System.out.println("���� c�� �� : " + c);
		
		System.out.println("-----------------");
		
		int d, e;
		d = e = 10;
		                 //�޸𸮿��� e�� 11
		boolean f = ++d < e++ || d++ >= ++e;
		       //   11    10      11     12
		       //     false         O
		
		System.out.println(d + ", " + e);//12, 12
		System.out.println("���� f�� �� : " + f);//false
		
		
	}
}
