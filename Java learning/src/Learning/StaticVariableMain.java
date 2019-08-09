package Learning;

public class StaticVariableMain {

	public static void main(String[] args) {
		StaticVariable ob1 = new StaticVariable("Shubham Singh","B7");
		StaticVariable ob2 = new StaticVariable("Neha Sharma","B2");
		StaticVariable ob3 = new StaticVariable("Safal Sing Gaur","B7");
		
		System.out.println(StaticVariable.getStudents());

	}

}
