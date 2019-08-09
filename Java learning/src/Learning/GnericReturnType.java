package Learning;

public class GnericReturnType {

	public static void main(String[] args) {
		System.out.println(max(43,57,93));
		System.out.println(max('a','Z','e'));
		System.out.println(max("Aman", "Shubham", "Manthan"));

	}
	
	private static <T extends Comparable<T>> T max(T x, T y, T z){
		T m = x;
		if(y.compareTo(m)>0)
			m=y;
		if(z.compareTo(m)>0)
			m=z;
		return m;
	}

}
