public class SwitchMain01 {
	public static void main(String[] ares) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.printf("���� �ϳ� �Է�>");
		int a = input.nextInt();
		      //���ڰ�
		switch(a) {//long���� ������ ������(byte,short,int)
				   //char (int�� ����ȯ ����)
		case 1://���ǰ��� ���ڰ��� ��ġ�ϸ� ���๮ ����
			System.out.println("1�Է�");
			break;
		case 2:
			System.out.println("2�Է�");
			break;
		case 3:
			System.out.println("3�Է�");
			break;
		default : //����if�� else���� ������ ����
			System.out.println("1,2,3�� �ƴ� ���� �Է�");
		
		}
		
		input.close();
	}
}
