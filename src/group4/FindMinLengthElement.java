//how do find min length of string from string array

package group4;

public class FindMinLengthElement {
	public static void main(String[] args) {
		String[] arr = {"Hello", "good", "morning", "India", "mnhgtrd","all"};
		 String maxlength = arr[0];
	
		 for(int i=0; i<arr.length; i++){
			
			 if(maxlength.length()>arr[i].length())
			 {
				 maxlength = arr[i];
			 }
		 }
		
		 
	 for(int i=0; i<arr.length; i++){
			 if(maxlength.length()==arr[i].length()){
				 System.out.println(arr[i]);
			 }

			 
		 }
	}

}
