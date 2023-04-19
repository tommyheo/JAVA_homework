
public class Example01 {

	public static void main(String[] args) {
		// 이차원배열
		
		int[][] student = null;
		student = new int[2][3];	//6개	//int a=0, b, c, d, e, f;
		// 가로 2 세로 3의 2차원 배열이 생성
//		student = new int[2][];
//		student[0] = new int[3];	//둘리
//		student[1] = new int[3];	//또치
		
		
//		student.length => 2
//		student[0].length => 3
//		student[1].length => 3
		
		student[0][0] = 90;	//둘리의 국어점수
		student[0][1] = 80;	//둘리의 영어점수
		student[0][2] = 70;	//둘리의 수학점수
		
		for(int j = 0; j < 2; j++) {	//행
			for(int i = 0; i < 3; i++) {	//열
				student[j][i] = 90;
			}
		}
		
		student[1][0] = 100; //또치의 국어점수
		student[1][1] = 60;	//또치의 국어점수
		student[1][2] = 70;	//또치의 수학점수
		
		
		//3*5배열 (int)만들어서 100점을 모두 할당해봅시다
		//변수선언 = 메모리할당
		//2중for문으로 100을 할당
		
		int[][] a = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = 100;
				System.out.println(a[i][j]);
			}
		}
		
	}

}
