package Laboruebungen_3;

import  java.util.Scanner;

public class L_3_5 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Bitte Zahl eingeben: ");
		
		long zahl = in.nextLong();
		long quersumme = 0;
		int zaehler = 0;
		
		while (zahl > 0) {
			quersumme = 0;
			quersumme = quersumme + zahl % 10;
			zahl = zahl / 10;
			
			if (quersumme == 7) {
				zaehler = zaehler + 1;
			}
		}
		System.out.println("Anzahl von 7er:" + zaehler);
	}
}
