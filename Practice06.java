
public class Practice06 {

	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 12; i++) {
			System.out.println("\n\t\t\t" +i+"월");
			for(j = 1; j <= 30; j++) {
				System.out.print(j + "일" + "\t");
				if(j%7==0) {
					System.out.println();
				}
			}
		}
	}

}
