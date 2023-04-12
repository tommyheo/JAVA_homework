import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		// 입력받는 점수에 따라 60점 이상이면 합격, 미만이면 불합격을 출력하는 프로그램
		
		Scanner result = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int Jumsu = result.nextInt();
		
		if(Jumsu >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

}
