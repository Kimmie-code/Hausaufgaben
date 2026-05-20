import java.util.*;

public class uebungstrings{
    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);
        String x1; x1 = new String();
        char text[];
        
        System.out.println("Text bitte Hier eingeben: "); x1 = Keyb.nextLine();

        System.out.println("Deine eingabe: " + x1);

        text = x1.toCharArray();
        int b = x1.length();
        System.out.println("Deine eingabe, aber rueckwaerts: ");

        for (int i = b - 1 ; i >= 0; i-- ){
            System.out.print(text[i]);
        }

    }
}