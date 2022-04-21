package Maps;

import java.util.HashMap;

public class HashMap_Test {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("mima", 123);
		map.put(854, 563);
		map.put(562, "rek");
		map.put(854, 231); // the value updated for the duplicate key
		map.put("dad", 123); //duplicate value is accepted
		map.put(null, null);
		map.put(null, 854); 
		map.put(null, "abhi"); //accepts null  
		
		System.out.println(map);
		
	}

}
