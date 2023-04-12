
public class Example02 {

	public static void main(String[] args) {
		
		/* 1-2+3-4+5-6+7...+99-100을 구하시오 */
		int j = 1; 
		int sum = 0;
		
		while (j <= 100) {
			if(j%2 == 0) {
				sum += -j;
			} else if(j%2 == 1) {
				sum += j;
			}
			j++;
		}

		System.out.print(sum);
	}

}
