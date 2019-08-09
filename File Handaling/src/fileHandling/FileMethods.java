package fileHandling;

import java.io.*;
import java.util.*;

public class FileMethods {
	private Formatter ftr;
	public int exists=0;
	private Scanner r;
	
	public void createFile(String fname){
		
		File f = new File(String.format("C:\\Users\\Shubham\\Desktop\\Java\\File Handaling\\%s.txt",fname));
		
		if(f.exists()){
			System.out.println(f.getName()+" already exists at "+f.getPath());
			exists = 1;
		}	
		
		else{
			try{
				ftr=new Formatter(String.format("%s.txt",fname));
				f = new File(String.format("C:\\Users\\Shubham\\Desktop\\Java\\File Handaling\\%s.txt",fname));
				System.out.println(f.getName()+" created at "+f.getPath());
			}
			catch(Exception creatingFile){
				System.out.println("Error occured !!");
			}
		}
		
	}
	
	public void addData(String x,String y,String z){
		ftr.format("%s\t\t%s\t%s\t\n",x,y,z);
	}

	public void closeFile(){
		ftr.close();
	}
	
	public void readFile(String fname2){
		File f2 = new File(String.format("C:\\Users\\Shubham\\Desktop\\Java\\File Handaling\\%s.txt",fname2));
		
		if(f2.exists()){
			System.out.println(f2.getName()+" exists at "+f2.getPath());
			try{
				r=new Scanner(new File(String.format("%s.txt",fname2)));
				while(r.hasNext()){
					String a=r.next();
					String b=r.next();
					String c=r.next();
					System.out.printf("%s\t\t%s\t%s\n",a,b,c);
				}
				r.close();
			}
			catch(Exception readingFile){
				System.out.println("Error occured while reading this file!!");
			}
	    }
		else
			System.out.println("File does not exist!!");
	}

}
