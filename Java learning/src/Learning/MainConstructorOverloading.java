package Learning;

public class MainConstructorOverloading {

	public static void main(String[] args){
		ConstructorOverloading ob1 = new ConstructorOverloading();
		ConstructorOverloading ob2 = new ConstructorOverloading(13);
		ConstructorOverloading ob3 = new ConstructorOverloading(2,37);
		ConstructorOverloading ob4 = new ConstructorOverloading(17,12,45);
		
		System.out.printf("%s\n",ob1.toMillitary());
		System.out.println(ob2.toMillitary());
		System.out.printf("%s\n",ob3.toMillitary());
		System.out.println(ob4.toMillitary());	
	}
	
}
