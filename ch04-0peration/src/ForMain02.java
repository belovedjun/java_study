public class ForMain02 {
	public static void main(String[] args) {
		     //초기식;조건식; 증감식(증가,감소 연산자) 증가의 폭을 넓히기 위해서 상황에 따라서 대입연산자 사용가능
		for(int i=5;i>=1;i--) {
			System.out.print(i + "\t");
		}
		System.out.println("\n-------------");
		
		for(int i=0;i<=10;i+=2) {
			System.out.print(i + "\t");			
		}
		System.out.println("\n-------------");
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {//짝수(대입연산자,증가연산자(조건추가)
				System.out.print(i + "\t"); //단일 if문
			}
		}
	}

}
