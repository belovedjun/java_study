public class CoffeeMachine {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * Ŀ�Ǹ� �ֹ��ϴ� Ŀ�� �ӽſ��� Ŀ�Ǹ� �ֹ��ϰ�
		 * ���� �����ϸ� ������ ������ ���� üũ�ؼ� ������
		 * ������ �Ž������� �����ϰ� ������ �����ϸ�
		 * "�Ž����� ����" �̶�� �⼮�ϴ� ���α׷� �ۼ�
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		//Ŀ�ǰ���
		int price = 300;
		//���� �ݾ�
		int amount = 0; //+
		//���� ����(�Ž�����)
		int coin = 1000; //-
		
		// ��� �ݺ��Ͽ� �Ʒ��� �ڵ带 �����Ѵ�.
		while(true) {
			System.out.print("���Ͻô� �ൿ�� �������ּ���. 1:Ŀ�Ǹ��ñ�,2:����>");
			// ����ڰ� �Ϸ��� �ൿ�� ����
			int num = input.nextInt();
			// Ŀ�Ǹ��ñ� 
			if(num == 1) {
				System.out.printf("���� �Է�>"); //���ܸ� �̱� ����
				// �����ݾ�				
				int payment = input.nextInt(); 
				//�Ž�����(change) ����
				int change = payment - price;
				//���� �ݾ� �Է�(payment)
				
				
				//�Ž����� ���� ���� üũ
				if(coin < change) {
					//�Ž������� ������ �� ������
					//"�Ž����� ����"
					System.out.println("�Ž����� ����!");
					continue;
				}
				
				//�Ž������� ������ �� ������
				//coin���� change�� ����
				//�Ž������� �����
				coin -= change;
				//payment�� amount�� ����
				amount += payment;
				
				//�Ž������� �����
				System.out.printf("�Ž����� : %,d%n", change);
				System.out.println(
						"�� ���� Ŀ�ǰ� �غ�Ǿ����ϴ�.");
				
				//���� ���Ǳ� ���� ���
				System.out.println("==�������Ǳ� ����==");
				System.out.printf("���������ݾ�: %,d��%n",coin);
				System.out.printf("�����Աݾ�: %,d��%n",amount);
				
			}else if(num == 2) {
				System.out.println("���Ǳ� ���α׷� ����");
				break;
			}else {
				System.out.println("�߸��� �Է��߽��ϴ�.");
			}
		}
		input.close();
	}
}
