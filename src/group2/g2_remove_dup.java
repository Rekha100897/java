//WAP to remove the duplicate characters in given string

package group2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class g2_remove_dup {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		System.out.println("The given sentence is "+s);
		System.out.println();
		
		 String[] arr = s.split(" ");
		
//step1
		 LinkedHashSet<String> set = new LinkedHashSet<String>();
		 for (int i=0;i<arr.length;i++){
				set.add(arr[i]);
			 }
//step2
		
		 for (String ch : set) 
		 {
			 System.out.print(ch+" ");
		}
		 
	}


}
