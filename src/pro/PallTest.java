//pallandrome
package pro;

public class PallTest {
	public static void main(String[] args) {
		String s = "STORM";
		String rev = "";
		for (int i=s.length()-1; i>=0;i--){
			char r = s.charAt(i);
			rev=rev+r;
		}
		
		if(rev.equals(s)){
		System.out.println("It is Pallindrome");
		}
		else {
			System.out.println("It is not a pallindrome");
		}
	}

}
