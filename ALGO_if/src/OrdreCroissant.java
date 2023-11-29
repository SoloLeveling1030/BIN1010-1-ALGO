public class OrdreCroissant {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int entier1 = scanner.nextInt();
        int entier2 = scanner.nextInt();
        if (entier1<entier2){
            System.out.println("entiers croissant :"+entier1+" "+entier2);
        }
        else System.out.println("entiers croissant :"+entier2+" "+entier1);
    }
}
