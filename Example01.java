
public class Example01 {

	public static void main(String[] args) {
		
		/*
		 *	# 반복문
		 *		반복문은 동일한 문장을 여러 번 반복하는 제어문 
		 */
		
		// 1 ~ 15까지 출력
		
		for (int a = 1; a <= 15; a++) {
			System.out.println(a);	// 1 ~ 15까지 출력~!
		}
		
		// 고길동 20번 출력
		
		String name = "고길동";
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(i + "번쨰 : " + name);		//1 ~ 20번째 : 고길동
		}
		
		// 0 ~ 119까지 출력
		
		for(int j = 0; j < 120; j++) {
			System.out.println(j);
		}
		
		// 숫자 고희동 숫자+3 출력
		
		for(int k = 0; k < 120; k++) {
			System.out.println(k + " 고희동 " + (k+3));
		}
		
		// "예" 5번 출력(증감연산 사용)
		
		for(int l = 5; l > 0; l--) {
			System.out.println("예");
		}
		
		
		
		
		
		
	}
}
