package esercizio1;

public class ex1 {
    public static Boolean stringaPariDispari (String str) {
        if (str.length() % 2 == 0) {
            return true;
        }
    else {return false;}
    }
public static Boolean annoBisestile (int anno) {
        if (anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {
            return true;
        }
 else { return false;}
}}
