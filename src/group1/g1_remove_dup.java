//WAP to remove the duplicate characters in given string

package group1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class g1_remove_dup {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		System.out.println("The given string is "+s);
		
		
//step1
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		 for (int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		 }
		 
//step2
		
		 for (Character ch : set) 
		 {
			 System.out.print(ch+" ");
		}	 
	}
}
