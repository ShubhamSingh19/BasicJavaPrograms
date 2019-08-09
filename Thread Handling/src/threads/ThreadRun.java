package threads;

import java.util.*;

public class ThreadRun implements Runnable {
	private String name;
	private int time;
	Random ob= new Random();
	
	public ThreadRun(String n){
		name=n;
		time=ob.nextInt(6000);
		
	}
	public void run(){
		 try{
			 System.out.printf("%s will sleep for %d miliseconds\n",name,time);
			 Thread.sleep(time);
			 System.out.println(name+" has woke up!!");
		 }
		catch(Exception e){
			System.out.println("Error!!");
		}
	}
	
	

}
