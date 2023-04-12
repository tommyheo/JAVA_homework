import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
		System.out.println("주민번호를 입력하세요.ex) 012345-7890123");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// 사용자에게 String의 값을 입력받는 함수 nextLine()을 호출해 String의 값을 얻는다.
		
		char gender = str.charAt(7);
		char city = str.charAt(7);
		String temp  = str.substring(8,10);
		System.out.println(temp);
		int sido = Integer.parseInt(temp);	//문자열 "89"가 숫자89로 데이터 타입 변환
		// 받은 값중 7번째 index의 char값 하나만 추출해서 char타입의 변수에 담아준다
		
		/* System.out.println(gender); */	
		
		/*
		 *	변수 gender의 값이 '2' 또는 '4'라면 "여자", '1' 또는 '3'이라면 "남자"를 출력하도록 하자 
		 */
		
	
		
		if (gender == '1' || gender == '3') {
			System.out.println("남자");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자");
		} else {
			System.out.println("주민번호를 올바르지 않습니다.");
		}
		
		if(sido >= 0 && sido <= 8) {
			System.out.println("출생지역은 서울입니다.");
		} else if (sido > 8 && sido <= 12) {
			System.out.println("출생지역은 부산입니다.");
		} else if (sido > 12 && sido <= 15) {
			System.out.println("출생지역은 인천입니다.");
		} else if (sido > 15 && sido <= 25) {
			System.out.println("출생지역은 경기도입니다.");
		} else if (sido > 25 && sido <= 34) {
			System.out.println("출생지역은 강원도입니다.");
		} else if (sido > 34 && sido <= 39) {
			System.out.println("출생지역은 충북입니다.");
		} else if (sido == 40) {
			System.out.println("출생지역은 대전입니다.");
		} else if (sido > 40 && sido <= 47) {
			System.out.println("출생지역은 충남입니다.");
		} else if (sido > 47 && sido <= 55) {
			System.out.println("출생지역은 전북입니다.");
		} else if (sido > 55 && sido <= 64) {
			System.out.println("출생지역은 전남입니다.");
		} else if (sido > 64 && sido <= 66) {
			System.out.println("출생지역은 광주입니다.");
		} else if (sido > 66 && sido <= 69) {
			System.out.println("출생지역은 대구입니다.");
		} else if (sido > 69 && sido <= 80) {
			System.out.println("출생지역은 경북입니다.");
		} else if (sido > 81 && sido <= 84 || sido > 85 && sido <= 99) {
			System.out.println("출생지역은 경남입니다.");
		} else if (sido == 85) {
			System.out.println("출생지역은 울산입니다.");
		}
		
		
		
		
		
	}

}
