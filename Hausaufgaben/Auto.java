package Hausaufgaben;
import java.util.*;

class Auto {
    String Hersteller;
    String Typ;
    double preis;
    int ps;

    Auto(){
        Hersteller = "BMW";
        Typ = "A5";
        preis = 192000.54;
        ps = 200;
    }

    Auto (String H, String T, double pr, int psz){
        Hersteller = H;
        Typ = T;
        preis = pr;
        ps = psz;
    }

    
}
