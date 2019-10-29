import java.util.Scanner;

public class Modulo47 {
    public static void main(String [] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Bitte geben Sie eine Zahl ein: ");
    	int n = in.nextInt();
    	
    	int rest = n % 47;
    	
    	System.out.println("Der Rest der Division von der Zahl " + n + " ist " + rest);
    	
    	if (rest == 0) {
    		System.out.println("Pechkeks");
    	}
    }
}
