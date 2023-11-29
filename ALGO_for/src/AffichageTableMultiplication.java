import java.util.Scanner;

public class AffichageTableMultiplication {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        int multiplication = 0;
        System.out.println("Affichez la table de multiplication de 0 à 10");
        for (int i = 1; i <=10; i++) {
            System.out.println("  ");
            for (int j = 1; j <=10 ; j++) {
                multiplication = i*j;
                System.out.print("\t"+multiplication);
                
            }
            
        }
        
    }
}
