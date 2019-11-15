package H_L4;

public class Bruch {
    public static void main(String[] args) {
    	
		kuerzen(6, 15);
		addieren(1, 2, 1, 4);
	}
    public static int ggT(int a, int b) {
    	while (a != b) {
    		if (a > b) {
    			a = a - b;
    		} else {
    			b = b - a;
    		}
    	}
    	return a;
    }
    
    public static int kgV(int a, int b) {
    	int kgV = (a * b) / ggT(a, b);
    	return kgV;
    }
    
    public static void kuerzen(int zaehler, int nenner) {
    	int temp = ggT(zaehler, nenner);
    	int ergebnisZaehler = zaehler / temp;
    	int ergebnisNenner = nenner / temp;
    	System.out.println("Test" + ergebnisZaehler + "," + ergebnisNenner);
    }
    public static void addieren(int zaehler1, int nenner1, int zaehler2, int nenner2) {
    	int tempNenner = kgV(nenner1, nenner2);
    	//int tempErgebnis = 
    	System.out.println(tempNenner);
    }
}
