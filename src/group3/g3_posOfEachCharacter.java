//WAP to find the position of each character in the given string
// t=1 e=2 s=3 r=6 -->for(int i=0; i<s1.length();i++)
// t=4 e=5 s=3 r=6 -->for(int i=s1.length()-1; i>=0;i--)
//s1   ch
//=========
//t		t
//e		e
//s		s
//t		r
//e
//r

package group3;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class g3_posOfEachCharacter {
	public static void main(String[] args) {
		
		int pos=0;
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the string ");
		String s1 = scr.nextLine();
		
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		 for (int i=0;i<s1.length();i++){
			set.add(s1.charAt(i));
		 }
		 
		 
		s1 = s1.toLowerCase();
		// s1 = tester
		// set = tesr
	
		for (Character ch : set) {
			//for(int i=0; i<s1.length();i++){
				for(int i=s1.length()-1; i>=0;i--){
			if(ch==s1.charAt(i)){
			pos=i+1;
			System.out.println("position of the character "+s1.charAt(i)+" is "+pos);
			break; // when braek is applied control goes to -->for (Character ch : set)
			       //for duplicate also if you want position--> remove break
			}
		}
		}
	}

}
