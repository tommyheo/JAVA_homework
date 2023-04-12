import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		
		System.out.println("직사각형의 부피는 구하시오");
		
		Scanner a = new Scanner(System.in);
		System.out.println("가로는?");
		int Travers = a.nextInt();

		Scanner b = new Scanner(System.in);
		System.out.println("세로는?");
		int Length = b.nextInt();
		
		Scanner c = new Scanner(System.in);
		System.out.println("높이는?");
		int Height = c.nextInt();
		
		int result = Travers * Length * Height;
		
		System.out.println("직사각 기둥의 부피는 " + result + "입니다.");
	}

}
