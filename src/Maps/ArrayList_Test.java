//ARRAY LIST

package Maps;

import java.util.ArrayList;

public class ArrayList_Test {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(50);
		list.add(40);
		list.add(60);
		list.add(5);
		list.add(40); //allows duplicate
		list.add(null); //allows null
		list.add("STORM"); //stores heterogeneous data
	
		System.out.println(list);
	
	}

}
