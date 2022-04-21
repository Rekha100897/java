// without using length variable
package pro;

public class Wo_length_Test {
	public static void main(String[] args) {
		String s = "STORM";
		int count=0;
	    char[] ch = s.toCharArray();
	    
	    for (char c:ch){
	    	count++;
	    }
	    
	    System.out.println(count);
	    for (int i =count-1; i>=0;i--){
	    	System.out.print(ch[i]);
	    }
	}

}
