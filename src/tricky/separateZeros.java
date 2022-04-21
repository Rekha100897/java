//separate all the zeros and numbers in the given array
//i/p --> {3,0,1,0,0,2,0};
//o/p --> 3 1 2 0 0 0 0

package tricky;

public class separateZeros {
	public static void main(String[] args) {
		int[] arr = {1,2,0,5,3,0,6,8,0,1,5,0,0};
		int[] b = new int [arr.length]; // create the b array which is having the same length of arr array
		int m=0;					//start storing the numbers in b array from 0th index
		int n=b.length-1;			//start storing the zeros in b array from last index
		
		
		for(int i=0; i<arr.length; i++){
			if (arr[i]==0){	
				b[n]=arr[i];
				n--;
			}
			else{
				b[m] = arr[i];
				m++;
			}
		}
		
		for(int i=0; i<b.length; i++){  
			System.out.print(b[i]+" ");
		}
	}
	

}
