public class OperatorMain16 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * A���� �븮�������Ҵ� �׳� ���� �Ǹž��� 15%�� ����
		 * ���ֱ�� �߽��ϴ�. �Ǹ��� ��ǰ��� ��ǰ�� �ܰ�,
		 * ������ Ű����� �Է¹޾Ƽ� ���� �ݾ��� ��½�Ű��
		 * ���α׷��� �ۼ��Ͻÿ�.
		 * (��, ��½ÿ��� �Ҽ����ϴ� ����<--����)
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
		String item = input.next();//���ڿ��� ����
		System.out.print("�ܰ� �Է�:");
		int price = input.nextInt();
		System.out.print("�Ǹ� ����:");
		int quantity = input.nextInt();
       //double 
		int total = (int)(price*quantity*0.85);
		
		System.out.printf(
		"%s %d���� ������ %,d��", item,quantity,total); 
		/*
		 * System.out.printf("��ǰ�� �Է� = %s%n", item);
		 * System.out.printf("�ܰ� �Է� = %d%n", price);
		System.out.printf("�Ǹ� = %d%n", quantity);
		System.out.printf("���ұݾ� : %.0f��%n", total);
		 */
	
		
		input.close();
	}

}
