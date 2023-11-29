import java.util.Scanner;

public class B7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int resultatMax = 0;
        int exaequo = 0;
        boolean isExaequo = false;
        for (int i = 1; i <10 ; i++) {
            System.out.println("Entrez le résultat du participant n°" + i + " : ");
            int resultat = scanner.nextInt();

            if (resultat > resultatMax) {
                resultatMax = resultat;
                exaequo = i;
                isExaequo = false;
            } else if (resultat == resultatMax) {
                isExaequo = true;
            }
            if (isExaequo) {
                System.out.println("Il y'a ex-aequo entre l'entier n° " + exaequo + " et n° " + i);
            }
        }
                System.out.println("Le participant n ° " + exaequo + " est le vainqueur avec un score de " + resultatMax);


    }
}
