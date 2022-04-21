//first 5 numbers in fibonacci series
package pro;

public class Fibonacci_Test {
public static void main(String[] args) {
	int fib1=0;
	int fib2=1;
	int fib3=0;
	System.out.print(fib1+" "+fib2+" ");
	/*for(int i=0;i<=5;i++) {
	fib3=fib1+fib2;
	fib2=fib3;
	fib1=fib2;
	System.out.print(fib3+" ");
	}
	*/
	
	for(int i=0; i<25;i++) //or for(int i=0; i<=fib2;i++)
	{
		fib3=fib1+fib2;
		if (fib3<25)
		{
			fib2=fib3;
			fib1=fib2;
			System.out.print(fib3+" ");
			
		}
		
	}
}
}
