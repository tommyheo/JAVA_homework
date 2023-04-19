import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열 */
		
		/* 예제01 */
		System.out.println("예제01");
		int [] a;	//배열 선언
		a = new int[10];	//배열 선언
		
		int [] score = new int[5];
		int start = 0;
		for(int i = 0; i < score.length; i++) {
			start += 10;
			System.out.println("score[" + i + "] = " + start);
		}
		
		System.out.println("---------------");
		
		/* 예제02 */
		System.out.println("예제02");
		
		byte[] arrByte = new byte[5];
		byte startByte = 0;
		for(int i = 0; i < arrByte.length; i++) {
			startByte++;
			System.out.println("byte["+ i + "] = " + startByte);
		}
		
		System.out.println("---------------");
		System.out.println("예제02-01");
		
		/* 예제02-01 */
		
		char[] arrChar = new char[5];
		char first = 'A';
		
		for(int i = 0; i < arrChar.length; i++) 
		{
			System.out.println("char["+ i + "] = " + first);
			first ++;
		}
		
		System.out.println("---------------");
		System.out.println("예제02-02");
		
		/* 예제02-02 */
		
		boolean[] arrBoolean = new boolean[5];
		boolean boolfirst = true;
		
		for(int i = 0; i < arrBoolean.length; i++) 
		{
			if(boolfirst == true) 
			{
				boolfirst = false;
			} 
			else 
			{
				boolfirst = true;
			}
			System.out.println("boolean[" + i + "] = " + boolfirst);
		}
		
		System.out.println("---------------");
		System.out.println("예제02-03");
		
		/* 예제02-03 */
		
		short[] arrShort = new short[5];
		short shortFirst = 100;
		
		for(int i = 0; i < arrShort.length; i++)
		{
			System.out.println("short[" + i +"] = " + shortFirst);
			shortFirst += 100;
		}
		
		
		System.out.println("---------------");
		System.out.println("예제02-04");
		
		/* 예제02-04 */
		
		long[] arrLong = new long[5];
		long longFirst = 90;
		
		for(int i = 0; i < arrLong.length; i++) 
		{
			System.out.println("long[" + i + "] = " + longFirst);
			longFirst += 45;
		}
		
		
		System.out.println("---------------");
		System.out.println("예제02-05");
		
		/* 예제02-05 */
		
		float[] arrFloat= new float[5];
		float firstFloat = 3.14f;
		
		for(int i = 0; i < arrFloat.length; i++)
		{
			System.out.println("float[" + i + "] = " + firstFloat );
			firstFloat += 3.14f;
		}
		
		System.out.println("---------------");
		System.out.println("예제02-05");
		
		/* 예제02-06 */
		
		double[] arrDouble = new double[5];
		double firstDouble = 3.141592;
		
		for(int i = 0; i < arrDouble.length; i++) 
		{
			System.out.println("double[" + i + "] = " + firstDouble);
		}
		
		System.out.println("---------------");
		System.out.println("예제03");
		
		/* 예제03 */
		
		int[] a1;
		a1 = new int[5];
		int firstA = 1;
		for(int i = 0; i < a1.length; i++)
		{
			System.out.println("a1[" + i + "] = " + firstA);
		}
		
		System.out.println("---------------");
		System.out.println("예제04");
		
		/* 예제04 */
		/* 1에서 100까지 정수를 기억시키고 그 합을 구하는 프로그램 */
		
		int[] blue = new int[100];
		for(int i = 1; i < blue.length; i++) {	//배열 blue에 1~100까지 넣어달라는 명령
			blue[i] = i;
		}
		
		int sum = 0;
		for(int i = 0; i <blue.length; i++) {
			sum += blue[i];
			
		}
		System.out.println(sum);
		
		System.out.println("---------------");
		System.out.println("예제05");
		
		/* 배열 a에는 2, 10, 8, 5, 3, 9의 값이 들어있다. 배열 a에 들어있는 값들의 합을 구하여라 */
		
		int[] red = {2, 10, 8, 5, 3, 9};
		System.out.println("red의 합 = " + (2 + 10 + 8 + 5 + 3 + 9));
		sum = 0;
		
		for(int i = 0; i < red.length; i++)
		{
			sum += red[i];
		}
		System.out.println(sum);
		
		System.out.println("---------------");
		System.out.println("예제06");
		
		/* 예제06 */
		
		char[] cha = {'a', 'p', 'p', 'l', 'e'};
		
		/* 순서대로 */
		for(int i = 0; i < cha.length; i++)
		{
			System.out.println(cha[i]);
		}
		
		System.out.println("===============");
		
		/* 역순 */
		for(int i = 4; i >= 0; i--)
		{
			System.out.println(cha[i]);
		}
		
		System.out.println("---------------");
		System.out.println("예제06");
		
		/* 예제06 */
		
		int[] green = new int[10];
		int firstGreen = 1;	//초기값
		int sumGreen = 0;
		for(int i = 0; i < green.length; i++)
		{	//배열 green에 index에 집어넣기
			green[i] = firstGreen;
			firstGreen *= 10;	//10씩 곱해주는 값
		}
		
		for(int i = 0; i < green.length; i++) 
		{	//index끼리 더한 값을 구하는 명령
			sumGreen += green[i];
		}
		
		System.out.println("배열의 합은 = " + sumGreen);
		
		int max = 0;
		
		for(int i = 0; i <= 1; i++) 
		{
			if(green[i] > max) {
				max = green[i];
			}
			System.out.println("index중 큰 수는 = " + green[i]);
		}
		
		System.out.println("===============");
		
		
		max = 1;
		for(int i = 0; i <= 2; i++) {
			if(green[i] > max) {
				max = green[i];
			}
			System.out.println("index중 큰 수는 = " + green[i]);
		}
		
		
		
		System.out.println("---------------");
		System.out.println("예제07");
		
		int[] a3 = new int[10];
		int key = 8;
		//초기화
		for(int i = 0; i< 10; i++) {	//0~9까지의 int 타입 데이터를 배열에 추가
			a3[i] = i;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(a3[i]);
			if(key == a3[i]) {	//a3[i]의 index가 key값인 8이 되면 print 해달라는 명령
				System.out.println("key찾음.");
				break;
			}
		}
		
		
		System.out.println("---------------");
		System.out.println("예제08");
		
		
		int[] b = new int[10];
		int sum2 = 0;
		for(int i = 0; i < b.length; i++) {
			b[i] = i;
			System.out.println(b[i]);
		}
		
		System.out.println("===============");
		
		for(int i = 0; i < b.length; i++) {
			sum2 += b[i];
			System.out.println(sum2);
		}
		
		System.out.println("---------------");
		System.out.println("예제09");
		
		int[] num = new int[5];
		int number = 1;
		
		for(int i = 1; i < num.length; i++) {
			num[i] = number;
			number *= 10;
			System.out.println("num[" + i + "] = " + number);
		}
		
		System.out.println("===============");
		
		
		number = 1;
		int[] numb = new int[6];
		for(int i = 0; i < numb.length; i++) {
			System.out.println("numb[" + i +"] = " + number);
		}
		
		System.out.println("===============");
		
		int[] numberRe = new int[6];
		
		for(int i = 0; i < numberRe.length; i++) {
			numberRe[i] = number;
			System.out.println("numberRe[" + i + "] = " + number);
			number++;
		}
		
		System.out.println("---------------");
		System.out.println("예제10");
		
		
		int[] numbe = new int[6];
		number = 1;
		
		for(int i = 0; i < numbe.length; i++) {
			numbe[i] = number;
			System.out.println("numbe[" + i + "] = " + number);
			number += 2;
		}
		
		System.out.println("===============");
		
		int[] nu = new int[6];
		number = 10;
		
		for(int i = 0; i < nu.length; i++) {
			nu[i] = number;
			System.out.println("nu[" + i + "] = " + number);
			number += 10;
		}
		
		System.out.println("---------------");
		System.out.println("예제11");
		
		int[] n = new int[10];
		number = 0;	//초기값이 0이어야 if를 홀수 조건으로 했을 때 정상적으로 출력됨
		
		for(int i = 0; i < n.length; i++) {	//1~10까지 배열에 넣음
			n[i] = number;
			System.out.println(n[i]);
			number++;
		}
		
		for(int i = 0; i < n.length; i++) {
			n[i] = (int)Math.pow(n[i], 2);
			
			if(i%2 == 1) {
				System.out.println("n[" + i + "] = " + n[i]); 
				}
			 
		}
		
		System.out.println("---------------");
		System.out.println("예제12");
		
		int[] newarr = new int[5];	//새로운 배열 선언
		
		
		//입력한 숫자를 배열의 각 index로 넣는 명령
		
//		 for(int i = 0; i < newarr.length; i++) { 
//			 Scanner prompt = new Scanner(System.in); 
//			 System.out.println((i+1) + "번째 숫자를 입력하세요."); 
//			 int lion = prompt.nextInt(); 
//			 newarr[i] = lion; 
//			 }
		 
		
		
		//입력 받은 각각의 index 데이터를 출력해주는 명령
		
		for(int i = 0; i < newarr.length; i++) {	
			System.out.println("newarr[" + i + "] = " + newarr[i]);
		}
		
		System.out.println("---------------");
		System.out.println("예제13");
		
		/* 정수 10개를 입력 받아 갖아 큰 값을 구하라 */
		
		
//		int[] newarr1 = new int[10];
//		max = 0;
//		for(int i = 0; i < newarr1.length; i++) {
//			Scanner prompt1 = new Scanner(System.in);
//			System.out.println((i + 1) + "번째 숫자를 입력하세요");
//			int tiger = prompt1.nextInt();
//			
//			newarr1[i] = tiger;
//		}
//		
//		for(int i = 0; i < newarr1.length; i++) {
//			if(max < newarr1[i]) {
//				max = newarr1[i];
//			}
//		}
//		
//		System.out.println("정수 10개 중 가장 큰 수 = " + max);
		
		System.out.println("---------------");
		System.out.println("예제14");
		
		int[] Jumsu = new int[5];
		
		for(int i = 0; i < Jumsu.length; i++) {
			Scanner newarr2 = new Scanner(System.in);
			System.out.println((i+1) + "번째 수학점수를 입력하세요.");
			int Number = newarr2.nextInt();
			
			Jumsu[i] = Number;
		}
		
		sum = 0;
		for(int i = 0; i < Jumsu.length; i++) {
			sum += Jumsu[i];
		}
		
		System.out.println("5명의 수학점수 합은 " + sum + "점입니다.");
		System.out.println("5명의 수학점수 평균은 " + (sum / 5) + "점입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
