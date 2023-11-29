import java.util.Scanner;

public class C2Calendrier {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int jour1Mois = scanner.nextInt();
        int mois = scanner.nextInt();
        String nomJour;
        for (int i = 1; i <= 1; i++) {
            switch (i) {
                case 1:
                    System.out.print("Lu");

                case 2:
                    System.out.print(" ");
                    System.out.print("Ma");

                case 3:
                    System.out.print(" ");
                    System.out.print("Me");
                case 4:
                    System.out.print(" ");
                    System.out.print("je");

                case 5:
                    System.out.print(" ");
                    System.out.print("Ve");

                case 6:
                    System.out.print(" ");
                    System.out.print("Sa");


                case 7:
                    System.out.print(" ");
                    System.out.print("Di");
                    break;
                default:
                    nomJour = "Jour introuvable";
                    System.out.println("Le jour numéro " + jour1Mois + " est : " + nomJour);
            }
        }
        System.out.println(" ");
        for (int i = 1; i <=jour1Mois; i++) {
            System.out.print("\t");
        }
        for (int j = jour1Mois; j <= mois; j++) {

            System.out.print("\t"+j);

            }
        }

    }
