public class WhileMain06 {
	public static void mian(String[] args) {
		/*
		 * [�ǽ�] while���� ���������� ���
		 * Ŀ������������ �Ƹ޸�ī�밡 4,000�� �Դϴ�.
		 * ���� Ŀ�� ������ ���ϰ� ���� �����ϼ���.
		 * ������ ������ �߻��� �Ž������� ����ϰ� ��ǰ��
		 * �� ��뺸�� ������ ���� ��� ��ǰ�� �����Ҽ�
		 * ���� ��� "�ݾ��� �����մϴ�."��� �˷��� ��
		 * �ٽ� ������ �� �ִ� ���α׷� �ۼ�
		 * 
		 * [���� ����]
		 * ==while���� ���������� ���==
		 * ���� ���� �Է�:2
		 * ���� ������ �ݾ�:10000
		 * �Ž�����:2,000��
		 * 
		 * ==while���ȿ� �����ִ� ���==
		 * ���� ���� �Է�:2
		 * ���� ������ �ݾ�:5000
		 * 3,000���� �����մϴ�.
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int price = 4000; //Ŀ�� ����
		// ���ż���,�Ž�����,���� ���ұݾ�,���� �� �ݾ�
		int quantity,balance,payment,total;
		
		while(true) {
			//���ż��� �Է�
			System.out.print("���� ���� �Է�>");
			quantity = input.nextInt();
			//���� ������ �ݾ� �Է�
			System.out.print("���� ������ �ݾ�>");
			payment = input.nextInt();
			//���� �� �ݾ� ���ϱ�
			total = price * quantity;
			//�Ž����� ���� üũ
			balance = payment - total;
			if(balance >= 0) {
				break;//while���� ��������
			}
			System.out.printf("%,d���� �����մϴ�.%n",balance);
			
		}
		//�Ž����� ���
		System.out.printf("�Ž����� : %,d��", balance);
		
		input.close(); //break�� �־��ָ� ����ǥ�� �����. ������

	}

}
