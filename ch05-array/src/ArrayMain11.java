public class ArrayMain11 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� �Է¹޾Ƽ� 1~9���� ���ؼ� ���� ���ϴµ�
		 * ������ ���� �迭�� ������ �� ����Ͻÿ�.
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		//�� �Է�
		System.out.print("�� �Է�:");
		int dan = input.nextInt();
		System.out.println("===" + dan + "��===");
		
		int[] array = new int[9];
		
		//1���� 9���� ���ؼ� ������� ���ϰ� �迭�� ����
		//����� �����͸� ������ ��� ����(2*1=2)���
		for(int i=0;i<array.length;i++) {
			//������ �����             //�迭�� index�� 0���� �����.
	        array[i] = dan * (i + 1);//i -> 0~8 , 9�� �߰��ϱ����ؼ� i+1
	                         //i 1~8���� ��, 0�� ������ ��������              
	        System.out.println(dan + "*" + (i+1) + "=" + array[i]);
		}                                                //�迭 ���
		
		input.close();
	}

}
