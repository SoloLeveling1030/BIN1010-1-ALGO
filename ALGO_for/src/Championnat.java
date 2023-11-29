import java.util.Scanner;

public class Championnat {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int coteMax = 0;
        int coteMin = 10;
        int somme = 0;
        System.out.println("Entres les 8 cotes ");
        for (int i = 1; i <= 8; i++) {
            int cote = scanner.nextInt();
            somme +=cote;

            if (cote > coteMax) {
                    coteMax = cote;
            }
            if (cote < coteMin) {
                    coteMin = cote;
            }
        }
        somme = somme - coteMin-coteMax;
        double moyenne = somme/6.0;
        if (moyenne >= 8){
           System.out.println("Le condidat est selectionné en final avec "+moyenne+"de moyenne");
        }
        else System.out.println("Le condidat n'est pas sélectionné en final avec une moyenne de "+moyenne);
    }
    }
