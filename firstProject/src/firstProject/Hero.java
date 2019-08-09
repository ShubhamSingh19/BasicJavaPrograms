package firstProject;

import java.util.Scanner;

class Hero {

	public static void main(String[] args) {
		int s;
		float a,b,c;
		Minus ob=new Minus();
		Scanner x = new Scanner (System.in);
		do
		{
			
			System.out.println("enter the 1st no:");
			a=x.nextFloat();
			System.out.println("enter the 2nd no:");
			b=x.nextFloat();
			c=a+b;
			System.out.print("sum = ");
			System.out.println(c);
			System.out.print("difference = ");
			System.out.println(ob.subs(a,b));
			System.out.println("enter 'q' to quit or anything to continue..");
		    s=x.nextInt();
		}while(s !=0);
		

	}

}