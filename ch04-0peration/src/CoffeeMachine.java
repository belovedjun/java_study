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
		
        while(true) {
        	System.out.printf("1.Ŀ�Ǹ��ñ�, 2.����>");
        	int num = input.nextInt();
        	if(num == 1) {
        		System.out.printf("���� �Է�>");
        		int payment = input.nextInt();
        		int change = payment-price;
        		if(payment < price) {
        			System.out.println("������ �ݾ� ����!");
        			continue;
        		}
        		if(coin < change) {
        			System.out.println("�Ž����� ����!");
        			continue;
        		}
        		coin -= change;
        		amount += payment;
  
        		System.out.printf("�Ž����� : %d��%n",change);
        		System.out.println("�� ���� Ŀ�ǰ� ���Խ��ϴ�");
        		
        		System.out.println("==���� ���Ǳ� ����==");
        		System.out.printf("���� ���� �ݾ� : %d��%n",coin);
        		System.out.printf("�� ���� �ݾ� : %d��%n",amount);
        	}else if (num == 2){
        		System.out.println("���Ǳ� ���α׷� ����");
        		break;
       	}else {
       		System.out.println("�߸� �Է��߽��ϴ�.");
       	}
      }	
		input.close();
	}
}
