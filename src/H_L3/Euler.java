package H_L3;

public class Euler {
    public static void main(String[] args) {
		
    	double ergebnis = 1.0d;
		double nenner = 1.0d;
		
		for (int i = 1; i <= 101; i++) {
				ergebnis = ergebnis + (1.0 / (nenner * i));
				nenner = nenner * i;
				//System.out.println(i);
		}
		System.out.println("Berechnete Eulerzahl e: " + ergebnis);
	}
}
