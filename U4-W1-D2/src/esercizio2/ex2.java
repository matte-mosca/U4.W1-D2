package esercizio2;
import java.util.Scanner;

public class ex2 {
    public static String esercizioSwitch(Scanner scannerUsato){

        System.out.println("Digita il numero da controllare (valore numerico)");

        int num = scannerUsato.nextInt();
        scannerUsato.nextLine();
        switch (num) {
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return"due";
            case 3:
                return "tre";

            default:
                return "Errore: il numero deve essere compreso tra 0 e 3";
        }
}}
