public class CalculBMI {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("La taille de la Personne est : ");
        double  T = scanner.nextDouble();
        System.out.println("Le poids de la Personne est : ");
        double  P = scanner.nextDouble();
        double T_exposant = Math.pow(T,2);
        double BMI = P/T_exposant;
        System.out.println("son BMI"+BMI );
        if (BMI >20 && BMI<=25){
            System.out.println("La personne est normal");
        }
        if (BMI<20){
            System.out.println("La personne est Mince");
        }
        if (BMI>25&&BMI<=30){
            System.out.println("La personne est embonpoint");
        }
        if (BMI>30){
            System.out.println("La personne est obése");
        }
    }
}
