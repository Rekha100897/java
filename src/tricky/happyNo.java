//n=658-->19(6+5+8)-->1(1+9)
//


package tricky;

public class happyNo {
	
	
	public static int sum(int no)
	{ int sum=0;
		while(no!=0){
			int rem = no%10;
			sum = rem + sum;
			no=no/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int res = sum(183);
		while(res>9){
		    res = sum(res);   
		}
		System.out.println(res);
		}
	}


