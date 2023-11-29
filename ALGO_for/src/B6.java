import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class B6 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrez vos 10entiers ");
        int nombrePositifs = 0;
        int nombreNegatifs = 0;
        for (int i = 1; i <= 10; i++) {
            int entier = scanner.nextInt();
            if (entier > 0) {
                nombrePositifs++;
            }
            else if (entier < 0)
                nombreNegatifs++;
        }
        System.out.println("le nombres d'entiers positifs est de "+nombrePositifs+" et le nombres d'entiers negatifs est de  "+nombreNegatifs);
    }

}
