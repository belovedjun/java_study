public class ArrayMain13 {
	public static void main(String[] args) {
		//2���� �迭 ����, ����, �ʱ�ȭ
		//2��4���� 2���� �迭
		int[][] array = {
				{10,20,30,40},//1�� 0������ ������   //�࿭�� ������ ����
				{50,60,70,80}//2��  1������ ������
		};
		//�ݺ����� �̿��ؼ� �迭�� ��� ���(2���� �迭�� index 2���̱� ������ 2��for�� ���)
		for(int i=0;i<array.length;i++) {//i:���ȣ
			for(int j=0;j<array[i].length;j++) {//j:����ȣ
				System.out.println(array[i][j]);
			}
		}
	}
}
//1���� �迭�� �߿�!, 2���� �迭�� ����� ���,�����ϴ¹��,ȣ���ϴ� ����� �˰��ֱ�