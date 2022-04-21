//get the sum of each didgit in the given number
package pro;

public class sum_digits_Test {
	public static void main(String[] args) {
		int sum=0;
		int no=325;
		while(no!=0)
		{
			int r = no%10;
			sum=sum+r;
			no=no/10;
		}
		System.out.println(sum);
	}

}
