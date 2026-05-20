import java.util.*;
public class custommethode {
    static int ZeichenZaehlen(String t, String sT){

        char suchZeichen;
        int zaehler = 0;

        suchZeichen = sT.charAt(0);


        for (int i = 0; i < t.length(); i++)
            if (t.charAt(i) == suchZeichen)
                zaehler++;


        return zaehler;
    }




    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);

        String text, suchText;
        int anzahl;

        System.out.print("Text eingeben: "); text = Keyb.nextLine();

        System.out.print("Welches Zeichen soll gezaelt werden: "); suchText = Keyb.nextLine();

        anzahl = ZeichenZaehlen(text, suchText);


        System.out.println("Das Zeichen " + suchText + " ist " + anzahl + " mal enthalten.");
    }//main

    static void SternAusgabe (int SternAnzahl){

        for (int i = 0; i < SternAnzahl; i++)
            System.out.print("*");
    }
    
}//class
