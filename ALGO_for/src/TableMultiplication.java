import java.util.Scanner;
public class TableMultiplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la table :");
        int nombre = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            int multiplication = i * nombre;
            System.out.println(i+ " * "+nombre+" = "+multiplication);
        }
    }
}
