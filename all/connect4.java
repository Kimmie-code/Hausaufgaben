import java.util.*;

public class connect4 {
    public static void main(String[] args) {
        Scanner Keyb = new Scanner(System.in);
        char board[][] = new char[6][7];

        for (int z = 0; z < 6; z++) {
            for (int s = 0; s < 7; s++) {
                board[z][s] = '.';
            }
        }
        do {
            System.out.println();
            System.out.println("********** Spiel 4-Gewint **********");
            System.out.println("Spielfeld:");
            System.out.println();
            System.out.println("    1   2   3   4   5   6   7  ");
            System.out.println("  -----------------------------");

            for (int z = 0; z < 6; z++) {
                System.out.print((z + 1) + " | ");
                for (int s = 0; s < 7; s++) {
                    System.out.print(board[z][s] + " | ");
                }
                System.out.println();
                System.out.println("  -----------------------------");
            }

            int userSpalte, spaltenIndex;
            System.out.println("Spalte eingeben: ");
            userSpalte = Keyb.nextInt();

            
            while ((userSpalte < 1) || (userSpalte > 7)) {
                System.out.println("Bist du eigentlich dumm? \n Nimm eine andere Spalte");
                userSpalte = Keyb.nextInt();
            }

            spaltenIndex = userSpalte - 1;

            for (int z = 5; z >= 0; z--) {
                if (board[z][spaltenIndex] == '.') {
                    board[z][spaltenIndex] = 'X';
                    break;
                }
            }
        } while (true);

    }
}
