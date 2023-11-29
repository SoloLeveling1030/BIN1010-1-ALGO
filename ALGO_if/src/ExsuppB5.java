public class ExsuppB5 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("entier1 :");
        int entier1 = scanner.nextInt();
        System.out.println("entier2 :");
        int entier2 = scanner.nextInt();
        System.out.println("entier3 :");
        int entier3 = scanner.nextInt();
        if (entier1 > entier2 ) {
            System.out.println(entier1 + " et " + entier2 + " ne sont pas croissant veilleuez essayer de nouveau");
            if (entier2 > entier3) {
                System.out.println(entier2 + " et " + entier3 + "ne sont pas croissant veilleuez essayer de nouveau");
            }
        }
        else System.out.println(entier1+" "+entier2+" "+entier3+" sont croissants");
    }
}
