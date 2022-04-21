//print all the elements of an array in an ascending order

package group4;

public class g4_sort_asc {
	public static void main(String[] args) {
		int[] arr = {10, 63, 1, 5, 45};
		
		for(int i=0; i<arr.length;i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]>arr[j]){	     // condition to check whether the number is greater
					int temp = arr[i];   //use reference variable to store the greatest number
					arr[i] = arr[j]; 	// swapping
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
