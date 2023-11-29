public class CalculMoyenne {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        // la chaine de caracteres se met entre""
        // Le caractere se met entre ''
        char reponse = 'Y';
        double somme = 0;
        double moyenne = 0;
        int nombreCote = 0;
        // Pour lire un caractere :
        // (next() --> lecture d'une chaine de caracteres)
        //(charAt(0) --> 1er caractere de la chaine de caracteres

        do {
            System.out.println("Introduisez la cote :");
            int cote = scanner.nextInt();
            somme += cote;
            nombreCote++;
            System.out.println("il y'a une autre cote ?");
            reponse = scanner.next().charAt(0);
        }  while ((reponse == 'Y')||(reponse =='y')||(reponse == 'O')||(reponse == 'o'));
                moyenne = somme / nombreCote;
            System.out.println("la moyenne est de :" + moyenne);
        }
        // A COMPLETER

}
