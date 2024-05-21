import  esercizio1.ex1;
import esercizio2.ex2;
import esercizio3.ex3;
import esercizio4.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(ex1.stringaPariDispari("MAtteo"));
        System.out.println(ex1.stringaPariDispari("Matte"));

        System.out.println(ex1.annoBisestile(2024));
        System.out.println(ex1.annoBisestile(2025));
        System.out.println(ex1.annoBisestile(480));

        Scanner myScanner = new Scanner(System.in);

        System.out.println(ex2.esercizioSwitch(myScanner));
        ex3.esercizioWhile(myScanner);
        ex4.esercizioFor(myScanner);


    }
}