
public class Example02 {

	public static void main(String[] args) {
		
		int i, j;
		int[][] arr = new int[2][3];
		
		
		//값을 할당하는 for문
		for(i = 0; i < 2; i++) {	//행	
			for(j = 0; j < 3; j++) {	//열
				arr[i][j] = i * 3 + j + 1;
			}
		}
		
		//출력하는 for문
		for(i = 0; i < 2; i++) {	
			for(j = 0; j < 3; j++) {
				System.out.println("arr[" + i + "][" + j +"] = " + arr[i][j] + "\t");
			}
		}
		
		System.out.println();
		
		
		int v = 1;
		int k, l;
		int[][] num = null;
		num = new int[2][];
		
		for(k = 0; k < num.length; k++) {
			num[k] = new int[3];
			for(l = 0; l < 3; l++) {
				num[k][l] = v++;
			}
		}
		
		for(k = 0; k < 2; k++) {	//행의 index 갯수가 length가 된다
			for(l = 0; l < num[k].length; l++) {
				System.out.println(num[k][l]);
			}
			System.out.println();
		}

	}

}
