public class IfMain02 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("������ ������ �ϳ� �Է�:");
		int a = input.nextInt();
		
		if(a%2==1) {//Ȧ�� (��)��true�̸� ����
			System.out.println("Ȧ���Դϴ�.");	
		}else {//¦�� false�϶� ����
		    System.out.println("¦���Դϴ�");
		}
		input.close();
	}

}
