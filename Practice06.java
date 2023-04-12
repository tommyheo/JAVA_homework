import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		
		System.out.println("원기둥의 부피를 구하시오.");

		
		Scanner a = new Scanner(System.in);
		System.out.println("반지름은?");
		int Radi = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("높이는?");
		int Height = b.nextInt();
		
		double result = Math.pow(Radi, 2) * 3.14f * Height;	//Math.pow().는 double형식이기 때문에 변수의 데이터 타입을 double해줘야 함
		
		System.out.printf("부피는 %.1f입니다.", result);	//소숫점 자리 표현하려면 printf를 쓰고 %.자릿수f를 사용하여 써야한다
	}

}
