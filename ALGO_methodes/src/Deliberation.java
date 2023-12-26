public class Deliberation {
    public static void main(String[] args) {
        double moyenneEtudiant = 0;
        double moyenneClasse = 0;
        for (int i = 0; i <= 25; i++) {
            System.out.println("Etudiant " + i + " : ");
            moyenneEtudiant = Utilitaires.calculerMoyenneEtudiant();
            System.out.println("Moyenne de l'étudiant : "+moyenneEtudiant);
            moyenneClasse += moyenneEtudiant;
        }
        moyenneClasse /= 25;
        System.out.println("Moyenne de la classe : " + moyenneClasse);
    }
}
