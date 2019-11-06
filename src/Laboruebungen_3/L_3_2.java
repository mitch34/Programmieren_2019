package Laboruebungen_3;

import java.util.Scanner;

public class L_3_2 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Fib_Zahl: ");
		int n = in.nextInt();

		int g0 = 1;
		int g1 = 1;
		int zwischen = 0;
		
		for (int i = 2; i <= n; i++) {
			zwischen = g0 + g1;
			if (g0 == 1 && g1 == 1) {
				System.out.print(g0 + " ");
				System.out.print(g1 + " ");
			}
			g0 = g1;
			g1 = zwischen;
			System.out.print(g1 + " ");
		}
	}
}
