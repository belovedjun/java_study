public class PrintMain05 {
	public static void main(String[] args) {
		/*
		 * system.out.printf(���˹���,������)�� �̿��� ���
		 * (�������� ������ ǥ���� �� �ִ� ���˹��� ����)
		 */
		
		//����            ���˹���  ������
		System.out.printf("%c\n", 'A');//\n �ٹٲ� Ư������
		System.out.printf("%c%n", '��');//%n �ٹٲ� ���˹���
		System.out.printf("%c%n", 'X');
		
		System.out.println("------------");
		
		//����
		System.out.printf("%d%n", 67);
		System.out.printf("%,d%n",10000);
		
		System.out.println("------------");
		
		//�Ǽ�
		System.out.printf("%f%n",35.896);
		System.out.printf("%.3f%n", 35.896);
		System.out.printf("%.2f%n", 35.896);
		
		System.out.println("------------");
		
		//���ڿ�
		System.out.printf("%s%n", "����");
		
		System.out.println("------------");
		
		//������
		System.out.printf("%b%n", true);
		
		System.out.println("------------");
		
		//������ �ٸ� �����͸� ���� �� ���
		System.out.printf("%s�� %d���Դϴ�", "����", 98);
	}
}