package Maps;

import java.util.TreeSet;

public class TreeSet_Test {
	public static void main(String[] args) {
		TreeSet list = new TreeSet<>();
		//list.add(null); //NullPointerException
		//list.add("Good"); //ClassCastException
		list.add(50);
		list.add(10);
		list.add(60);
		list.add(70);
		list.add(15);
		
		System.out.println(list);
		
	}

}
