import java.util.Scanner;

public class NombreMystereInverse {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrez un nombre à faire deviner l'ordinateur :");
        int reponse = scanner.nextInt();
        int reponseOrdi = unEntierHassard(0,100);
        int nombreEssais = 0;

        while (reponse != reponseOrdi ){
            System.out.println(reponse);
            reponse = scanner.next().charAt(0);
            if (reponse =='G'){
                System.out.println("Plus petit ");
                reponse = unEntierHassard(0,100);
            } else if (reponse =='P') {
                System.out.println("Plus grand ");
                reponse = unEntierHassard(0,100);
            }
            nombreEssais++;
        }
        System.out.println("Bravo ordinateur ! en "+nombreEssais+"essais");

    }
    public static int unEntierHassard(int valeurMaximum,int valeurMinimum){
        return (int) (Math.random() * (valeurMaximum - valeurMinimum +1) + valeurMinimum);
    }
}
