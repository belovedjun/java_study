public class OperatorMain16 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * A���� �븮�������� �׳� ���� �Ǹž��� 15%�� ����
		 * ���ֱ�� �߽��ϴ�. �Ǹ��� ��ǰ��� ��ǰ�� �ܰ�,
		 * ������ Ű����� �Է¹޾Ƽ� ���� �ݾ��� ��½�Ű��
		 * ���α׷��� �ۼ��Ͻÿ�.
		 * (��, ��½ÿ��� �Ҽ����ϴ� ����)
		 * 
		 * [��¿���]
		 * ��ǰ�� �Է� : �����
		 * �ܰ� �Է� : 500000
		 * �Ǹ� ���� �Է� : 3
		 * ����� 3���� ������ 1,275,000��
		 */
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		System.out.print("��ǰ�� �Է�:");
		String item = input.next();
		int price = input.nextInt();
		System.out.print("�ܰ� �Է�:");
		int quantity = input.nextInt();
		System.out.print("�Ǹ� ����:");
		System.out.print("���ұݾ� : %.1f��%n");
		
		
		input.close();
	}

}
