import java.util.*;
public class stringindex {
    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);
        String T1; T1 = new String();

        System.out.println("Gib mal Text ein bidde: "); T1 = Keyb.nextLine();

        String S1, S2; S1 = new String(); S2 = new String();
        System.out.println("Erste Suche: "); S1 = Keyb.nextLine();
        System.out.println("Zweite Suche: "); S2 = Keyb.nextLine();

        int a = T1.indexOf(S1);
        int b = T1.lastIndexOf(S2);
        System.out.println(a);
        System.out.println(b);
    }
    
}
