public class OperatorMain13 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ����(korean),����(english),����(math) ������
		 * �Է¹޾Ƽ� ����(sum), ���(avg)�� ���ϰ�
		 * ����,����,����,����,����� ���
		 * �ڷ��� : ����,����,����,���� -> int 
		 *        ��� -> double
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in); //����¹���
		System.out.print("����:");
		int korean = input.nextInt();//������ ���
		System.out.print("����:");
		int english = input.nextInt();
		System.out.print("����:");
		int math = input.nextInt();
		
		//�������ϱ�
		int sum = korean + english + math;
		//��ձ��ϱ�	 
		double avg = sum / 3.0;
		
		System.out.printf("���� = %d%n", korean);
		System.out.printf("���� = %d%n", english);
		System.out.printf("���� = %d%n", math);
		System.out.printf("���� : %d��%n", sum);
	    System.out.printf("��� : %.1f��%n", avg);
		
		
		
		
		
		input.close();
	}

}


