public class IfMain05 {
	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f; //��翬���ڸ� ����Ҷ� �ڷ����� ����ߵ�.
		
		if(a == b) {//int -> float, 10.0f == 10.0f
			System.out.println("10�� 10.0f�� ����");
		}
		
		char c = '0';//�ƽ�Ű�ڵ尪 char -> int�� �ڵ�����ȯ
		int d = 0;
		
		if(c != d) {//char -> int, 48 != 0
			System.out.println("'0'�� 0�� ���� �ʴ�."); //���� 0�� ���� 0�� ���� �ʴ�.
		}
		
		char e = 'A';
		int f = 65;
		
		if(e == f) {//char -> int, 65 ==65
			System.out.println("'A'�� 65�� ����.");
		}
	}

}
