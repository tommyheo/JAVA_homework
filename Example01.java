
public class Example01 {

	public static void main(String[] args) {
		
		System.out.printf("10 == 10.0f \t %b\n" , 10 == 10.0f);
		System.out.printf("'0' ==0 \t %b\n", '0' == 0);
		System.out.printf("'\\0' == 0 \t %b\n", '\0' == 0);
		System.out.printf("'A' == 65 \t %b\n", 'A' == 65);
		System.out.printf("'A' > 'B' \t %b\n", 'A' > 'B');
		System.out.printf("'A' + 1 != 'B' \t %b\n", 'A' + 1 != 'B');
		
		
		System.out.println('\uAC00');	//유니코드표기법. // 역슬래쉬u + 유니코드로 표현 \
		
		
	}

}