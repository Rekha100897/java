//WAP to print vowels in the given string (with duplicate) and print the number of vowels

package group3;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
		System.out.println("The given string is "+s);
		int count=0;
		 s = s.toLowerCase();
		  
		for(int i=0; i<s.length();i++)
		{
	
			
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
			
			count++;
			System.out.println(s.charAt(i));
		
			}
		
	}
		System.out.println("Total number of vowels in the given string"+count);
}
}