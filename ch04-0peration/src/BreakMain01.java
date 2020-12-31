public class BreakMain01 {
	public static void main(String[] args) {
		int n = 1;
		while(n <= 10) {
			System.out.println(n);
			n++;
			if(n==8)break;//n이 8일때 while을 빠져나감 (특정조건일때 반복문을 빠져나감)
		}
	}
}
