
public class Example01 {

	public static void main(String[] args) {
//		# 함수(method)
//		특정 기능을 제공하기 위한 프로그램의 모듈
//		함수는 만들어져 있는 것을 사요하기도 하고 직접 만들기도 함
//		파라미터 == 매개변수
		
//		함수명(매개변수);	//함수호출
		
//		static 함수타입 함수명 (매개변수){	//함수정의
//			실행명령;
//			return;
//		}
		
//		반환하는 값이 없을 경우 함수타입은 void
		
//		함수명은 변수명 규칙과 동일
		
//		파라미터는 항상 있는 것이 아니고 필요한 경우에만 필요한 개수만큼
//		파라미터를 지정할 때는 변수 선언과 동일하게 타입과 이름을 명시
//		함수 호출 시 넣어주는 값을 저장하기 위한 변수
		
		
		
		int result = sum(100, 100, 100);	//return값을 int타입의 return변수에 담아달라는 명령
		System.out.println(result);		//return값 출력
		
		
		print2("iot");
		
		print();
		
		print3(true);
		print3(false);
		
		
		
		
	
	}	//main
	
	static void print() {	//return값이 없을 때는 static 뒤에 void를 쓴다
		System.out.println("hello");
	}
	
	static void print2(String str) {
		System.out.println(str);
	}
	
	static int sum(int kor, int eng, int math) {	//return값이 있을 때는 static 뒤에 함수 데이터 타입을 써야한다
		return kor + eng + math;		//return 키워드 이후의 코드들은 실행되지 않는다
	}

	static void print3(boolean ret) {
		if(ret == true) {
			System.out.println("hello2");
		} else {
			System.out.println("실행불가");
		}
	}
}	//class
