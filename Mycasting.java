
public class Mycasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 12; 
		float b = 13;
		float c = 0;
		
		//자동 형변환
		//좌변은 float, 우변은 int
		//우변 계산 결과(int)가 float으로 변환되어 좌변 c에 저장
		
		c = (a+b)/2;
		System.out.println("a와 b의 평균은 " + c + " 이다.");	//a와 b의 평균은 12.0 이다.
		//나눈 값이 int이기 때문에 float형인 c에 들어갔을 때 int로 출력이 된다.
		
		//연산하려는 데이터 a,b중 하나라도 타입이 float면 계산결과가 float로 나오게 됨
		
		
		float f = 12.5f;
		//강제 형변환
		a =(int)f;
		System.out.println("a = " + a);	//a = 12
	}

}
