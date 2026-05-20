import java.util.*;
public class felder2 {
    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);

        int x[] = new int[10], i = 0;

        while ( i < 10){
            System.out.print((i+1) + ".Zahl: "); x[i] = Keyb.nextInt();
        }
    }
    
}
