public class IfMain06 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� �ϳ��� �Է¹޾Ƽ� ¦���̸� 10�� ���ϰ� Ȧ���̸�
		 * 20�� ���Ͽ� ������� ����Ͻÿ�.
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
	    int a, result;
	    System.out.print("���� �ϳ� �Է�>");
	    a = input .nextInt();
	    
		if(a%2==0){//¦��
			result = a + 10;
		}else {//Ȧ��
			result = a + 20;
		}
		
		System.out.println(result);
		
		input.close();
	}

}
