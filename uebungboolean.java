import java.util.*;
public class uebungboolean {
    public static void main(String[] args){
        Scanner Keyb = new Scanner(System.in);
        int tag, monat, jahr;
        boolean istKorrekt = true;
        boolean istSchaltjahr;

        System.out.print("Tag eingeben: "); tag = Keyb.nextInt();

        System.out.print("Monat eingeben: "); monat = Keyb.nextInt();

        System.out.print("Jahr (0 bis 2099) eingeben: "); jahr = Keyb.nextInt();

        if (tag<=0 || tag>31)
            istKorrekt = false;

        if (monat<0 || monat>12)
            istKorrekt = false;

        if (jahr<0 || jahr>2099)
            istKorrekt = false;


        if (monat == 4 || monat == 6 || monat == 9 || monat == 11){
            if (tag > 30)
                istKorrekt = false;
        }
        if (jahr % 400 == 0 || jahr % 100 != 0 && jahr % 4 == 0 ){}



        if (istKorrekt == true){
        System.out.print(tag + "." + monat + "." + jahr + " ist ein korrektes Datum");
        }
        else{
            System.out.print(tag + "." + monat + "." + jahr + " ist KEIN korrektes Datum");
        }


    }
    
}
