
public class Example03 {

	public static void main(String[] args) {
		int i = 1;	//while조건의 초기값
		int mul = 1;
		
		while(i<=10) {
			
			if(i%2==1) {		//홀수일 때
				mul *= i;
			} else if(i%2==0){	//짝수일 때
				mul *= (-i);
			}
			
			i++;
		}
		System.out.print(mul);

	}

}
