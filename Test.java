
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a = true;
		byte b = 10;
		short c = 20;
		int d = 30;
		long e = 40L;
		float f = 12.5f;
		//f가 붙어야 float 데이터가 유지됨
		double g = 34.56;
		char h = 'k';
		String i = new String("hello java");
		
		// *** char는 데이터를 ''으로 감싸줘야하고 String은 ""으로 감싸줘야한다
		
		System.out.println("boolean : " + a);	//true	//2byte
		System.out.println("byte : " + b);	//byte : 10	//1byte
		System.out.println("short : " + c);	//short : 20	//2byte
		System.out.println("int : " + d);	//int : 30	//4byte
		System.out.println("long : " + e);	//long : 40	//8byte
		System.out.println("float : " + f);	//float: 12.5	//4byte
		System.out.println("double : " + g);	//double : 34.56	//8byte
		System.out.println("char : " + h);	//char : k	//2byte
		System.out.println("String : " + i);	//String : hello java	//참조형 타입
		
		
		
	}

}
