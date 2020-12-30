public class BreakMain03 {
	public static void main(String[] args) {
		//break label문 : break를 이용해서 빠져나가길 원하는
		//반복문에 식별자를 명시하고 break가 호출될 때
		//break 다음에 label문을 명시해서 사용함
		exit_for: //break label 설정
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				
				if(j==3) break exit_for;
				
				System.out.println("i값 : " + i + ", j값 : " + j);
			}
		}//다중 반복문일때 break가 포함되어져있는 반복문만 빠져나갈것 것인지 
		 //다 빠져나갈것인지 생각
	}
}