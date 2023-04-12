
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 13;
		float c = 0;	//정수 데이터를 넣어도 12.0으로 자동형변환이 됨
		
		/*
		 * 자동형변환
		 * int 타입의 변수 a의 값(12)이 float로 자동형변환 된 뒤에
		 * c에 값을 할당.
		*/
		
		c = a;
		System.out.println("c = " + c);	//12.0
	}

}
