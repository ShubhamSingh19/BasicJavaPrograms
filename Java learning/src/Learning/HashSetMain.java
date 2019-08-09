package Learning;

import java.util.*;

public class HashSetMain {

	public static void main(String[] args) {
		String[] items = {"first","second","third","second","fourth"};
		List<String> list =Arrays.asList(items);
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);

	}

}
