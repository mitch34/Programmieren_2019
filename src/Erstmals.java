
public class Erstmals {
    public static void main(String [] args) {
    	int sucheZahl = 4444;
    	int gefundeneZahl = 0;
    	
    	boolean gefunden = false;
    	int i = 1;
    	while (!gefunden) {
    	    int n = i;
    	    while (n > 1) {
    	    	if (n == sucheZahl) {
    	    		gefundeneZahl = n;
    	    	}
    	        if (n % 2 == 0) {
    	            n = n / 2;
    	        }  else {
    	            n = 3 * n + 1;
    	        }
    	        
    	    }
    	    if (gefundeneZahl == 4444) {
    	        gefunden = true;
    	    } else {
    	        i = i + 1;
    	    }

    	}
    	System.out.println("Erstes Vorkommen " + gefundeneZahl + " bei dem Startwert " + i );
    }
}
