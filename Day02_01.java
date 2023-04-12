
public class Day02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java 관련된 모든 단어의 첫 자는 무조건 대문자로 쓰기!
		
		System.out.println("Hellow world");
		// 모든 프로그램은 main으로 시작!
		
		/* 변수선언
		 * 변수 - 데이터를 담는 공간
		 * 변수선언 - 데이터를 저장할 공간을 할당하고 이름을 붙이는 동작
		 * 
		 *  int(데이터타입) a(변수명);
		 *  데이터타입마다 할당되는 메모리의 크기가 다름 
		 *  int : 정수타입(4byte)
		 *  float, double : 실수타입(4byte, 8byte)
		 *  double이 실수의 기본형
		 *  
		 *  boolean b;(1byte)
		 *  
		 *  
		 *  Java는 ; 안붙이면 에러남
		 *  무조건 문장 종료시 ; 붙여줘야함
		 *  */
		
		
		// 정수 10을 담은 변수 number을 선언하고 값을 할당햅보세요
		// 그 뒤에 number값을 출력해보세요.
		// 1. 변수선언
		// 2. 변수에 값 할당
		// 3. 변수 값 출력
		
		int number;
		number = 10;
		System.out.println(number);
		
		// boolean 데이터 타입 변수. false 값을 할당해보자.
		// 1. 변수선언
		// 2. 변수에 값 할당
		// 3. 변수 값 출력
		
		boolean number2;
		number2 = false;
		System.out.println(number2);
		
		float number3;
		number3 = 3.14f;
		// 실수의 default값이 double이기 때문에 float를 쓸 땐 데이터값 뒤에 "f"를 붙여줘야 함.
		System.out.println(number3);
		
		
		int temp = 0x1F;
		System.out.printf("%x, %d, %o", temp, temp, temp);		//16진수, 10진수, 8진수		//1f, 31, 37
		
		
		
	}

	
}
