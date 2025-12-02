import java.util.*;

public class Hausaufgabe3 {
    public static void main(String[] args) {
        Scanner Keyb = new Scanner(System.in);
        float TU, HTU;
        HTU = 0;

        do {
            System.out.println("Tagesumsatz eingeben: ");
            TU = Keyb.nextFloat();
            if (TU > HTU) {
                HTU = TU;
            }
        } while (TU >= 0);

        System.out.print("Hoechster Tagesumsatz: " + HTU + " Euro");

    }
}
