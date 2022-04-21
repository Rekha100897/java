package tricky;

import java.util.LinkedHashSet;

public class Sample11 {
	public static void main(String[] args) {
		
		String[] s={"abc","adbc","abc","efg"};
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++)
		{
			set.add(s[i]);
		}
		for (String word : set) {
			int count=0;
			for (int i = 0; i < s.length; i++) {
				if(word.equals(s[i]))
				{
					count++;
				}
			}
			if((count>=2))
			{
				System.out.println(count+" "+word);
			}
		}
		
		
	}

}
