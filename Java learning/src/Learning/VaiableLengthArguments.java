package Learning;

public class VaiableLengthArguments {

	public static void main(String[] args) {
		System.out.println(fun(1,2,3,4,5,6,7,8,9,10));
	}
	
	public static double fun(int...var){
		double avg, total=0;
		
		for(int x : var){
			total+=x;
		}
		avg=total/var.length;
		return avg;
	}

}
