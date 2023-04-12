
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 5;
		System.out.println(i++);	//5
		System.out.println(j--);	//5
		System.out.println("i = " + i + ", j = " + j);	//i = 6, j = 4
		
		/* 
		 *  ++i = 먼저 증가시킨 후 출력
		 * 	i++ = 출력 후 증가
		 * 
		 * # 전위형 = 값이 참조되기 전에 증가
		 * # 후위형 = 값이 참조된 후에 증가
		 */
	}

}
