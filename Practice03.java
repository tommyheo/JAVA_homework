
public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		10개 배열
//		1, 10, 100, 1000, 10000, 100000...
//		10개 배열에 위의 값을 할당해보자
		
		
		int[] arr = new int[10];
		
		int data = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = data;
			data *= 10;
		}
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println("arr[" + j + "] = " + arr[j]);
		}
	}

}
