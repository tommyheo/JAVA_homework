
public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] ch = new char[3];		//index의 개수가 3개인 char타입의 변수 ch 생성
		
		ch[0] = 'A';	//배열 ch의 첫번쨰 index에는 a
		ch[1] = 'B';	//배열 ch의 두번쨰 index에는 b
		ch[2] = 'C';	//배열 ch의 세번쨰 index에는 c
		
		char data = 'A';	//증가식을 쓰기 위한 초기값 A
		
		for(int i = 0; i < ch.length; i++) {	//index의 값을 한번에 출력하는 명령
			System.out.println("배열 ch[" + i + "]의 index 데이터 값은 " + data);
			data ++;
		}
	}

}
