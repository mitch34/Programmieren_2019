package H_L3;

import java.util.Scanner;

public class Quadratwurzel {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quadratwurzeleingabe: ");
		double a = in.nextDouble();
		double x = 1.0d;
		
		for (int i = 0; i <= 100; i++ ) {
			x = 0.5 * (x + (a / x));
			System.out.println(i + "  " + x);
			
		}
		System.out.println("Der Wert der Berechnung " + x);
	}
}
