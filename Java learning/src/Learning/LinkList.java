package Learning;

import java.util.*;

public class LinkList {
	public static void main(String[] args){
		List<String> list1 = new LinkedList<String>();
		List<String> list2= new LinkedList<String>();
		
		String[] items1 ={"Apple","Banana","Guva","Papaya","Lichi"};
		String[] items2 ={"Knife","Basket","Table","Chair"};
		
		for(String i: items1)
			list1.add(i);
		
		for(String j: items2)
			list2.add(j);
		
		
		list1.addAll(list2);
		list2=null;
		
		
		display(list1);
		remove(list1,2,3);
		display(list1);
		reverse(list1);
	}
	private static void display(List<String> list){
		for(String l: list){
			System.out.printf("%s ",l);
		}
		System.out.println();
	}
	
	private static void remove(List<String> list,int from,int to){
		list.subList(from, to).clear();
	}
	
	private static void reverse(List<String> list){ 
		//Method 1
		ListIterator<String> ite=list.listIterator(list.size());
		while(ite.hasPrevious()){
			System.out.printf("%s ",ite.previous());
		}
		// OR both gives same result
		//Method 2
		System.out.println();
		for(int i=list.size()-1; i>=0; i--){
			System.out.print(list.get(i)+" ");
		}
	}

}
