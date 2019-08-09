package fileHandling;

import java.util.Scanner;

public class FileMain {

	private static Scanner input;
	private static Scanner input2;
  
	public static void main(String[] args) {
		
		final String s;
		String name,roll,batch,entry;
		int i=0;
	    int ch;
	    
		input = new Scanner(System.in);
		input2 = new Scanner(System.in);
		FileMethods object = new FileMethods();
		
		System.out.println("Press 1 to create a new file!!\nPress 2 to open exsiting file!!\nenter your choice!!\n");
		ch=input2.nextInt();
		
		System.out.println("Enter the name of file!!");
		s=input.nextLine();
		
		switch(ch){
		case 1:{
			object.createFile(s);
			if(object.exists==0){
				do{
					System.out.printf("\nEntry %d:\nEnter the Name:\n",i+1);
					name=input.nextLine();
					System.out.printf("Enter the Roll no:\n");
					roll=input.nextLine();
					System.out.printf("Enter the Batch:\n");
					batch=input.nextLine();
					object.addData(name, roll, batch);
					
					i++;
					
					System.out.println("\nPress any key to continue or 'q' to quit!!");
					entry=input.nextLine();
				}while(!entry.equalsIgnoreCase("q"));
				
				object.closeFile();
			}
			else
				System.out.println("Try another file name to create new!!");
			break;	
		}
		case 2:{
			object.readFile(s);
			break;
		}
		default:
			System.out.println("Wrong Choice !!");
		}
		
		
		System.out.println("The End!!");
    }
	
}
