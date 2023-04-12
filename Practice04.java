import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("자연수를 입력하세요.");
		int Number = a.nextInt();
		
		if(Number % 2 ==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}

}
