public class RechercheMax2 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("insérez le premier entier");
        int entier1= scanner.nextInt();
        System.out.println("inserez le deuxieme entier");
        int entier2= scanner.nextInt();
        if (entier1 >entier2) {
            System.out.println("le plus grand est "+ entier1);
        }
        else System.out.println("le plus grand est "+entier2);
    }
}
