import java.util.*;
public class spiel21 {
    public static void main(String [] args){
        Scanner Keyb = new Scanner(System.in);
        int zahl_strich, nimm;

        System.out.print( "Wieviele Striche sollen am Bildschirm ausgegeben werden: "); zahl_strich = Keyb.nextInt();

        

        while (zahl_strich > 0){
            System.out.println( "\nStreichhoelzer auf dem Tisch: ");
            int i = 1;
            while (i <= zahl_strich){
            System.out.print("|");
                if(i%10==0){
                System.out.print(" ");
                i = i + 1;
            }
            System.out.println( " (" + zahl_strich + ")" );
             }
             System.out.print( "Wie viele Streichhoelzer nimmst du ? "); nimm = Keyb.nextInt();
             zahl_strich = zahl_strich - nimm;
            }
            }   
        }
    

