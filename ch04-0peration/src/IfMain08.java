public class IfMain08 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� 2���� �Է��ϰ� ������(+,-,*,/,%)�� �Է��ؼ� 
		 * ������� ���ϰ� ������� ����Ͻÿ�.
		 * 
		 * [��¿���]
		 * ù��° ��:10
		 * ������:-
		 * �ι�° ��:5
		 * 10 - 5 = 5
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int first = 0, second = 0, result =0;
		String operator;
		
		System.out.print("ù��° ��:");
		first = input.nextInt();
		
		System.out.print("������:");
		operator = input.next();
		
		System.out.print("�ι�° ��:");
		second = input.nextInt();
		
		
		if(operator.equals("+")) {
			result = first + second;
		}else if(operator.equals("-")) {
			result = first - second;
		}else if(operator.equals("*")) {
			result = first * second;
		}else if(operator.equals("/")) {
			if(second!=0 ) {
				result = first / second;
			}else {
				System.out.println("0���� ������ �����ϴ�.");
				//���α׷� ����
				System.exit(0);
			}
		}else if(operator.equals("%")) {
			if(second!=0) {
				result = first % second;
			}else {
				System.out.println("0���� ������ �����ϴ�.");
				//���α׷�����
				System.exit(0);
			}
		}else {
			System.out.println("�߸��� ������ �Է�");
			//���α׷� ����
			System.exit(0);
		}
		
		System.out.printf(
				"%d %s %d = %d", first,operator,second,result);
		
		input.close();
		//operator == "+" x
		//operator.equals("+") O
		//operator�� ����� ���ڿ��� "+"������ true
		//                          �ٸ��� false
		//if(operator.equals("+")){
		//����
	    //}
		
	}

}
