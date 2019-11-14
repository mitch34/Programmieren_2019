package H_L3;

public class Euler {
    public static void main(String[] args) {
		double ergebnis = 1.0d;
		double zaehler = 1.0d;
		double nenner = 1.0d;
		
		for (int i = 0; i <= 101; i++) {
			if (i > 0) {
				ergebnis = ergebnis + (zaehler / (nenner * i));
			} else {
				
			}
			
		}
		System.out.println(ergebnis);
	}
}
