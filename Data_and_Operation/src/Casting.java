
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;			// 1(int) -> 1.0(double) : no data loss
		System.out.println(b);
		
//		int c = 1.1;			//error	
		double d = 1.1;
		int e = (int) 1.1;		// 1.1(double) -> 1(int) : data loss
		System.out.println(e);	

		// integer to string
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}

}
