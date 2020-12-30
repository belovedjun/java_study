public class OperatorMain02 {
	public static void main(String[] args) {
		System.out.println("===증감연산자===");
		
		int i = 5;
		//변수 위치에 따라서 값이 달라짐
		//++가 변수 뒤에 붙을시에 먼제 데이터를 출력하고 나중에
		//메모리공간에서 증가시키시 때문에 한번더 출력해줘야함.
		System.out.println(i++);//5
		System.out.println(i);
		
		System.out.println("-----------");
		
		int j = 10;
		
		System.out.println(j--);//10
		System.out.println(j);
		
	}
}
