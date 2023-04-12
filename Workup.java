
public class Workup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 0;
		char d;		// int타입인 데이터를 char로 강제형변환을 시켜서 넣으려면 char인 새로운 변수를 선언하고 그 안에 데이터를 넣어서 출력하면 된다.

		a = 73;
		b = 79;
		c = 84;

		//char z = 'a';
		d = (char)a; 
		 //의미 없다
		Object obj = (char)a;
		System.out.println(obj.getClass());
		
		
		System.out.println((int)d);
		System.out.print((char)d);
		System.out.print((char)b);
		System.out.print((char)c);
		
		c = (byte)(a + b);	//byte + byte => int + int => int
		//캐스팅하여 type을 byte로 바꿔줌
		
		System.out.println(c);

	}
}
