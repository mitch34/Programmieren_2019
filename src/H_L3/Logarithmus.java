package H_L3;

public class Logarithmus {
    public static void main(String[] args) {
		double echterLog = Math.log(2);
		
		System.out.println(echterLog);
		
		double berechneLog = 1.0d;
		int temp = 1;
		for (int i = 2; i <= 217; i++) {
			if (i % 2 == 0) {
			berechneLog = berechneLog - 1.0 / i;
			} else {
				berechneLog = berechneLog + 1.0 / i;
			}
			if ( (echterLog - berechneLog) == 0.0023d ) {
				temp = i;
				break;
			}
			
		}
		System.out.println(berechneLog);
		System.out.println(temp);
	}
}
