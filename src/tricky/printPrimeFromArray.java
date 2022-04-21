//i/p--> int[] arr={2, 3, 5, 8, 4}
//o/p--> 2 3 5 (print all the prime numbers)

package tricky;

public class printPrimeFromArray {
	public static void main(String[] args) {
		int arr[] = {2, 3, 8, 7, 13, 6, 4, 17, 9, 5};
		
		
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = true;
			for(int j=2; j<arr[i]; j++){
				if(arr[i]%j==0){
				flag = false;
				break;
				}
			}
			if (flag==true)
				System.out.println(arr[i]);
		}
	}

}
