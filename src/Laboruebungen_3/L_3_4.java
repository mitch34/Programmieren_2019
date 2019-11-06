package Laboruebungen_3;

import java.util.Scanner;

public class L_3_4 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Bitte Zahl eingeben: ");
		
		long zahl = in.nextLong();
		long quersumme = 0;
		boolean gefunden = false;
		
		while (zahl > 0) {
			quersumme = 0;
			quersumme = quersumme + zahl % 10;
			zahl = zahl / 10;
			
			if (quersumme == 7) {
				gefunden = true;
			}
			
		}
		System.out.println("gefunden :" + gefunden);
	}
}
