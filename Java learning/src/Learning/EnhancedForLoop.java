package Learning;

import java.util.Scanner;

public class EnhancedForLoop 
{

	public static void main(String[] args)
	{
		int a,i=0,total=0;
		Scanner input=new Scanner (System.in);
		
		System.out.println("enter the size of array!!");
		a=input.nextInt();
		int arr[]=new int[a];
		
		for(int x : arr)
		{
			// x reads and stores value from arr[i] which is zero right now.
			System.out.println("enter the value of arr["+i+"]");
			x=input.nextInt();// changing value of x from 0 to a user's value.
			arr[i]=x;// chalaki!! assigning value to array. Before it, every value of array was zero.
			total+=x;
			i++;
		}
		i=0;
		for(int y : arr)
		{
			// y reads and stores value from arr[i].
			System.out.println("arr["+i+"] = "+y);
			i++;	
		}
		System.out.println("Total = "+total);
	}

}
