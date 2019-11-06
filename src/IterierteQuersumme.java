import java.util.Scanner;

public class IterierteQuersumme {
    public static void main(String [] args) {
    	System.out.print("Zahl n eingeben: ");
    	Scanner in = new Scanner(System.in);
    	
    	long n = in.nextLong();
    	long temp = n;
    	long quersumme = 0;
    	
    	while ( n > 9) {
    		quersumme = 0;
    		do {
    			quersumme = quersumme + n % 10;
    			n = n / 10;
    		} while (n > 0);
    		n = quersumme;
    	}
    	System.out.println("iterierte Quersumme von " + temp + " ist " + quersumme);
    }
}
