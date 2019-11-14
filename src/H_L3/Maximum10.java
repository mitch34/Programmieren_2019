package H_L3;

import java.util.Scanner;

public class Maximum10 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int positiveZahlen;
		int temp = 0;
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.print(i + ":");
			positiveZahlen = in.nextInt();
			if (positiveZahlen > temp) {
				temp = positiveZahlen;
			}
			System.out.println(positiveZahlen);
		}
		System.out.println("Maximum: " + temp);

	}
}
