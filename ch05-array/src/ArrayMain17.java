import java.util.Scanner;

public class ArrayMain17 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ������ 5�� �Է� �޾Ƽ� �迭�� �����ϰ� ������
		 * ���� �� �ִ밪�� �ּҰ��� ���ؼ� �ִ밪�� �ּҰ���
		 * ����Ͻÿ�
		 */
		Scanner input = new Scanner(System.in);
		
		
		//�迭 ���� �� ����
		int[] score = new int[5];
		
		//���� �Է�
		for(int i=1;i<score.length;i++) {
			System.out.printf("���� �Է�:");
			score[i] = input.nextInt();
		}
		
		//���� 5���Է�
		int max = score[0];//�迭�� ù��° ������ �ִ밪 �ʱ�ȭ
		int min = score[0];//�迭�� ù��° ������ �ּҰ� �ʱ�ȭ
		
		//�ִ밪 ���ϱ�
		for(int i=1;i<score.length;i++) {
			if(score[i] > max) {
				max = score[i];
		}
			//�ּҰ� ���ϱ�
			if(score[i] < max) {
				min = score[i];
		}
	}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	
		input.close();
	}
}
