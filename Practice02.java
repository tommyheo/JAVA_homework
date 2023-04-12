
public class Practice02 {

	public static void main(String[] args) {
		
		int a = 0;
		for(int i = 1; i <= 100; i++) {		// 1~100까지 숫자
			if(i % 2 == 1) {	//그 중에서 홀수를
				a += i;		// 더 해달라는 명령
			}
		}
		System.out.println("1~100까지의 홀수의 합은 = " + a);
		
		for(int j = 1; j <= 100; j++) {
			if(j % 2 == 1) {
				System.out.print(j + "\t");	
			}
			if(j % 10 == 0) {
				System.out.println();		//for문 범위에서 10을 나누었을 때 나머지가 0이면 줄 바꿈을 해달라는 명령
			}
		}
		
		System.out.println();
		System.out.println();
		
		/* 이중for문 사용하여 만든 소스 */
		
		String number = "";
		
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j % 2 == 1) {
					number = String.valueOf(i);		//int 타입을 string 타입으로 강제 변경
					System.out.print(number + j + "\t");
				}
			}
			System.out.println();
		}
	}

}
