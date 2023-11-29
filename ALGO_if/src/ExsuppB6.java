public class ExsuppB6 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int jour = scanner.nextInt();
        int mois = scanner.nextInt();

        if ((mois == 3 && jour >= 21)||(mois > 3 && mois <6) || (mois == 6 && jour <= 20)){
            System.out.println("Printemps");
        }
        if ((mois == 6 && jour >=21)||(mois  > 6 && mois < 9)||(mois == 9 && jour <= 20)){
            System.out.println("Eté");
        }
        if ((mois == 9 && jour >= 21) || (mois >9 && mois < 12)||(mois == 12 && jour <= 20)){
            System.out.println("Automne");
        }
        if ((mois == 12 && jour >=21) || (mois <3 )||(mois == 3 && jour <=20)){
            System.out.println("Hiver");
        }
    }

}

