//swap given two strings without using 3rd variable
// string s =tester --> s.substring(0,3) = tes [it will read from 0th index and read till the (3-1) index]
// s.substring(0) = tester
// s.substring(3) = ter
// s.substring(4,5) = e

/* String s1 = "java"
 *  String s2 = "python"
 *  
 */
package pro;

public class swap_string_Test {
	public static void main(String[] args) {
		String s1 = "good";
		String s2 = "morning";
		System.out.println("before swapping");
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		s1=s1+s2;										//javapython-->10
		s2=s1.substring(0, s1.length()-s2.length());    //s1.substring(0,4)		s2=java		s1=javapython
		s1=s1.substring(s2.length());				   //s1.substring(4)		s2=java		s1=python
		
		System.out.println("after swapping");
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
	}

}
