public class ArrayMain12 {
	public static void main(String[] args) {
		//2���� �迭
		int test[][]; //2���� �迭 ����
		test = new int[2][3]; //2�� 3��
		
		//2���� �迭 �ʱ�ȭ   //1������ ���̰� 2���� ������ ����.
		//���ȣ ����ȣ
		test[0][0] = 100;
 		test[0][1] = 200;      //ö�� �ϳ��� ���� �ѻ���� ���� ����
 		test[0][2] = 300;
 		
 		test[1][0] = 400;
 		test[1][1] = 500;      //����
 		test[1][2] = 600;
 		
 		//�迭�� ��Ҹ� ���
 		System.out.println(test[0][0]);
 		System.out.println(test[0][1]);
 		System.out.println(test[0][2]);
 		
 		System.out.println(test[1][0]);
 		System.out.println(test[1][1]);
 		System.out.println(test[1][2]);
 		
 		System.out.println("------------------");
 		//��ü�� ����ϱ� ������ 2���� �迭�� ������� ����.(�������Է�,ȣ�� ��� ��︸!)
 		//�ڹٰ������ 1���� �迭�� ���־� (2���� ����, 3���� ���� �Ⱦ�)
 		//�ݺ����� �̿��ؼ� �迭�� ��Ҹ� ���
 		for(int i=0;i<test.length;i++) {//i : ���ȣ 0~1   ����for��
 			for(int j=0;j<test[i].length;j++) {//j : ����ȣ 0~2
 				System.out.println(
 						"test["+i+"]["+j+"]:" + test[i][j]);
 				
 			}
 		}
 		//�迭�� �⺻�����͸� ������ �����.
 		//�迭�� ���� �� ����
 		int[][] test2 = new int[2][3];
 		
 		//�迭�� ����, ����(����� �迭 ����), �ʱ�ȭ
 		int[][] test3 = new int[][] {
 			                        {10,20,30,40},
 			                        {50,60,70,80}
 				
 			                        };
 			                        
 	    //�迭�� ����, ����(�Ͻ��� �迭 ����), �ʱ�ȭ 
 	    int[][] test4 = {
 	    		        {10,20,30},
 	    		        {40,50,60},
 	    		        {70,80,90} 
 	                    };
	}
}
