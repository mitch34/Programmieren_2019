import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args) {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Bitte Zahl n eingeben:");
    	int n = in.nextInt();
    	
    	if (n % 3 == 0 && n % 5 == 0) {
    		System.out.println("FizzBuzz");
    	} else if (n % 3 == 0) {
    		System.out.println("Fizz");
    	} else if (n % 5 == 0) {
    		System.out.println("Buzz");
    	} else {
    		System.out.println("Zahl n:" + n);
    	}
    }
}
