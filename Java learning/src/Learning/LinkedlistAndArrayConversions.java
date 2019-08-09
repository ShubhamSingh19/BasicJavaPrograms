package Learning;

import java.util.*;

public class LinkedlistAndArrayConversions {

	public static void main(String[] args) {
		String[] items ={"lol","mad","funny","bla bla"};
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(items));
		
		list.add("funky");
		list.addFirst("first Fool");
		//clear one string variable
		list.subList(4, 5).clear();//it removes bla bla not only bla as bla bla is treated one String
		
		
		String[] items2=list.toArray(new String[list.size()]);
		//this enhanced for loop  can be used in list also
		for(String i : items2){
			System.out.printf("%s ",i);
		}
		
	}

}
