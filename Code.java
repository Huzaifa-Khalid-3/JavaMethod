package JavaMethods;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Enter num 1: ");
		num1 = k.nextInt();
		System.out.println("Enter num 2: ");
		num2 = k.nextInt();
		System.out.println("sum is: "+addNumbers(num1,num2));
		
		System.out.println("product is: "+subtractNumbers(num1,num2));

	}
	
	static int addNumbers(int x, int y) {
		return x+y;
	}
	
	static int subtractNumbers(int x, int y) {
		return x-y;
	}
	

}
