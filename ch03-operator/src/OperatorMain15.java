public class OperatorMain15 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * 3���� ������ �Է¹޾Ƽ� �ִ밪, �ּҰ��� ����ϴ�
		 * ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * 3���� ������ �����ϴ� ������(first,second,third)
		 * �ִ밪�� �����ϴ� ������(max)
		 * �ּҰ��� �����ϴ� ������(min)
		 */
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		System.out.print("ù��° ����:");
		int first = input.nextInt();
		System.out.print("�ι�° ����:");
		int second = input.nextInt();
		System.out.print("����° ����:");
		int third = input.nextInt();
		
		//�ִ밪 ���ϱ�
				//     ����       ? ����   : ������
		int max = first > second ? first : second;
			//    ����     ? ����  : ������
		max = max > third ? max : third;
		System.out.printf("�ִ밪 = %d%n ", max);
		
		//�ּҰ� ���ϱ�
		 	//          ����      ? ����    : ������
		int min = first > second ? first : second;
         //      ����      ? ����    : ������
		min = min < third ? min : third;
		System.out.printf("�ּҰ� = %d%n ", min);
		
		input.close();
	}

}
