public class DowhileMain {
	public static void main(String[] args) {
		int su = 0;
		String str = "Hello world!!";
				
		while(su++ < 5) {
			System.out.println(str);
		}
		
		System.out.println("------------");
		
		int su2 = 0;
		
		do {
			System.out.println(str);
		}while(su2++ < 5); //�ݺ�����üũ�� �ѹ� �����ؾ��ϴ°�� do while
	}
}
