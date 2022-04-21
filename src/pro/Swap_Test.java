//swap two integer variables with using third variable
package pro;

public class Swap_Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;
		temp=b;
		b=a;
		a=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
