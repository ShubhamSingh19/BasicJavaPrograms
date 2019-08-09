package studing;

public class InheritanceSubClass extends InheritanceSuperClass {
	private int num1;
	private int num2;
	public InheritanceSubClass(int x,int y){
		num1=x;
		num2=y;
		System.out.println("sum of numbers = " +add(num1,num2));
	}
	
	
}
