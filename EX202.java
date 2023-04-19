import java.util.Stack;

public class EX202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] score= new int[5]; 	//배열 선언 전역 배열? 선언.과 동시에 메모리 할당을 해준것임!메모리할당 중요 그릇 크기가 얼마나 되는지.[5]크기로
		for (int i=0; i<5; i++)		//for문을 이용하여 배열에 값 할당
		{
			score[i]= 10*i;	// score 배열의 값을 전역변수로 할당해주었기에 for문 밖의 아래에 출력물 2개가 나올 수 있음
			System.out.println(score[i]); 	
		}
						
		
		System.out.println("스코어 배열의 1번 방은"+score[1]);
		System.out.println("스코어 배열의 1번 방은"+score[2]);
	
		// 1. (전역) 배열선언과 메모리 할당 . 배열의 크기를 설정
		// 2. for문을 이용해서 배열의 값을 할당(전역으로서,)  
		// 3. 출력할때, 배열명[i]해서 직접적으로, 배열의 몇 번 인덱스의 값을 불러와줘야한다.
		
		
		String[] arrString =null; //변수선언 초기값과 함께
		arrString = new String[3]; // 배열 데이터 타입과 메모리할당
		arrString[0] = "iot";
				arrString[1] = "북부";
				arrString[2] = "교육원";
				
				
	
		
		
		
		
	}

}
