import java.util.*;
public class felder {
    public static void main(String[] args) {
        Scanner Keyb = new Scanner(System.in);
        int x[], i = 0;
        x = new int[10];

        while (i < 10){
            System.out.print((i+1) + ".Note: "); x[i] = Keyb.nextInt();

            i++;
        }

        int sum = x[0] + x[1] + x[2] + x[3] + x[4] + x[5] + x[6] + x[7] + x[8] + x[9] ;

        double durchschnitt = sum / 10.0;


        System.out.println("\nSumme: " + sum);
        System.out.println("\nDurchschnitt: " + durchschnitt);

        System.out.println("\nZur Kontrolle nochmal die eingegebenen Noten: ");
        i = 0;
        while (i < 10){
            System.out.println((i+1) + ".Note: " + x[i]);

            i++;
        }
    }
    
}
