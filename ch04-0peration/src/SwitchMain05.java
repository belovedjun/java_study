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
		int first = 0, second = 0, result =0;
		String operator;
		
		System.out.print("ù��° ��:");
		first = input.nextInt();
		
		System.out.print("�ι�° ��:");
		operator = input.next();
		
		System.out.print("����° ��:");
		second = input.nextInt();
		
		switch(operator) {
		case "+":
		 result = first + second;
		  break;
		case "-":
		 result = first - second;
		  break;
		case "*":
		 result = first * second;
		  break;
		case "/":
		  result = first / second;
		  if(second!=0) {
				result = first / second;
			}else {
				System.out.println("0���� ������ �����ϴ�.");
				System.exit(0);
			}
		break;
		case "%":
		 result = first % second;
		 if(second!=0) {
				result = first / second;
			}else {
				System.out.println("0���� ������ �����ϴ�.");
				System.exit(0);
			}
		 break; 
		default:
		 System.out.println("�߸��� ������ �Է�");
		 System.exit(0);
		}
		
		System.out.printf(
				"%d %s %d = %d", first,operator,second,result);
		
		input.close();
	}

}
