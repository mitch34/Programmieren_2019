import java.util.Scanner;

public class Zweiersumme {
    public static void main(String [] args) {
    	System.out.print("Zahl n eingeben: ");
    	Scanner in = new Scanner(System.in);
    	
    	long n = in.nextLong();
    	long temp = n;
    	long quersumme = 0;
    	
    	while (n > 0) {
    		quersumme = quersumme + n % 100;
    		n = n / 100;
    	}
		System.out.println("Zweierquersumme von " + temp + " = "  + quersumme);

    }
}
