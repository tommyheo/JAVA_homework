
public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* 제어문if */
		
		/* 예제01 */
		System.out.println("예제01");
		
		int a = 5, b = 15;
		if(a > 10) {
			System.out.println("a = " + a);
		}
		
		if(b > 10) {
			System.out.println("b = " + b);
		}
		
		
		System.out.println("---------------");
		System.out.println("예제02");
		
		/* 예제02 */
		a = 10;
		b = 20;
		boolean flag = true;
		
		if(a == 10) {
			System.out.println("a가 10이면 참");
		} 
		if(a == b) {
			System.out.println("a가 b가 같으면 참");
		}
		if(flag) {
			System.out.println("flag 값이 true이면 참");
		}
		System.out.println("이 문장은 if문과 상관없이 실행");
		
		System.out.println("---------------");
		System.out.println("예제03");
		
		/* 예제03 */
		
		a = 89;
		
		if(a >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println("---------------");
		System.out.println("예제04");
		
		a = 10;
		b = 20;
		flag = false;
		
		if(a > 10) {
			System.out.println("a는 10보다 크다");
		} else {
			System.out.println("a는 10보다 크지않다");
		}
		
		if(a == 10 && b >= 20) {
			System.out.println("조건을 만족함");
		} else {
			System.out.println("조건을 만족하지 못함");
		}
		
		if(flag) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		System.out.println("---------------");
	}

}
