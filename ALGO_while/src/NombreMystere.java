import java.util.Scanner;

public class NombreMystere {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int entier = unEntierHassard(0,100);
        System.out.println(entier);
        int reponse = 0;
        int nombreEssais = 0;
        System.out.println("Entrez un nombre entre 0 et 100");
        do {
            reponse = scanner.nextInt();
            if (reponse > entier){
                System.out.println("c'est plus petit. réessayez à nouveau");
            } else if (reponse < entier) {
                System.out.println("c'est plus grand. réessayez à nouveau");
            }
            nombreEssais++;
        } while(reponse != entier);
        System.out.println("Bravo ! vous l'avez trouver en "+nombreEssais+" essais.");
    }
    public static int unEntierHassard(int valeurMaximum ,int valeurMinimale){
        return (int) (Math.random()* (valeurMaximum - valeurMinimale +1)) + valeurMinimale;
    }
}
