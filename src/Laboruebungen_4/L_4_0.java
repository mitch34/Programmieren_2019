package Laboruebungen_4;

public class L_4_0 {
    public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i == 42 || i == 84) {
				continue;
			} else {
				System.out.println("Ausagbe :" + i); 
			}
		}
	}
}
