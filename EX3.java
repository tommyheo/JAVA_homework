package DAY0413;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1에서 100까지 정수를 기억시키고 그 합을 구하는 프로그램
		
			int [] bag= new int[100];
			int sum=0;
			for (int i=0; i<100; i++)
			{
				bag[i]=i+1;		// 1부터 100까지 하는거니까 0번 인덱스부터 1들어가게 해줬다.
				
				sum=sum+bag[i];
				System.out.println("bag["+i+"]번째 값"+bag[i]);
				System.out.println("합->"+sum);
			}
			
			// for문의 i는 0부터 시작해야 한다. 배열은 0번 인덱스부터 시작하니까.
		
		
			int [] arrA = new int[6];	// int[] arrA = {2, 10, 8, 5, 3, 9};를 써야 더 편하다.,.
			int sum2 = 0;
			arrA[0]=2;
			arrA[1]=10;
			arrA[2]=8;
			arrA[3]=5;
			arrA[4]=3;
			arrA[5]=9;
			
			for (int j=0; j<6; j++)
			{
				sum2= sum2+arrA[j];
				System.out.println(arrA[j]);
			}
			System.out.println("합은"+sum2);
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
