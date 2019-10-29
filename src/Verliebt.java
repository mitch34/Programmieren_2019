import java.util.Scanner;

public class Verliebt {
    public static void main(String [] args) {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Zahl a:");
    	int a = in.nextInt();
    	System.out.println("Zahl b:");
    	int b = in.nextInt();
    	System.out.println("Zahl c:");
    	int c = in.nextInt();
    	int summe_a_b = a + b;
    	int summe_b_c = b + c;
    	int summe_a_c = a + c;
    	
    	if (a == summe_b_c || b == summe_a_c || c == summe_a_b) {
    		System.out.println("Verliebt");
    	} else {
    		System.out.println("Igitt");
    	}
    }
}
