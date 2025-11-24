import java.util.*;

public class Hausaufgabe4{

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int Himlrich;

        do {
            System.out.println("Wähle eine Himmelsrichtung:");
            System.out.println("Osten --> 1 wählen");
            System.out.println("Süden --> 2 wählen");
            System.out.println("Westen --> 3 wählen");
            System.out.println("Norden --> 4 wählen");
            System.out.print("Deine Wahl (beenden mit 0): ");
            Himlrich = keyb.nextInt();
            switch (Himlrich) {
                case 0:
                    System.out.print("--- Programm Ende ----");
                    break;
                case 1:
                    System.out.println("\n Im Osten geht die Sonne auf \n");
                    break;
                case 2:
                    System.out.println("\n Süden nimmt sie ihren Lauf \n");
                    break;
                case 3:
                    System.out.println("\n Westen will sie untergeh'n \n");
                    break;
                case 4:
                    System.out.println("\n Norden ist sie nie zu seh'n \n");
                    break;
                default:
                    System.out.println("\n Bitte 1...4 wählen! \n");

            }
        } while (Himlrich != 0);
    }
}
