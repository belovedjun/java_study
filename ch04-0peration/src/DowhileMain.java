public class DowhileMain {
	public static void main(String[] args) {
		int su = 0;
		String str = "Hello world!!";
				
		while(su++ < 5) {
			System.out.println(str);
		}
		
		System.out.println("------------");
		
		int su2 = 0;
		
		do {
			System.out.println(str);
		}while(su2++ < 5); //반복조건체크전 한번 실행해야하는경우 do while
	}
}
