//WAP to print the number of occurance of each character in the given string
//"WELCOME TO INDIA TO"
//WELCOME=1 TO=2 INDIA=1 
//TO=2-->print duplicate character
//WELCOME INDIA -->print unique character
//WELCOME=1 TO=1 INDIA=1 -->remove duplicate characters from the string

/* step1-- create any set collection and store each character of given string (god)
 * step2-- compare the each character of the set with all character of the given string
 * step3-- if char is matching increment the count
 * step4-- print both character and the count
 */

package group2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class g2_noOfOccurance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		System.out.println("The given sentence is "+s);
		
		  String[] arr = s.split(" ");
	
		System.out.println("==================");
		 System.out.println("word     occurance");
		 System.out.println("==================");
		
		 
		 
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
// step3
				 count++;
			 }
// step4
			System.out.println(word+"         "+count);
			
		}
		
	}

}
