public class JeuSouris {

	public static void main(String[] args){

		int positionSouris = 1;
		int positionFromage = 10;
		PlateauJeuSouris jeu = new PlateauJeuSouris();
		jeu.afficherInformation("Vas-y !");
		jeu.placerSouris(positionSouris);
		jeu.placerFromage(positionFromage);

		// A COMPLETER


		while (positionSouris <= 16  ){
			int lanceDe = jeu.lancerDe();
			jeu.supprimerSouris();
			positionSouris += lanceDe;
			if(positionSouris < 16)
			jeu.placerSouris(positionSouris);
			if (positionSouris >= positionFromage){
				jeu.supprimerSouris();
				jeu.placerSouris(positionFromage);
				jeu.supprimerFromage();
			}
		}
		jeu.afficherInformation("GG");
	}
}
