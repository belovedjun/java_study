public class OperatorMain05 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * 
		 * 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������
		 * ������ �� �� �л��� �� ���� ���� �� �ְ�,
		 * ���������� �� ���� �������� ���Ͻÿ�,
		 * 
		 * [��¿���]
		 * �л� �� ���� ������ ���� �� : **
		 * ���� ���� �� : **
		 */
		
		int pencils = 534;
		int students = 30;
		
		//�л� �� ���� ������ ���� ��
		int quantity = pencils / students;
		int avg = 534 / 30;
		
		System.out.printf(
				"�л� �Ѹ��� ������ ���� �� : %d%n", quantity);
		
		//���� ���� ��
		int rest = pencils % students;
		System.out.println("���� ���� �� : " + rest);
	}
}
