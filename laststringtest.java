import java.util.*;
public class laststringtest {
    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);
        String T1; T1 = new String();

        System.out.print("Bitte deinen text eingeben UwU: "); T1 = Keyb.nextLine();

        int a = T1.length();
        char b = T1.charAt(a-1);

        System.out.println("Dein Letztes Zeichen: " + b);
    }
    
}
