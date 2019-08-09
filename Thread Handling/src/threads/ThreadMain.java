package threads;

public class ThreadMain {

	public static void main(String[] args) {
		Thread ob1= new Thread(new ThreadRun("one"));
		Thread ob2= new Thread(new ThreadRun("two"));
		Thread ob3= new Thread(new ThreadRun("three"));
		Thread ob4= new Thread(new ThreadRun("four"));
		Thread ob5= new Thread(new ThreadRun("five"));
		
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
		ob5.start();

	}

}
