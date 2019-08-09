package studing;

public class PolymorphismArrayMain {
	public static void main(String[] args){
		PArraySuper object = new PArraySuper();
		PArraySuper ob[] = {new PArraySub1(),new PArraySub2()};//saves time and line of codes
		// can refer   a object of super class and assigning it to sub class while creating a new object
		// like>> SuperCLass object= new SubClass();
		for(PArraySuper x: ob){
			x.task();
		}
		System.out.println("\nNOW MORE\n");
		Worker wob = new Worker();
		wob.work(object);
		wob.work(ob[0]);
		wob.work(ob[1]);
		//here work takes object of super class only but super class we are able to access
		// the overridden method(task())of subclasses which makes things easy & saves time of making
		// method like work1 work2 etc for each different classes
		
		
	}
}
