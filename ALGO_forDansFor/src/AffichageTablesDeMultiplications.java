public class AffichageTablesDeMultiplications {
    public static void main(String[] args) {
        System.out.println("Table de multiplication de 1 à 10 :");
        int multiplication = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");
            for (int j = 1; j <=10 ; j++) {
                multiplication = i * j;
                System.out.print(" ");
                System.out.print(+multiplication);
            }
        }
    }
}
