import java.util.*;
public class DatumFormatierung{
    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);
        String DD; DD = new String();
        String TT; TT = new String();
        String MM; MM = new String();
        String JJ; JJ = new String();
        System.out.print("Gib ein Datum im der Form TT.MM.JJ ein: "); DD = Keyb.nextLine();

         TT = DD.substring(0, 2);
         MM = DD.substring(3, 5);
         JJ = DD.substring(6, 8);

         System.out.println("Umwandlungsergebniss:  20" +JJ + "-" + MM + "-" + TT );

    }
}