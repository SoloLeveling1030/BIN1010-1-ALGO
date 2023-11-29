import java.util.Scanner;

public class SommesNegatifsEtPositifs {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sommePositifs = 0;
        int sommeNegatifs = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Entrez l'entier n "+i+" : ");
            int entiers = scanner.nextInt();
            if (entiers >=0){
                sommePositifs += entiers;
            }
            else sommeNegatifs += entiers;
        }
        System.out.println("La somme des entiers positifs  est "+sommePositifs);
        System.out.println("La somme des entiers negatifs est "+sommeNegatifs);

    }
}
