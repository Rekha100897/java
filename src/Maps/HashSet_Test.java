package Maps;

import java.util.HashSet;

public class HashSet_Test {
	public static void main(String[] args) {
		HashSet list = new HashSet<>();
		list.add(null);
		
		list.add(50);
		list.add(10);
		list.add(60);
		list.add("Morning");
		list.add(50);
		
		System.out.println(list);
	}

}
