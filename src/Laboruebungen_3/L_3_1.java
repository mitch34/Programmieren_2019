package Laboruebungen_3;

public class L_3_1 {
    public static void main(String [] args) {
    	int summe  = 0;
    	for (int i = 0; i < 1000; i = i + 3) {
    		System.out.println(i);
    		summe += i;
    	}
    	System.out.println("Summe =" + summe);
    }
}
