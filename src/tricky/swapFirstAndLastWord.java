//swap first and last word in the given statement
//i/p -->String s = "Welcome to Incredible India"
//o/p -->String s = "India to Incredible Welcome"

package tricky;

public class swapFirstAndLastWord {
	public static void main(String[] args) {
		String s1 = "Welcome to Incredible India";
		String[] arr = s1.split(" ");
		
	   String temp = arr[0];
	   arr[0]=arr[(arr.length)-1];
	   arr[(arr.length)-1]=temp;
	   
	   for(int i=0; i<(arr.length); i++){
		   System.out.print(arr[i]+" "); 
	   }
	}

}
