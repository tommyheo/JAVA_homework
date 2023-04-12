import java.util.Scanner;

public class Pracitce03 {

	public static void main(String[] args) {
		System.out.println("출력할 구구단을 입력하세요 ex)3");	
		Scanner a = new Scanner(System.in);		// 사용자 입력
		int dan = a.nextInt();	// 사용자 입력값을 int 타입으로 받아서 변수에 담아주는 명령
		
		
		for(int i = 1; i < 10; i++) {
			int result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
		
	}

}
