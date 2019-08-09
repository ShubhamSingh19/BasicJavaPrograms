package Learning;

import java.util.*;

public class GenericDataType {

	public static void main(String[] args) {
		String[] items={"Knife","Basket","Table","Chair"};
		Character[] moreItems={'a','b','c','d'};
		Integer[] num ={1,2,3,4,5,6,7,8,9};
		
		List<String> list = Arrays.asList(items);
		List<Character> list2 = Arrays.asList(moreItems);
		List<Integer> list3 = Arrays.asList(num);
		output(list);
		output(list2);
		output(list3);
		
	}
	private static <T> void output(List<T> data){
		for(T x : data)
			System.out.print (x+" ");
		
		System.out.println();
	}

}
