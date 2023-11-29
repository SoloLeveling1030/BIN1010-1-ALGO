import java.util.Scanner;

public class RecitationTableMultiplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int entier = unEntierHassard(1,10);
        int tableMultiplication =1;
        System.out.println("Tu vas donner la table de multiplication par "+entier+" : ");
        int multiplication = 0;
        int reponse = 0;
        do {

            System.out.println(tableMultiplication+" * "+entier+ " = ");
            multiplication = tableMultiplication * entier;
            reponse = scanner.nextInt();
            tableMultiplication++;

        }while(reponse == multiplication && tableMultiplication !=10);
        if (reponse !=multiplication){
            System.out.println("Non c'est faux, la bonne réponse est "+multiplication);
        } else
            System.out.println("Félicitations !");
    }

    public static int unEntierHassard(int valeurMinimal, int valeurMaximal){
        return (int) (Math.random() *(valeurMaximal - valeurMinimal + 1)) + valeurMinimal;
    }
}
