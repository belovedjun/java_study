public class Score {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int ����, ����, ����, ����;
		char ���� ;
		float ���;
		
		//������ 0~100 �� �Է� ����
		do {
			System.out.print("����>");
			���� = input.nextInt();
		}while(���� < 0 || ���� > 100);
		
		do {
			System.out.print("����>");
			���� = input.nextInt();
		}while(���� < 0 || ���� > 100);
				
		do {
			System.out.print("����>");
			���� = input.nextInt();
		}while(���� < 0 || ���� > 100);
		
		���� = ���� + ���� + ����;
		��� = ���� / 3.0f;
		
		switch((int)(���/10)) {
		case 10:
		case 9: ���� = 'A'; break;
		case 8: ���� = 'B'; break;
		case 7: ���� = 'C'; break;
		case 6: ���� = 'D'; break;
		}
		
		input.close();
	}

}