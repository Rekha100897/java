// WAP to print only unique characters of the given string

package group2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class g2_print_unique {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the sentence");
	String s = sc.nextLine();
	System.out.println("The given sentence is "+s);
	
	  String[] arr = s.split(" ");

	System.out.println("==================");
	 System.out.println("word     occurance");
	 System.out.println("==================");
	
	/* for (int i=0;i<arr.length;i++){
	 System.out.println(arr[i]);}*/
	 
	 
//step1
	 LinkedHashSet<String> set = new LinkedHashSet<String>();
	
	 for (int i=0;i<arr.length;i++){
		set.add(arr[i]);
	 }
	 
	 //System.out.println(set);

//step2
	 
	 for (String word : set) 
	 {
		 int count=0; 
		 for (int i=0;i<arr.length;i++){
			if(word.equals(arr[i]))
//step3
			 count++;
		 }
//step4
		 if(count==1)
		System.out.println(word+"         "+count);
		
	}
	
}
	

}
