import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		/* 조건문 switch */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int Jumsu = sc.nextInt();
		
		
		switch (Jumsu / 10) {	// 10으로 나눠서 94의 일의 자리를 소수점으로 만들어버린다
		case 9  : case 10 : 	// value의 값이 정수이므로 십의 자리가 9일 때는 "A"를 출력해달라는 명령
			System.out.println("A");
			break;
			
		case 8 :
			System.out.println("B");
			break;
			
		case 7 : 
			System.out.println("C");
			break;
			
		default : 
			System.out.println("판단불가");
		}
		
		
		

	}

}
