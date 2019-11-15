package H_L4;

public class Main {
    public static void main(String [] args) {
    	System.out.println(maxe(3,7));
    	System.out.println(tombola(3,2,1));
    }
    public static int maxe(int a, int b) {
    	if (a > 6 || b > 6) {
    		return 0;
    	}
    	if ((a == 1 && b == 2) || a == 2 && b == 1) {
    		return 1000;
    	}
    	if ( a == b) {
    		return a * 100;
    	}
    	if (a < b) {
    		return b * 10 + a;
    	} else {
    		return a * 10 + b;
    	}
    	
    	
    }
    public static int erstmalsLaengerAls(int laenge) {
    	return 0;
    }
    public static int tombola(int a, int b , int c) {
    	if (a == 2 && b == 2 && c == 2) {
    		return 10;
    	}
    	if (a == b && b == c && a == c) {
    		return 5;
    	}
    	if ( b != a && c != a) {
    		return 1;
    	} else {
    		return 0;
    	}
    }
    
}
