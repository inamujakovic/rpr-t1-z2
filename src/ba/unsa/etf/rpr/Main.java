package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj) {
        int suma = 0, a;
        while(broj > 0){
            a = broj % 10;
            suma = suma + a;
            broj = broj / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
	    int n;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Unesite vrijednost za n: ");
	    n = in.nextInt();
	    for(int i = 1; i <= n; i++){
	        if(i%sumaCifara(i) == 0){
	            System.out.println(i);
            }
        }
    }
}
