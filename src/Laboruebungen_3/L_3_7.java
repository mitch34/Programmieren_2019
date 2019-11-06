package Laboruebungen_3;

import java.util.Scanner;

public class L_3_7 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int temp = n;
		int schritte = 1;
		System.out.println("Zahl: " + n);

		while (n > 1) {
			
			if (n % 2 == 0) {
				n = n /2;
			} else {
				n = 3 * n + 1;
			}
			schritte = schritte + 1;
			
			System.out.println("Zahl: " + n);
		}
		
		System.out.println("Zahl " + temp + " sind es " + schritte + " Schritte! ");
	}
}
