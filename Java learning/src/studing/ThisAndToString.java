package studing;

public class ThisAndToString {
	private int day;
	private int month;
	private int year;
	
	public ThisAndToString(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("your constructor default date is %s\n",this);
	}
	public String toString(){
		return String.format("%d/%02d/%04d",day,month,year);
	}

}
 