import java.util.*;
public class zeichensuche {
    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);
        String eingabe;
        String suche;
        char Zeichen;
        int anzahl = 0;

        System.out.print("Text eingeben: "); eingabe = Keyb.nextLine();
        System.out.println("Welches zeichen soll gezaelt werden: "); suche = Keyb.nextLine();

        Zeichen = suche.charAt(0);

        for (int i = 0; i < eingabe.length(); i++){
            if (eingabe.charAt(i) == Zeichen)
                anzahl++;
        }

        System.out.println("Das Zeichen " + suche + " ist " + anzahl + " mal enthalten");


    }
    
}
