public class CastMain03 {
	public static void main(String[] args) {
		int a = 2;
		char b = 'A'; //�ƽ�Ű�ڵ� 65 ��ǻ�ʹ� ���ڷ� �ν�
		              //char->int �ڵ��� ����ȯ
		int result =  a + b;//b -> 65
		System.out.println("result = " + result);
								//int->char ������(����) ����ȯ
		System.out.println("result = " + (char)result);
		//�ƽ�Ű �ڵ�� �ν�
	}
}