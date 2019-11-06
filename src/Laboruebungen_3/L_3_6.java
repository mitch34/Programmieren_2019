package Laboruebungen_3;

import java.util.Scanner;

public class L_3_6 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int eingabe = 1;
		int ergebnis = 0;
		
		do {
			System.out.println("Neue Zahl eingeben!");
			eingabe = in.nextInt();
			ergebnis = ergebnis + eingabe;
		} while (eingabe != 0);
	}
}
