import java.util.*;

public class randomorgo {
    public static void main(String[] args) {
        Scanner Keyb = new Scanner(System.in);
        Random rnd = new Random();
        int anzahl, auswahl;
        int tmp;

        System.out.print("Wieviele Elemente? ");
        anzahl = Keyb.nextInt();

        int feld[];
        feld = new int[anzahl];
        int anzahlDurchlaufe = anzahl - 1;
        System.out.print("Feld wird mit Zufallszahlen gefuellt... \n");

        for (int i = 0; i < anzahl; i++)
            feld[i] = rnd.nextInt(anzahl);

        do {
            System.out.println("Auswahlmenue: \n");
            System.out.print("1 -> Zahlenfeld ausgeben \n");
            System.out.print("2 -> Zahlenfeld sortieren \n");
            System.out.print("3 -> Programm beenden \n");

            System.out.print("Auswahl: ");
            auswahl = Keyb.nextInt();

            switch (auswahl) {
                case 1: {
                    int i = 0;
                    do {
                        System.out.print(feld[i] + "  ");
                        if ((i + 1) % 20 == 0) {
                            System.out.println();
                        }
                        i++;
                    } while (i < anzahl);
                }
                case 2: {

                    for (int i = 0; i < anzahlDurchlaufe; i++) {
                        for (int j = 0; j < anzahlDurchlaufe - i; j++) {
                            if (feld[j] > feld[j + 1]) {
                                tmp = feld[j];
                                feld[j] = feld[j + 1];
                                feld[j + 1] = tmp;
                            }
                        }
                    }
                }
            }

        } while (auswahl != 3);
    }

}
