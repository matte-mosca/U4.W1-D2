package esercizio4;

import java.util.Scanner;

public class ex4 {
    public static void esercizioFor(Scanner scannerUsato){
        int param;
        System.out.println("Inserisci un numero da cui far partire il conto alla rovescia");
        param = scannerUsato.nextInt();
        for (int i = param; i >= 0; i--){
            System.out.println(i);
        }
    }
}
