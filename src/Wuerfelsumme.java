
public class Wuerfelsumme {
    public static void main(String [] args) {
    	for (int a = 1; a <= 6; a++) {
    		for (int b = 1; b <= 6; b++) {
    			for (int c = 1; c <= 6; c++) {
    				int summe = a + b + c;
    				if (a <= b && b <= c && summe >= 7) {
    					System.out.println("(" + a + "," + b + "," + c + ")");
    				}
    			}
    		}
    	}
    }
}
