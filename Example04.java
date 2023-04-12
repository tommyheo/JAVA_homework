
public class Example04 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			if(sum>100) {
				System.out.println("최소 정수값 : " + i + ", 합 : " + sum);
			}
			i++;
		}
		System.out.println(sum);

	}

}
