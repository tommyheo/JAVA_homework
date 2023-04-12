
public class Example01 {

	public static void main(String[] args) {
		
		int i, j , k = 0;
		
		for(i = 0; i < 10; i++) {		//column
			for(j = 0; j < 3; j++) {	//row
				System.out.print(++k + "\t");
				if(k == 10) {	//10이 되면 넘어가게끔
					break;
				}
			}		
			System.out.println();
		}

	}

}
