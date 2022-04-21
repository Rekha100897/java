package group2;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		System.out.println("The given sentence is "+s);
		
		  String[] arr = s.split(" ");
		  for(int i=arr.length-1;i>=0;i--){
			  System.out.print(arr[i]+" ");
		  }
	}

}
