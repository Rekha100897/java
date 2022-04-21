// 
//i/p -->my name is rekha
//o/p  -->My Name Is Rekha
/*
 step1 -->First letter is converted into cap 
 step2 -->start from 1st index read all the characters from "for loop"
 step3 -->if character!=' ' execute else block
 step4 -->if character==' ' execute if block
 while printing space only the next letter is converted into upper case
 so, skip the next character  --> i=i+1;
 -32 is because
  		ASCII value of a=97 and ASCII value of A=65
 		to covert the lowercase into uppercase 97-32 = 65(ASCII value of uppercase)
 */

package tricky;

public class InitCap {
	public static void main(String[] args) {
		String s = "my name is rekha";
		
		
//step1
//int r = s.charAt(0)-32; (the returntype is int, so convert it into char by downcasting)
		char ch = (char)(s.charAt(0)-32);    //downcasting
		System.out.print(ch);
		
		for(int i=1; i<s.length();i++){
			if (s.charAt(i)==' ')
			{
				System.out.print(" "+(char)(s.charAt(i+1)-32));
				i=i+1;
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
