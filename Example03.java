
public class Example03 {

	public static void main(String[] args) {
		// 가변배열
		
		int[][] matrix = new int[3][];
		int i = 0 ,j = 0, k = 1;
		
		matrix[0] = new int[4];	//열배열 할당
//		matrix[0][0] = 1;
//		matrix[0][1] = 2;
//		matrix[0][2] = 3;
//		matrix[0][3] = 4;
		
		for(j = 0; j < 4; j++) {
			matrix[0][j] = k++;
		}
		
		matrix[1] = new int[2];	//열배열 할당
//		matrix[1][0] = 5;
//		matrix[1][1] = 6;
		for(j = 0; j < 2; j++) {
			matrix[1][j] = k++;
		}
		
		matrix[2] = new int[3];	//열배열 할당
//		matrix[2][0] = 7;
//		matrix[2][1] = 8;
//		matrix[2][2] = 9;
		
		for(j = 0; j < 3; j++) {
			matrix[2][j] = k++;
		}
		
		for(i = 0; i < matrix.length; i++) {
			for(j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
