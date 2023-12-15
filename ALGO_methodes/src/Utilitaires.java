public class Utilitaires {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    /**
     * genere un entier compris entre les 2 valeurs passees en parametre
     * @param valeurMinimale la valeur minimale de l'entier genere
     * @param valeurMaximale la valeur maximale de l'entier genere
     * @return l'entier genere
     */
    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
    }



    /**
     * lit un nombre reel positif ou nul
     * @return un nombre reel positif
     */
    public static double lireReelPositif(){
        double x = scanner.nextDouble();
        while(x < 0){
            System.out.println("Attention le reel doit etre positif");
            System.out.print("Recommencez : ");
            x = scanner.nextDouble();
        }
        return x;
    }


    /**
     * lit un nombre reel compris entre les 2 valeurs passees en parametre
     * @param min le plus petit reel accepte
     * @param max le plus grand reel accepte
     * @return un nombre reel compris entre 2 bornes
     */
    public static double lireReelComprisEntre(double min, double max ){
        double x = scanner.nextDouble();
        while (x <= min || x >= max) {
            System.out.println("Attention le reel doit etre entre les 2 valleurs passés en parametre");
            System.out.println("Recommencez : ");
            x = scanner.nextDouble();
        }
       return x;
        // TODO
        //il faut placer une boucle dans cette methode !
        //procedez comme pour la methode lireReelEntierPositif() donnee ci-dessus
    }


    /**
     * lit le caractere o ou n
     * @return le caractere o un n
     */
    public static char lireOouN(){
        char reponse = scanner.next().charAt(0);
        while( reponse != 'o' && reponse != 'n'){
            System.out.println("ce n'est pas le caractère demandés");
            System.out.println("Recommencez : ");
            reponse = scanner.next().charAt(0);
        }
        
        return reponse;
        // TODO
        //il faut placer une boucle dans cette methode !
    }
    /**
     * lit l'entier non null
     * @return l'entier non null
     */
    public static int lireEntierNonNul(){
        int entier = scanner.nextInt();
        while (entier == 0) {
            System.out.println("Attention l'entier dois etre non null");
            System.out.println("Recommencez : ");
            entier = scanner.nextInt();
        }
        return entier;
    }

    /**
     * lis une cote compris 2 valeurs passées en parametres
     * @param min la plus petite cote acceptée
     * @param max la plus grande cote acceptée
     * @return une cote entre les 2 bornes 
     */
    public static double lireUneCote(double min, double max){
        double cote = 0;
        double moyenne =0;
        int nombreCote =10;
        System.out.println("Cote sur 20");
        for (int i = 1; i <= nombreCote; i++) {
            System.out.println("Entrez la cote numero"+i);
            cote = scanner.nextDouble();
            while(cote <min || cote >max){
                System.out.print("Recommencez : ");
                cote = scanner.nextDouble();
            }
            moyenne+=cote;
        }
        moyenne /=nombreCote;
        return moyenne;
    }
    public static double calculerMoyenneEtudiant(){
        double cote = 0;
        double moyenne = 0;
        int nombreCote = 10;
        System.out.println("Cote sur 20");
        for (int i = 0; i < nombreCote; i++) {
            System.out.println("Entrez la cote " + i +" : ");
            cote = Utilitaires.lireUneCote(0,20);
            moyenne += cote;
        }
        moyenne /=nombreCote;
        return moyenne;
    }

    /**Renvoi sous forme de chaine de carctere, le max des entiers
     *entier1 > entier2 && entier1>entier3 : Le plus grand entier est entier1
     * entier2 > entier3 : Le plus grand entier est entier2
     * sinon l'entier Le plus grand entier est entier3
     * @return le max des entiers
     */

    public static String max3(int entier1,int entier2,int entier3 ) {
        if (entier1 >= entier2 && entier1 >= entier3){
            return "Le plus grand entier est " + entier1;
    }else if (entier2 > entier1 && entier2 >= entier3) {
            return "Le plus grand entier est " + entier2;
        } else
        return "Le plus grand entier est " + entier3;
    }
    public static String donnerCommentaire(double cote){
        if (cote < 10)
            return "L'etudiant n'a pas valide l'UE.";
         if (cote < 14)
             return "L'etudiant a valide l'UE.";
         if (cote < 16)
             return "L'etudiant a valide l'UE avec une belle cote.";
          // cote >= 16
            return "L'etudiant a valide l'UE avec une tres belle cote.";

    }


}
