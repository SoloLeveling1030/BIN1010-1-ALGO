import java.util.Scanner;
public class NombreNegatifsparmi10 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nombreEntierNegatifs =0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Entrez l'entier n "+i+" : ");
            int entier = scanner.nextInt();
            if (entier < 0){
                nombreEntierNegatifs++;
            }
        }
        System.out.println("Le nombre d'entiers negatifes est "+nombreEntierNegatifs);
    }
}
