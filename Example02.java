
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] f = new float[3];
		float[] f2 = f;
		f[0] = 3.14f;
		f[1] = 2.34f;
		f[2] = 9.08f;
		
		System.out.println(f[2]);
		System.out.println(f2[2]);
	}

}
