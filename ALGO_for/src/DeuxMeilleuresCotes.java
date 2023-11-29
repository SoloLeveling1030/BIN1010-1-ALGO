import java.util.Scanner;

public class DeuxMeilleuresCotes {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int coteMax = 0;
        int temp = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Entrez la cote n "+i+" : ");
            int cote = scanner.nextInt();

            if (cote > coteMax ) {
                temp =coteMax;
                coteMax = cote;
            }

            else if(cote  > temp) {
                temp = cote;
            }
        }
        System.out.println("Les 2 plus grands cotes sont  "+coteMax+" et "+temp);
    }
}
