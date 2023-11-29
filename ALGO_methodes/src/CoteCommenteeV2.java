public class CoteCommenteeV2 {
   
   public static java.util.Scanner scanner = new java.util.Scanner(System.in);
   
   public static void main (String[] args) {
   
      System.out.print("Veuillez entrer la cote : ");
      double cote = scanner.nextDouble();
      
      String cotecommentee = Utilitaires.donnerCommentaire(cote);
      System.out.println(cotecommentee);
   }

}