//WAP to print the sum of digit in the given string 

package group3;

public class g3_addStringNumbers {
	public static void main(String[] args) {
		int sum=0;
		String s="ad%*12@5";;
		for(int i=0; i<s.length();i++){
			
			if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
				int r = s.charAt(i)-48;
				sum=sum+r;
			}
		}
		System.out.println("the sum of the digits   "+sum);
	}
}
