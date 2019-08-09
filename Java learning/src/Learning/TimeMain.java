package Learning;

public class TimeMain {

	public static void main(String[] args) {
		Time object = new Time();
		System.out.println(object.Millitary());
		System.out.println(object.Normal());
		object.setTime(1,59,59);
		System.out.println(object.Millitary());
		System.out.println(object.Normal());
		

	}

}
