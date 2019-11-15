package H_L3;

import java.util.Scanner;

public class Maximum10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
		
		int positiveZahlen;
		int temp = 0;
		int i = 1;
		while (i <= 10) {
			System.out.print(i + ":");
			positiveZahlen = in.nextInt();
			if (positiveZahlen <= 0) {
				continue;
			}
			if (positiveZahlen > temp) {
				temp = positiveZahlen;
				i++;
			}
			System.out.println(positiveZahlen);
		}
		System.out.println("Maximum: " + temp);

		
		
		
	}
}
