public class Jungjun {
public static void main(String[] args) {
	int sum = 0;
	 for(int i=50;i>30;i--) {
		 System.out.println("i :" + i);
		 if(i%10==0) {
		     sum += i*5; 
		     System.out.println("sum10 :" + sum);
		 }
		 else if(i%4==0) {
			 sum += i%3;
			 System.out.println("sum4 :" + sum);
		 }
		 else if(i%3==0) {
			 sum /= i;// "/"몫만 나옴
			 System.out.println("sum3 :" + sum);//콘솔로 어떤값이 나오는지 찍어본다(디버깅)
		     break;
		 }    
		 else 
			 continue;
		 
	 }
	
	System.out.println("sum : " + sum);	
		
		
  }
}
