package pro;

public class Number_pall_Test {
	public static void main(String[] args) {
		
			int no=101;
			int temp = no;
			int rev=0;
			int dig=0;
			while(temp!=0)
			{
			dig = temp%10;
			rev = rev*10+dig;
			temp = temp/10;
			}
			if (no==rev)
			{
				System.out.println("P");
			}
			else
			{
				System.out.println("NP");
			}
		}
		
		
	}


