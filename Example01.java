
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		
		int i;
		for(i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("배열 arr1의 주소(참조값)" + arr1);
		System.out.println("배열 arr2의 주소(참조값)" + arr2);
		
		// 배열 arr2[0]의 값을 5로 변경하고 arr1[0]의 값을 확인해보자
		
		arr2[0] = 5;
		
		System.out.println(arr1[0]);
		
		
	}

}
