public class SwitchMain05 {
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
		
		/*
		 * switch(operator){
		 * case "+":
		 * 		���๮;
		 *      break;
		 *}
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int result =0; //0���� �ʱ�ȭ�� �ؾߵ�. ������ �Ҷ�
		
		System.out.print("ù��° ��:");
		int first = input.nextInt();
		System.out.print("������:");
		String operator = input.next();
		System.out.print("����° ��:");
		int second = input.nextInt();
		
		switch(operator) {
		case "+":
		 result = first + second;break;
		case "-":
		 result = first - second;break;
		case "*":
		 result = first * second;break;
		case "/":
		  if(second!=0) {
				result = first / second;break;
			}else {
				System.out.println("0���� ������ �����ϴ�."); //0���� ������ ��� �����߻�
				System.exit(0); //���α׷� ����
			}
		case "%":
		 if(second!=0) {
				result = first % second;break;
			}else {
				System.out.println("0���� ������ �����ϴ�.");
				System.exit(0); //���α׷� ����
			} 
		default:
		 System.out.println("�߸��� ������ �Է�");
		 System.exit(0); //���α׷� ����
		}
		
		System.out.printf(
				"%d %s %d = %d", first,operator,second,result);
		
		input.close();
	}

}
