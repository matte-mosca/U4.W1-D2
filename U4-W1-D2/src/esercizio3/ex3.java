package esercizio3;

import java.util.Scanner;

public class ex3 {
    public static void esercizioWhile(Scanner scannerUsato){

        boolean exit = false;

        while(!exit){
            System.out.println("Digita una stringa. Per uscire dal loop digita :q");

            String input = scannerUsato.nextLine();


            if(input.equals(":q")){

                exit = true;
            } else {
                for(int i = 0; i < input.length(); i++) {
                    System.out.println(input.charAt(i) + "," );
                }
            }
        }
    }


}