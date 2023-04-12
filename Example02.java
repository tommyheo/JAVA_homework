import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		/*
		 *	조건문 : if
		 *	조건이 만족되면 수행
		 *
		 * 	조건문 : if - else
		 * 	조건이 만족하면 if 실행문 실행 
		 * 	만족하지 않으면 else 실행문 실행
		 * 
		 * 	조건문 : if - else if -else
		 * 	조건2 만족하면 조건2의 실행문 실행
		 * 	만족하지 않으면 else의 실행문 실행
		 * 
		 */
		
		// if-else if-else 예제
		
		int a = 89;
		
		if ( a > 60 ) {
			System.out.println( "합격" );
		} else if ( a >= 50 ) {		// a >= 50 && a < 60를 의미
			System.out.println( "예비" );
		} else {	// 0 ~ 50
			System.out.println( "불합격" );
		}
		
		
		/*
		 *	# 유저에게 값을 받아오는 함수
		 *	Scanner sc = new Scanner(System.in);	// Scanner타입(참조타입)의 데이터인 sc		//
		 *	sc.nextInt();	// int의 값으로 인지하고 가져오는 것 
		 */
		
		
		
		Scanner sc = new Scanner(System.in);	//사용시 import java.util.Scanner를 써야 적용이 된다
		System.out.println("점수를 입력하세요");
		int jumsu = sc.nextInt();	//sc.next(); //sc.nextLine() //sc.nextFloat()
		// 입력값을 int형 데이터로 가져와달라는 명령
		
		
		
		if(jumsu >= 90) {
			System.out.println("A");
		} else if (jumsu >= 80) {
			System.out.println("B");
		} else if (jumsu >= 70) {
			System.out.println("C");
		} else if (jumsu >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	
		sc.close();
		
		if(jumsu >= 90) {
			System.out.println("A");
		} else if (jumsu >= 80) {
			System.out.println("B");
		} else if (jumsu >= 70) {
			System.out.println("C");
		} else if (jumsu >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}	
}
