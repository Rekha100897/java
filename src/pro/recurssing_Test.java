package pro;

public class recurssing_Test {
	
	static int count=0;
      static void name(String s)
	{
    	  count++;
    	  if(count <=100)
  		{
    	System.out.println(s);
    	name("Rekha");
  		}
    	
	}
	public static void main(String[] args) {
		
		name("Rekha");
	}

}
