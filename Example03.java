
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 0;
		
		j = i ++;
		System.out.println("j = " + j);		//출력 후 증가		//5 출력 후 증가
		
		j = ++ i;
		System.out.println("j = " + j);		//증가 후 출력		//증가 후 출력 7	//6이라는 데이터 가지고 있음
		
		j = i --;
		System.out.println("j = " + j);		//출력 후 증감		//7 출력 후 증감	//6이라는 데이터 가지고 있음
		
		j = -- i;
		System.out.println("j = " + j);		//증감 후 출력		//증감 후 출력 5
		
		
		System.out.println("현재 i = " + i);
		System.out.println("i ++ : " + i ++);
		System.out.println("++ i : " + (++ i));
		System.out.println("i -- : " + i --);
		System.out.println("-- i : " + (-- i));
	}

}
