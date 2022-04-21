//Find number of occurance of each charaters
package pro;

import java.util.Scanner;

public class Occurance_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		int count=0;
		
		System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
			for (int j=0;j<s.length();)
			{
			if( s.charAt(i)==s.charAt(j))
			{
				//System.out.println(s.charAt(i));
				//System.out.println(s.charAt(j));
				
			 count++; 
			  j++;
			  break;
			 
			}
			 
			}
			 
			 System.out.println(s.charAt(i)+" "+count);
			 i++;
		}
	}
}
