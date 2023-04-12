
public class Practice02 {

	public static void main(String[] args) {
		
		/*
		 *	'나잘난'은 아래와 같이 성적을 받았다. 나잘난의 성적의 총합계와 평균을 구해서 출력하는 프로그램을 작성하시오.
		 *	- 파이썬 60점, 자바 70점, 안드로이드 80점, C언어 50점, c++ 30점 
		 */
		
		int Python = 60;
		int Java = 70;
		int Andriod = 80;
		int C = 50;
		int Cplus = 30;
		
		int sum = Python + Java + Andriod + C + Cplus;
		float avg = (Python + Java + Andriod + C + Cplus) / 5;
		
		System.out.println("나잘난의 총합은 " + sum + "이고 평균은 " + avg + "입니다");

	}

}
