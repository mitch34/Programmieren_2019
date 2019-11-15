package H_L3;

public class Logarithmus {
    public static void main( String[] args) {
        double echterLog = Math.log(2);
		
		System.out.println("Java Math.log(2): " + echterLog);
		double test = 0.0d;
		double berechneLog = 0.0d;
		int temp = 0;
		int i = 1;

		while ( true ) {
			if (i % 2 == 0) {
			berechneLog = berechneLog - 1.0 / i;
			} else {
				berechneLog = berechneLog + 1.0 / i;
			}
			test = berechneLog - echterLog;
			if ( test < 0.0023 && test > -0.0023 ) {
				temp = i;
				break;
			}
			i++;
		}
		
		System.out.println("Berechneter Log:  " + berechneLog);
		System.out.println("gefunden beim Summanden: " + temp);
		System.out.println("Abweichung vom echten Wert von Math.log(2) um weniger als 0.0023: " + test + " nach oben !");
	}
}
