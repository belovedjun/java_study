public class ArrayMain10 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * 1)10,20,30,40,50�� �ʱⰪ���� ���� 1���� �迭��
		 *  test �̸����� ����,����,�ʱ�ȣ �Ͻÿ�
		 *  2)�ݺ����� �̿��ؼ� test �迭�� ��Ҹ� ����Ͻÿ�.
		 *  3)Ȯ�� for���� �̿��ؼ� ����Ͻÿ�.
		 *  4)�ε���3�� �����͸� 100���� �����Ͻÿ�.
		 *  5)������ ����� ���� 200���� �����Ͻÿ�.
		 *  6)�ݺ����� �̿��Ͽ� ������� ���� 0���� �ʱ�ȭ�Ͻÿ�
		 *  7)Ȧ�� �ε����� 10, ¦�� �ε����� 20�� ����
		 *  8)��� ����� ���հ� ���(������ ����� ���� ����)���ϰ�
		 *  ����Ͻÿ�.(sum(����),avg(���)) int
		 */
		//1)
		//�迭�� ����,����(����� �迭 ����),�ʱ�ȭ
		//int[] test = new int {10,20,30,40,50};
		//�迭�� ����,����(�Ͻ��� �迭 ����),�ʱ�ȭ
		int[] test = {10,20,30,40,50};
		
		//2
		for(int i=0;i<test.length;i++) {
		System.out.println("test["+i+"] : " + test[i]);
	}
		System.out.println("------------------");
		//3
		for(int num : test) {
			System.out.println(num);
		}
	    System.out.println("------------------");
		//4)
		test[3] = 100;
	    //5)
		test[test.length-1] = 200;
		
		for(int num : test) {
			System.out.println(num);
		}
			
		System.out.println("------------------");
		//6
		for(int i=0;i<test.length;i++) {
			test[i] = 0;
			//�迭�� ��� ���
			System.out.println(test[i]);
		}
		System.out.println("------------------");
		//7)
		for(int i=0;i<test.length;i++) {
			if(i%2==1) {//Ȧ��
				test[i] = 10;
			}else {//¦��
				test[i] = 20;
			}
			//���
			System.out.println(test[i]);
		}
		System.out.println("------------------");
		//8
		int sum = 0;
		int avg = 0;
		for(int i=0;i<test.length;i++) {
			//�������ϱ�
			sum += test[i];
		}
	    //��ձ��ϱ�
		avg = sum / test.length;
		//���հ� ��� ���
		System.out.printf("���� = %d%n",sum);
		System.out.printf("��� = %d",avg);
		
				
	}

}
