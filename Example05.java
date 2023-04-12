
public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <비트 전환 연산자>
		 * # 틸트(tilt)
		 *     정수를 2진수로 표현했을 때
		 *     1->0
		 *     0->1
		 *     로 변환
		 *     
		 *     정수형에만 가능
		 *     1의 보수 구할 때 사용 (2진수에서 1을 0으로 0을 1로 바꾼다고 생각하면 됨
		 *     
		 *     2의 보수 == 2진수 1의 보수에 1을 더한 값
		 *     
		 *     
		 * <이항 연산자>
		 *	이항연산자는 연산을 수행하기 전에 피연산자의 타입을 일치시킨다
		 *	1. int보다 크기가 작은 타입은 int로 변환(byte, char, short -> int)
		 *	2. 피연산자 중 표현범위가 큰 타입으로 형변환
		 *		byte + short -> int + int -> int
		 *		char + int -> int + int -> int
		 *		float + int -> float + float -> float
		 *		long + float -> float + float -> float
		 *		float + double -> double + double -> double
		 *  */
		
		byte a = 10;
		byte b = 20;
		byte c = 0;
		
		
		c = (byte)(a + b);	//byte + byte => int + int => int
		//캐스팅하여 type을 byte로 바꿔줌
		
		System.out.println(c);
		
		
		
		long l = 0;
		int i = 0, j = 0;
		i ++;
		j = (int)(i + l);
		System.out.println(j);
		
		
		
		char c1 = 'a';
		
		System.out.println(c1);	//a
		System.out.println((int)c1);	//97	//아스키 코드표의 값으로 변경
		
		char c2 = 'b';
		System.out.println(c2);	//b
		System.out.println((int)c2);	//98
		
		int c3 = 97+1;	//98
		System.out.println(c3);	//97
		System.out.println((char)c3);	//b		
		
		int c4 = 98;
		System.out.println(c4);	//98
		System.out.println((char)c4);	//b
		
		int c5 = 65;
		System.out.println((char)c5);
		
		char c6 = 'c';
		c6 ++;	//단항연산
		System.out.println(c6);	//d
		
		char c7 = 'd';
		c7 = (char)(c7 + 1);	//이항연산 char + int => int _+ int => int //c7은 char
		System.out.println(c7);
	}

}
