
public class Example02 {

	public static void main(String[] args) {
		
		sum(10, 20);	//9.0
		
		minus(10, 1);	//30.0
		
		minus(20, 10);	//10.0
		
		
		multi(200, 20);	//4000.0
		
		divide(3.14f, 10);	//0.314

		
	}	//main
	
//	특정함수에서 다른 함수를 부를 수 있다
//	자기자신도 자기 자신안에서 쓸 수도 있다(재귀 메소드)
	
	
//	함수 sum
	static int sum(int a, int b) {		//함수정의
		int c = 0;
		c = a + b;
		iotPrint(c);	
		return c;
	}
	
//	함수 minus
	static int minus(int a, int b) {	//함수정의
		int c;
		c = a - b;
		iotPrint(c);	
		return c;
	}
	
//	함수 multi
	static int multi(int a, int b) {	//함수정의
		int c;
		c = a * b;
		iotPrint(c);	
		return c;
	}
	
//	함수 divide
	
	static float divide(float a, int b) {	//함수정의
		float c;
		c = a / b;
		iotPrint(c);	
		return c;
	}
	
//	함수 iotPrint
//	Object = 가장 큰 데이터타입(모든 데이터 타입을 받을 수 있다)
//	여러 타입의 데이터들이 있을 때 사용
	static void iotPrint(Object c) {
		System.out.println(c);
		System.out.println();
		System.out.println();
	}
	
	
	
}	//class
