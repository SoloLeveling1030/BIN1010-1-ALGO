import java.util.Random;

public class Arithmetique {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);


    public static void main(String[] args) {
        int entierRandom1 = unEntierAuHassard(1,100);
        int entierRandom2 = unEntierAuHassard(1,100);
        int reponseAddition = demanderLaReponse(entierRandom1,entierRandom2, "Addition");
        if (entierRandom1 + entierRandom2 != reponseAddition){
            System.out.println("la reponse est : "+(entierRandom1 + entierRandom2));
        }
        int reponseSoustraction = demanderLaReponse(entierRandom1,entierRandom2, "Soustraction");
        int soustraction = entierRandom1 - entierRandom2;
        if (soustraction != reponseSoustraction ){
            System.out.println("la reponse est :"+(entierRandom1 - entierRandom2));
        }
       /** System.out.println("Multiplication :"+entierRandom1+" * "+entierRandom2+ " = ");
        int multiplicatio = entierRandom1 * entierRandom2;
        if (multiplicatio != reponse && (reponse>=1 && reponse<=100)){
            System.out.println("la reponse est :"+reponse);
        }
        System.out.println("Division :"+entierRandom1+" / "+entierRandom2+ " = "+reponse);
        int division = entierRandom1 / entierRandom2;
        if (division != reponse && (reponse>=1 && reponse<=100)){
            System.out.println("la reponse est :"+reponse);
        }**/
        else System.out.println("Bravo !");

    }
    public static int unEntierAuHassard(int valeurMinimal, int valeurMaximal) {
        Random random = new Random();
        int nombre1 = random.nextInt(valeurMaximal - valeurMinimal + 1) + valeurMinimal;
        int valeurRestante = 100 - nombre1;
        int nombre2 = random.nextInt(Math.min(valeurMaximal - valeurMinimal + 1, valeurRestante - valeurMinimal + 1)) + valeurMinimal;
        return nombre1 + nombre2;
    }

    public static int demanderLaReponse(int nombre1,int nombre2,String operation) {
        System.out.println(operation + " : " + nombre1 + " " + getSymbol(operation) + nombre2 + " = " );
        int reponse = scanner.nextInt();
        if(reponse < 1 || reponse >100 ){
            System.out.println(" Réponse invalide : veillez réessayer. ");
            return demanderLaReponse(nombre1,nombre2,operation) ;
        }
        return reponse;
    }
    public static String getSymbol(String operation){
        if (operation.equals("Addition")){
            return "+";
        } else if (operation.equals("Soustraction")) {
            return "-";
        } else if (operation.equals("*")) {
            return "*";
        } else if (operation.equals("/")) {
            return "/";
        }
        return "";
    }

}
