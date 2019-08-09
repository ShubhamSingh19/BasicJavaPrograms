package lol;

import java.util.Random;
import java.util.Scanner;

public class random
{
	public static void main (String[] args)
	{
		int number;
		Random dice = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Press any key to roll the dice OR press '0' to exit!!");
		while(input.nextInt()!=0)
		{
			number=1+dice.nextInt(6);
			System.out.println("!! DICE SHOWED "+number+" !!\n");
			System.out.println("press any key OR '0' zero !!");
		}
	}

}
