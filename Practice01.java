
public class Practice01 {

	public static void main(String[] args) {
		
		int[][] num = new int[5][5];
		int result = 1;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < 5; j++) {
				num[i][j] = result++;
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		int[][] num2 = new int[5][5];
		int result2 = 1;
		
		
		for(int i = 0; i < num2.length; i++) {
			for(int j = 0; j < num2[i].length; j++) {
				num2[i][j] = result2;
				result2 += 3;
				System.out.print(num2[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		int[][] num3 = new int[5][];
		int result3 = 1;
		
		for(int i = 0; i < num3.length; i++) {
			num3[i] = new int[5];
			for(int j = 0; j < num3[i].length; j++) {
				num3[i][j] = result3;
				result3 += 2;
				System.out.print(num3[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		int[][] num4 = new int[5][];
		int result4 = 2;
		
		for(int i = 0; i < num4.length; i++) {
			num4[i] = new int[5];
			for(int j = 0; j < num4[i].length; j++) {
				num4[i][j] = result4;
				result4 += 2;
				System.out.print(num4[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] num5 = new int[5][];
		int result5 = 1;
		
		for(int i = 0; i < num5.length; i++) {
			num5[i] = new int[5];
			for(int j = 0; j < num5[i].length; j++) {
				num5[i][j] = result5 * result5;
				result5 ++;
				System.out.print(num5[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		int[][] num6 = new int[5][];
		int result6 = 25;
		
		for(int i = 0; i < num6.length; i++) {
			num6[i] = new int[5];
			for(int j = 0; j < num6[i].length; j++) {
				num6[i][j] = result6;
				result6--;
				System.out.print(num6[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] num7 = new int[5][];
		int result7 = 1;
		
		for(int i = 0; i < num7.length; i++) {
			num7[i] = new int[5];
			for(int j = 0; j < num7[i].length; j++) {
				num7[i][j] = result7;
				result7++;
				System.out.print(num7[i][j] + "\t");
				if(result7 == 6) {
					result7 = 1;
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		int[][] num8 = new int[5][];
		int result8 = 1;
		
		for(int i = 0; i < num8.length; i++) {
			num8[i] = new int[5];
			result8 = i + 1;	// 열마다 첫번째 숫자를 1씩 더해주는 명령
			for(int j = 0; j < num8[i].length; j++) {
				num8[i][j] = result8;
				result8 += 5;
				System.out.print(num8[i][j] + "\t");
				}
			System.out.println();
			}

		
		System.out.println();
		
		int[][] num9 = new int[5][];
		
		for(int i = 0; i < num9.length; i++) {
			num9[i] = new int[5];
			int result9 = i;
			result9++;
			for(int j = 0; j < num9[i].length; j++) {
				num9[i][j] = result9;
				System.out.print(num9[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
///////	회오리 
		
		// 첫째 열
		int[] to = new int[5];
		int re = 1;
		
		for(int i = 0; i < to.length; i++) {
			System.out.print(re + "\t");
			re++;
		}
		
		System.out.println();
		// 줄째 열
		int[] to2 = new int[5];
		int re2 = 16;
		
		for(int i = 0; i < to2.length-1; i++) {
			System.out.print(re2 + "\t");
			re2++;
		}
		
		System.out.print(6);
		System.out.println();
		
		
		//셋째 열
		
		int[] to3 = new int[5];
		int re3 = 24;
		
		System.out.print(15 + "\t");
		
		for(int i = 1; i < 3; i++) {
			System.out.print(re3 + "\t");
			re3 ++;
		}
		
		System.out.print(20 + "\t" + 7 + "\t");
		System.out.println();
		
		//넷째 열
		
		int[] to4 = new int[5];
		int re4 = 23;
		
		System.out.print(14 + "\t");
		
		for(int i = 1; i < 4; i++) {
			System.out.print(re4 + "\t");
			re4--;
		}
		
		System.out.print(8 + "\t");
		System.out.println();
		
		// 다섯째 열
		
		int[] to5 = new int[5];
		int re5 = 13;
		
		for(int i = 0; i < to5.length; i++) {
			to5[i] = re5;
			System.out.print(re5 + "\t");
			re5--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		} //main
	}//class


