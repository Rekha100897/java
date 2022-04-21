// int a[] = {1, 2, 3, 9, 8}
// int b[] = {4, 5, 6}
// res [] = {5, 7, 9}
// o/p--> 5, 7, 9



package tricky;

public class addElements_sameLength {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6, 7, 5};
	
	
		int count=a.length;
		if(b.length>a.length){
			count=b.length;
		}
		
		
		for(int i=0; i<count; i++){
			try{
			System.out.println(a[i] + b[i]); // try block will get executed for each and every itterations
			}
			catch(Exception e){				// catch block will get executed onlu when there is exception
				
				if(b.length>a.length){
					System.out.println(b[i]);	
				}
				else{
				System.out.println(a[i]);
				}
				
			}
			
		}
		
	}

}
