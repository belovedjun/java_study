
public class Car {

	static String company = "현대";
	static String color = "노랑";
	
	public static void main(String[] args) {
		System.out.println("String" + company);
		System.out.println("String" + color);
		
		Car 제네시스 = new Car();
		System.out.println("색깔 :" + 제네시스.color);
		제네시스.color = "초록";
		System.out.println("색깔 :" + 제네시스.color);
		Car 소나타 = new Car();
		소나타.color = "보라색";
		
		Car 볼보 = new Car();
		
		System.out.println("제네시스 :");
		
	}
}
