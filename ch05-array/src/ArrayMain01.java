public class ArrayMain01 {
	public static void main(String[] args) {
		char[] ch;//�迭 ����(�迭����x)�����غ�. �ּҸ� ��������ؼ�~
		ch = new char[4];//�迭 ����
		
		//�迭 �ʱ�ȭ (�������� ������ 0->'j'...)
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//�迭�� ����� ������(���)�� ���
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		//�ݺ����� �̿��ؼ� �迭�� ���(����� ������) ���(�ڵ������Ҽ�����)
					//�迭�� ����(���� ����)
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch["+i+"] : " + ch[i]);
			                    //ch[0] :��������   �迭�� �� ����ȣ��
		}   //���������� ���� , i<4 0����~3����
		
		System.out.println("---------------");
		
		//�迭�� ����, ����
		int it[] = new int[6];
		//[]�տ� �־ �νĵ�.
		
	   for(int i=0;i<it.length;i++) {
		   System.out.println(it[1]);//�迭������ �ϸ� �����͸� �������� ���µ� ��������
		                             //�ڷ���(����)�� �⺻������ �ʱ�ȭ��. 
	   }
	   
	   System.out.println("-------------------");
	   
	   //1.�迭�� ����, ����(����� �迭 ����), �ʱ�ȭ 
	   char[] ch2 = new char[] {'J','a','v','a'};//���� ���� ����ϸ� ����, ���ϴ°��� ���.
	   
	   for(int i=0;i<ch2.length;i++) {
		   System.out.println(ch2[i]);
	   }
	   
	   //2.�迭�� ����, ����(�Ͻ��� �迭 ����), �ʱ�ȭ
	   char[] ch3 = {'��','��'}; //new char ���� ����
	}

}
