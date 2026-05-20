import java.util.*;
public class arraymulti {
    public static void main (String [] args){

        int z, s;
        int sumZeile;
        int sumSpalte;
        Random rnd = new Random();
        int [][] array = new int [3] [4];
        

        for (z = 0; z < 3; z++){
            sumZeile = 0;
            for (s = 0; s < 4; s++){
                array [z] [s] = rnd.nextInt(10);
                
            }
            System.out.println();
        }
        for (z = 0; z < 3; z++){
            sumZeile = 0;
            for (s = 0; s < 4; s++){
                System.out.print(array [z] [s] + "  ");
                sumZeile += array [z] [s];
            }
            System.out.println("Summe: " + sumZeile);
        }

        

        

    }
    
}
