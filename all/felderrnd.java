import java.util.*;
public class felderrnd {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int x[];
        x = new int[100];
        
        int i = 0, anzahl = 100;
        int sum = 0;

        System.out.print("Feld wird mit Zufallszahlen gefuellt...");
        System.out.println("\nInhalt des Feldes: ");

        while (i < anzahl){
            i++;
            System.out.print(+ rnd.nextInt(anzahl) + " ");
            if (i % 20 == 0){
                System.out.print("\n");
            }
            
            
        }
            for(i = 0; i<anzahl;i++){
            sum = sum + x[i];
            }
            System.out.print("Summer ueber das Feld: " + sum);


    }
}
