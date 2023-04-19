import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 사용자에게 5개의 숫자를 입력 받아 배열에 담아서 출력하시오. */
		
		int[] arr = new int[5];		//index를 5개 담을 수 있는 배열 arr를 만들어달라는 명령
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {	//배열 arr의 index에 입력값을 push해주는 명령
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			arr[i] = sc.nextInt();	//사용자 입력값을 arr[i]에 넣어달라는 명령
		}
		
		System.out.println("배열 arr의 참조값 = " + arr);
		
		
		for(int j = 0; j < arr.length; j++) {		//배열 arr의 index값을 출력하는 명령
			System.out.println("arr[" + j + "]의 index값은 " + arr[j]);		
		}
		
		/*
		 * 배열출력을 자바스크립트처럼 하게 되면 참조값(데이터 타입이 참조형인 주소)이 출력이 되므로 배열의 index를 출력하고 싶을 땐 각 index를 print를 하여 봐야한다
		 */
		
		
		
	
	}

}
