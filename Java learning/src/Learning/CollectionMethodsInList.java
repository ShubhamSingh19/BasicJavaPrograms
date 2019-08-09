package Learning;

import java.util.*;


public class CollectionMethodsInList {

	public static void main(String[] args) {
		String[] items={"lol","mad","funny","bla bla","she"};
		String[] items2={"Knife","Basket","Table","Chair","he"};
		Character[] moreItems={'a','b','c','d'};
		Character[] copyArray=new Character[moreItems.length];
		List<String> list=Arrays.asList(items);
		List<Character> list2=Arrays.asList(moreItems);
		List<Character> copyList=Arrays.asList(copyArray);
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("he");
		list3.add("she");
		list3.add("they");
		
		
		
		Collections.sort(list);
		System.out.print("After sorting String :");
        output1(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.print("After sorting String in reverse order :");
        output1(list);
        Collections.reverse(list2);
        System.out.print("After reversing characters :");
        output2(list2);
        Collections.copy(copyList, list2);
        System.out.print("After copying characters :");
        output2(copyList);
        Collections.fill(list2, '*');
        System.out.print("After filling characters :");
        output2(list2);
        //addAll() method gives error when non dynamic array items are added to normal list
        Collections.addAll(list3,items2 );
        System.out.print("After addAll :");
        output1(list3);
        
        System.out.println(Collections.frequency(list3, "he"));
        
        boolean b=Collections.disjoint(list, list3);
        System.out.println(b);
        
        if(b)
        	System.out.println("Nothing Common!!");
        else
        	System.out.println("Something Common!!");
        
	}
	private static void output2(List<Character> data){
		for(Character x : data)
			System.out.print(x+" ");
		
		System.out.println();
	}
	
	private static void output1(List<String> data2){
		for(String y : data2)
			System.out.print(y+" ");
		
		System.out.println();
	}

}
