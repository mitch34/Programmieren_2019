package Laboruebungen_4;

public class L_4_3 {
    public static void main(String[] args) {
    	double summe = 2.0;

		for (int i = 1; i <= 4; i++) {
			if (i % 2 != 0) {
				summe = summe * (i / i + 1);
				System.out.println("Summe_1: " + summe);
			} else {
				summe = summe * (i + 1 / i);
				System.out.println("Summe_2: " + summe);
			}
		}
	}
}
