//WAP to separate alpahbets, numbers, special characters
//String s="ab1@2c$"
//abc
//12
//@$
///A to Z=65 to 90
//a to z = 97 to 122
//0 to 9 = 48 to 57

package group3;

import java.util.Scanner;

public class g3_separateAllCharacters {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
		System.out.println("The given string is "+s);*/
		String s="ab12$%5";
		
		String ch="",num="",spc="";
		
		int count1=0;
		int count2=0;
		int count3=0;
		
		for(int i=0;i<s.length();i++){
		if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
			 ch = ch+s.charAt(i);
			 count1++;
		}
		else if((s.charAt(i)>='0'&&s.charAt(i)<='9')){
			num = num+s.charAt(i);
			 count2++;
		}
		else{
			spc =spc+ s.charAt(i);
			 count3++;
		}
		
		}
		
		
		System.out.println(ch+"    alphabets    "+count1);
		System.out.println(num+"   numbers     "+count2);
		System.out.println(spc+"      spl characters    "+count3);
		
	}

}
