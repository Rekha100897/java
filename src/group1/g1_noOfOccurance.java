//WAP to print the number of occurance of each character in the given string
//String s="good"
//g=1 o=2 d=1
//o=2  (o)-->print duplicate character
//g=1 d=1 (gd)-->print unique character
//(god)-->remove duplicate characters from the string

/* step1-- create any set collection and store each character of given string (god)
 * step2-- compare the each character of the set with all character of the given string
 * step3-- if char is matching increment the count
 * step4-- print both character and the count
 */

package group1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class g1_noOfOccurance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		System.out.println("The given string is "+s);
		System.out.println("==================");
		 System.out.println("ch     occurance");
		 System.out.println("==================");
		
//step1
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		 for (int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		 }
		
		 
//step2
		 
		 for (Character ch : set) //g o d
		 {
			 int count=0;
			 for (int i=0;i<s.length();i++){
				if(ch==s.charAt(i))
// step3
				 count++;
			 }
// step4
			
			 
			System.out.println(ch+"         "+count);
		}
		 
	}

}
