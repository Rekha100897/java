package group4;

public class g4_sumOfFirst3Min {
	public static void main(String[] args) {
		int[] arr = {10, 63, 2, 5, 45, 4, 92, 1};
		
		for(int i=0; i<arr.length;i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]>arr[j]){	     // condition to check whether the number is greater
					int temp = arr[i];   //use reference variable to store the greatest number
					arr[i] = arr[j]; 	// swapping
					arr[j] = temp;
				}
			}
		}
		
	int sum=0;
	for(int i=0; i<3;i++){
		sum=sum+arr[i];
	
	}

	System.out.println(sum);
		
	}

}
