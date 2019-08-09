package Learning;

import java.util.Scanner;
import java.math.*;

public class Reccursion {
	static int count=1;
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Scanner input2= new Scanner(System.in);
		System.out.println("Enter Principal:");
		double n=input.nextDouble();
		System.out.println("Enter rate:");
		double rate=input.nextDouble();
		System.out.println("Enter time:");
		int time=input2.nextInt();
		System.out.println("using reccursion: Amount = "+ amount(n,rate,time));
		System.out.println("using normal formula: Amount = "+n*Math.pow(1+(rate/100), time));
		
	}
	public  static double amount(double p,double r,int t){
		double a=p+(p*(r/100));
		if(count>=t)
			return a ;
		else{
			count++;
			return amount(a,r,t);
		}
	}

}
