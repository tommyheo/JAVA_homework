
public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		int finalSum = 0;
		
		while(i <= 100) {
			sum += i;
			System.out.println("sum의 값 : " + sum);
			finalSum += sum;
			System.out.println("finalSum의 값 : " + finalSum);
			i++;
			System.out.println("i의 값 : " + i);
		}
		System.out.println(finalSum);
	}

}
