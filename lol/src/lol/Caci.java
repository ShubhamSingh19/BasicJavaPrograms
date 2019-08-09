package lol;

import java.util.Scanner;
import firstProject.Minus;

public class Caci {
	public static void main(String[] args) {
		double x,y;
		Scanner s= new Scanner(System.in);
		Add ob=new Add();
		Minus ob2=new Minus();
		System.out.println("enter the first number:");
		x=s.nextDouble();
		System.out.println("enter the seecond number:");
		y=s.nextDouble();
		System.out.println("sum = "+ob.addition(x,y));
		System.out.println("difference = " + ob2.subs(x,y));		
	}
}
