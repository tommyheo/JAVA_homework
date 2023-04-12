
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 강제 형변환(Casting)
		 * 큰 타입에서 자긍ㄴ 타입으로 변환할 때
		 * 대입 받는 변수의 형에 맞춰 캐스팅.
		 * 캐스팅 연산자()를 사용. 데이터 손실 발생 가능성
		 */
		
		
		int a = 10, b = 13;
		float c = 12.5f;
		
		/* 강제형변환
		 * float 타입의 c변수의 값을 int 타입의 a변수에 할당하므로
		 * 큰 타임ㅂ의 값을 작은 타입에 할당이 안되므로 강제로 타입을 바꾸어주어야함
		 * casting연산자 (int)c;와 같이 캐스팅 연산자()를 사용하여 바꿔주어 할당
		 * 큰 데이터타입의 값이 작은 데이터 타입의 값으로 할당되니 데이터일부가 손실이 될 수 있다
		 * 단, 큰 데이터안의 표현값이 작은 데이터의 표현값 범위에 들어가야한다
		 *  */
		
		a = (int)c;
		
		System.out.println("c = " + c);	//c = 12.5
		System.out.println("a = " + a);	//a = 12
	}

}
