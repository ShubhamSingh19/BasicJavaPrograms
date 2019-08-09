package stringHandling;

public class StringMethodsMain {

	public static void main(String[] args) {
		String a="   Shubham you are cool and awsm!! Shubham, you should work out hard to be the best!!";
		String b="You love Becons and carrots   ";
		int c,c1,d;
		a=a.concat(b);
		a=a.toUpperCase();
		a=a.replace("AM", "ANGI");
		a=a.trim();
		c=a.indexOf('T');
		c1=a.indexOf("T",64);
		d=a.indexOf("THE",64);
		if(a.startsWith("S")){
			System.out.println(a+c);
			System.out.println(c1);
			System.out.println(d);
		}

	}

}
