//String s[] ={"apple", "mango", "banana"}
//[vowel count]-->with duplicate and without duplicate
//apple = 2				2
//mango = 2				2
//banana = 3			1

package tricky;

import java.util.LinkedHashSet;

public class noOfVowels {
	public static void main(String[] args) {
		String s[] ={"apple", "mango", "banana"};
		
		for(int i=0; i<s.length;i++)
		{int count=0;
			for(int j=0; j<s[i].length();j++)
			{
				char ch = s[i].charAt(j);
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
				
			}
			System.out.println("The vowels count in "+s[i]+" is "+count);
		}
		
	}

}
