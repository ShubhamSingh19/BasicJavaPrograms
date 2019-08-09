package Learning;

import java.util.*;

public class StackMethods {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		System.out.println("Pushing Data!!");
		
		s.push("Bottom");
		display(s);
		s.push("second");
		display(s);
		s.push("third");
		display(s);
		s.push("fourth");
		display(s);
		
		System.out.println("Poping Data!!");
		
		s.pop();
		display(s);
		s.pop();
		display(s);
		s.pop();
		display(s);
		s.pop();
		display(s);
		
	}
	
	private static void display(Stack<String> x){
		if(x.isEmpty())
			System.out.println("Stack is Empty!!");
		else
			System.out.println(x+" Top");
	}

}
