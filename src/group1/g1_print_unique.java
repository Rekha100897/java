// WAP to print only unique characters of the given string

package group1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class g1_print_unique {
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
			
			 if(count==1)
			System.out.println(ch+"         "+count);
		}
		 
	}

}
