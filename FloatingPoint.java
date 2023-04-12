
public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float y = 3.14f;
		
		System.out.println("y = " + y);	// y = 3.14
		//printf()	//형식화된 형식
		
		System.out.printf("floatimg-point: %.8f\n", y);	//3.14000010
		// 실수형, 소숫점 8자리까지		//소숫점 9째 자리에서 반올림
		
		System.out.printf("floating-point: %020.8f\n", y);	//00000000003.14000010
		// 총 20자리, 소수점 아래 8자리 포함	//나머지는 0으로 채워줌
		
		System.out.printf("floating-point: %20.8f\n", y);	//          3.14000010
		// 총 20자리, 소수점 아래 8자리 포함
		
		System.out.printf("floating-point: %.8g\n", y);	//3.1400001
		
		System.out.printf("floating-point: %.8e\n", y);	//3.14000010e+00
		//지수표현으로
	}

}
