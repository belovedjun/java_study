public class ArrayMain13 {
	public static void main(String[] args) {
		//2차원 배열 선언, 생성, 초기화
		//2행4열의 2차원 배열
		int[][] array = {
				{10,20,30,40},//1행 0번행의 데이터   //행열의 개념을 가짐
				{50,60,70,80}//2행  1번행의 데이터
		};
		//반복문을 이용해서 배열의 요소 출력(2차원 배열은 index 2개이기 때문에 2중for문 사용)
		for(int i=0;i<array.length;i++) {//i:행번호
			for(int j=0;j<array[i].length;j++) {//j:열번호
				System.out.println(array[i][j]);
			}
		}
	}
}
//1차원 배열은 중요!, 2차원 배열은 만드는 방법,생성하는방법,호출하는 방법만 알고있기