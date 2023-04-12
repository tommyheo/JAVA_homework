import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		
		//절대값 출력 프로그래밍
		
		Scanner a = new Scanner(System.in);
		System.out.println("정수 값을 입력하시오");
		
		int Number = a.nextInt();
		
		if(Number < 0) {
			System.out.println("절대값은 "+ (-Number) +  "입니다.");
		} else {
			System.out.println("절대값은 "+ Number +  "입니다.");
		}
	}

}
