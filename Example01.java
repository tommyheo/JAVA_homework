
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * # 자동형변환 
		 * 프로그램에서 타입이 다른 피연산자들을 연산 할 때 하나의 타입으로 통일한 뒤 계산.
		 * 데이터를 표현할 수 있는 작은 타입에서 큰타입으로 변환됨
		 * 
		 * # 강제 형변환
		 * 큰 타입에서 작은 타입으로 변환할 때
		 * 대입 받는 변수의 형에 맞춰 캐스팅
		 * 캐스팅 연산자()사용, 데이터 손실 발생할 수 있음
		 * 
		 * # 연산자
		 * 어떠한 기능을 수행하는 기호(+, -,* 등)
		 * 
		 * # 피연산자
		 * 연산자의 작업 대상(변수, 상수, 리터럴, 수식)
		 * 
		 * # 단항 - 산술 - 비교 - 논리 -삼항 - 대입(우선순위 높은 순)(산비논대으로 많이 외움)
		 * 
		 * 
		 * */
		
		int a = 20, b = 10, c = 0;
		
		c = a + b;
		System.out.println(c);
		c = a - b;
		System.out.println(c);
		c = a * b;
		System.out.println(c);
		c = a / b;
		System.out.println(c);
		c = a % b;
		System.out.println(c);
		c = 12 % 5;
		System.out.println(c);
	}

}
