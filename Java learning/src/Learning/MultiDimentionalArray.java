package Learning;

import java.util.Scanner;

public class MultiDimentionalArray {
 
	public static void main(String[] args) {
		int r,c,total=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows!!");
		r=input.nextInt();
		System.out.println("enter the number of column!!");
		c=input.nextInt();
		System.out.println();
		int arr[][]=new int[r][c];
		for(int row=0 ; row<arr.length ; row++){
			
			//arr.length counts length of rows in 2D array
			//in 1D array array_name.length counts the number of columns that is = to no. of elements
			
			for(int column=0 ; column<arr[row].length ;  column++){
				//arr[row].length counts the number of column in each row in 2D array
				
				System.out.println("enter the value of arr["+row+"]["+column+"] !!");
				arr[row][column]=input.nextInt();
			}
		}
		
		System.out.println("\n2D representation of your array :");
		
		for(int row=0 ; row<arr.length ; row++){
			for(int column=0 ; column<arr[row].length ; column++){
				System.out.print(arr[row][column]+" ");
				total+=arr[row][column];
			}
			System.out.println();
		}
		System.out.println("Sum of array elements = "+total);
	}
}
