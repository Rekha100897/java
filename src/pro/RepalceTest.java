package pro;

public class RepalceTest {
	public static void main(String[] args) {
		
		String r="ranjan";
		char[] rr = r.toCharArray();
		char j = 0;
		String ss = "";
		for (int i = 0; i < rr.length; i++) {
			
			if(rr[i]=='j'){
				ss="i";
				System.out.print(ss);
			}else {
				ss=ss+rr[i];
				System.out.print(ss);
			}
			
		}
	
	}

}
