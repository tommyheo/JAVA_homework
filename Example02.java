
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 삼항연산자 - ? :
		 * 조건식의 연산결과가
		 * true이면 '식1'의 결과를 반환하고
		 * false이면 '식2'의 결과를 반환한다.
		 * 
		 *  (조건식)?식1:식2
		 */
		
		boolean power = false;	// power의 초기값
		char answer = (power == true) ? 'y' : 'n';
		System.out.println(answer);
		
		int x = 5;	
		String answer2 = (x % 2 == 0) ? "짝수"  : "홀수";		// String 참조형 변수
		System.out.println(answer2);
		
		
		int y = -10;
		int absY = y >= 0 ? y : -y;
		System.out.println(absY);	// 10 -> 절대값을 구하는 핵심 알고리즘
		
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');  // 90이상이면 A 80이상 90미만이면 B 그이외에는 C
		System.out.println(grade);	
		
		int score2 = 99;
		String result = (score2 >= 90) ? "out" : (score2 >= 80 ? "in" : "out");
		String result2 = (score2 >= 80 && score2 <= 90) ? "in" : "out";
		System.out.println(result);
		System.out.println(result2);
		
	}

}
