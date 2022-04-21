package pro;

public class Prime_Test {
	public static void main(String[] args) {
//		int no = 2;
//		boolean flag = true;
//												
//		for(int i=2; i<no; i++){
//			
//
//				if (no%i==0)
//				{
//					flag=false;
//					break;
//				}
//		}
//				if(flag==true)
//				{
//					System.out.println("prime");
//				}
//				else
//				{
//					System.out.println("not prime");
//				}
		
		int n=8;
		int i=2;
		int count=0;
		while(i<=n)
		{
			if (n%i==0){
				
				break;
			}
			else{
				i++;
			}
		}
		if(n==i){
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
