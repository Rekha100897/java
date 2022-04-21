//WAP to print vowels in the given string (without duplicate)

package group3;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class g3_Vowels_wo_dup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
		System.out.println("The given string is "+s);
		
		s=s.toLowerCase();
		int count=0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.print(ch);
				count++;
				
			}
			
		}
		System.out.println();
		System.out.println("The total number of vowels in the given string"+count);
		
	}

}
