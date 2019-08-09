package Learning;

import java.util.*;

public class ListMain {

	public static void main(String[] args) {
		String[] name={"Shubham","Safal","Ritik","Ronak","Lala","Aditya","Manthan","Kanishk"};
		String[] name2={"Ronak","Kanishk","Ritik","Safal","Lala"};
		
		List<String> list1 = new ArrayList<String>();
		for(String x: name){
			list1.add(x);
		}
		for(int i=0; i<list1.size(); i++){
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		List<String> list2 = new ArrayList<String>();
		for(String y: name2){
			list2.add(y);
		}
		for(int i=0; i<list2.size(); i++){
			System.out.print(list2.get(i)+" ");
		}
		
		eraseSame(list1,list2);
		System.out.print("\nnew Edited List : ");
		for(int i=0; i<list1.size(); i++){
			System.out.print(list1.get(i)+" ");
		}
	}
	public static void eraseSame(Collection<String> data1, Collection<String> data2){
		Iterator<String> ite= data1.iterator();
	    System.out.print("\nNames Removed : ");
		while(ite.hasNext()){
			if(data2.contains(ite.next())){
				//System.out.print(ite.+" "); try to develop code for displaying removed names
				ite.remove();
			}
		}
	}

}
