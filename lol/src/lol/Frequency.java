package lol;

import java.util.Scanner;
import java.util.Random;

public class Frequency 
{

	public static void main(String[] args) 
	{
		int a;
		int arr[]= new int[6];
		Scanner input = new Scanner(System.in);
		Random dice = new Random();
		
		System.out.println("Enter the number of time you want to roll the dice!!");
		a=input.nextInt();
		
		for(int counter=0 ; counter<a ; counter++ )
		{
			++arr[dice.nextInt(6)];
		}
		System.out.println("FACE\tTIMES OF OCCURENCE");
		for(int face=0 ; face<arr.length ; face++)
		{
			System.out.println((face+1)+"\t"+arr[face]);
		}

	}

}
