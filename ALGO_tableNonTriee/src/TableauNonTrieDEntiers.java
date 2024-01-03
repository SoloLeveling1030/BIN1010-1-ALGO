import java.util.HashSet;

public class TableauNonTrieDEntiers {

	private int[] t;
	private int nombreEntiers; // taille logique
	private static final int TAILLE = 10; // taille physique

	// Les nombreEntiers entiers occupent les nombreEntiers premieres cases du tableau!
	// PAS DE TROU!
	// L'ordre des entiers n'a pas d'importance

	public TableauNonTrieDEntiers() {
		this.t = new int[TAILLE];
		this.nombreEntiers = 0;
	}

	public int getNombreEntiers() {
		return this.nombreEntiers;
	}

	/**
	 * ajoute un entier en fin de table si la table n'est pas encore pleine
	 * @param entier l'entier a ajouter
	 * @return true si l'entier a pu etre ajoute, false sinon
	 */
	public boolean ajouter(int entier) {
		//TODO
		if (t.length != nombreEntiers) {
			t[nombreEntiers] = entier;
			nombreEntiers++;
			return true;
		}
		return false;

		//attention :
		//fin de table signifie apres le dernier entier
		//on ne veut pas de trou
		//il ne faut pas confondre taille logique et taille physique

	}
	private int trouverIndice(int entier){
		for (int i = 0; i < nombreEntiers ; i++) {
			if (t[i] == entier){
				return i;
			}
		}
		return -1;
	}
	/**
	 * verifie si la table contient l'entier passe en parametre
	 * @param entier l'entier dont on desire tester la presence
	 * @return true si l'entier est present dans la table, false sinon
	 */
	public boolean contient(int entier) {
		//TODO
		if (trouverIndice(entier) != -1)
			return true;
		return false;

		//suggestion : introduisez une methode private trouverIndice(int entier)
		//cette methode renvoie l'indice ou se trouve l'entier ou -1 si l'entier n'y est pas
		//cette methode peut etre utilisee pour la methode contient(),
		//mais aussi pour la methode supprimerPremiereOccurrence() !

	}

	/**
	 * calcule le nombre d'occurrences de l'entier passe en parametre
	 * @param entier l'entier dont on desire connaitre le nombre d'occurrences
	 * @return le nombre d'occurrences
	 */
	public int nombreOccurrences(int entier){
		//TODO
		int nombreOccurence =0;
		for (int i = 0; i < nombreEntiers; i++) {
			if (t[i] == entier){
				nombreOccurence++;
			}

		}
		return nombreOccurence;

		//nombre d'occurrences --> nombre de fois que l'entier est present
	}


	/**
	 * supprime la premiere occurrence d'un entier
	 * @param entier l'entier a supprimer
	 * @return true si l'entier a pu etre supprime, false sinon
	 */
	public boolean supprimerPremiereOccurrence(int entier) {
		//TODO
		if (trouverIndice(entier) != -1 ) {
			t[trouverIndice(entier)] = t[nombreEntiers -1];
			nombreEntiers--;
			return true;
		}
		return false;

	}

	/**
	 * supprime toutes les occurrences d'un entier
	 * @param entier l'entier a supprimer
	 * @return le nombre de suppressions effectuees
	 */
	public int supprimerToutesLesOccurrences(int entier) {
		// TODO
		int nombreOccurence = 0;
		if (trouverIndice(entier) != -1)
			for (int i = 0; i < nombreEntiers; i++) {
				if (t[i] == entier  ){
					t[trouverIndice(entier)] = t[nombreEntiers -1 ];
					nombreOccurence++;
					nombreEntiers--;
					i--;
				}

			}
		return nombreOccurence;

		// Remarque : il est possible d'ecrire cette methode en un seul parcours de la table

		// Evitez une solution qui appelle plusieurs fois la methode supprimerUneOccurrence(),
		// car a chaque appel la table est parcourue depuis le debut.

	}

	/**
	 * verifie si la table est triee par ordre croissant
	 * @return true si la table est triee, false sinon
	 */
	public boolean estTrie() {
		// TODO
		for (int i = 0; i < nombreEntiers -1 ; i++) {

			if (t[i] > t[i +1]){

				return false;
			}


		}
		return true;

	}


	/**
	 * verifie si la table contient des ex-aequos
	 * @return true si la table contient des ex-aequos, false sinon
	 */
	public boolean contientExAequo() {
		//TODO
		for (int i = 0; i < nombreEntiers -1 ; i++) {
			for (int j = i+1; j < nombreEntiers ; j++) {
				if (t[i] == t[j] ){
					return true;
			}
			}
		}
		return false;
	}

	/**
	 * supprime tous les ex-aequos.
	 * Notez que cette methode laisse exactement une occurence de chaque entier qui se trouvait dans le tableau initial.
	 * @return int le nombre de suppressions effectuees
	 */
	public int supprimerTousLesExAequos() {
		int nombreExo = 0;
		for (int i = 0; i < nombreEntiers; i++) {
			for (int j = i + 1; j < nombreEntiers; j++) {
				if (t[i] == t[j]) {
					for (int k = j; k < nombreEntiers - 1; k++) {
						t[k] = t[k + 1];
					}
					nombreEntiers--;
					nombreExo++;
					j--;
				}
			}
		}
		return nombreExo;
	}


	//A NE PAS MODIFIER
	//VA SERVIR POUR LES TESTS
	public TableauNonTrieDEntiers(int[] tableARecopier, int tailleLogique) {
		if (tableARecopier == null)
			throw new IllegalArgumentException();
		if (tailleLogique > tableARecopier.length || tableARecopier.length > TAILLE)
			throw new IllegalArgumentException();
		this.nombreEntiers = tailleLogique;
		t = new int[TAILLE];
		for (int i = 0; i < tableARecopier.length; i++) {
			t[i] = tableARecopier[i];
		}
	}

	// A NE PAS MODIFIER
	// VA SERVIR POUR LES TESTS
	public TableauNonTrieDEntiers(int[] tableARecopier) {
		this(tableARecopier, tableARecopier.length);
	}

	// A NE PAS MODIFIER
	// VA SERVIR POUR LES TESTS
	@Override
	public String toString() {
		if(nombreEntiers ==0)
			return "[]";
		String aRenvoyer = "["+ t[0];
		for (int i = 1; i < nombreEntiers; i++)
			aRenvoyer = aRenvoyer + ", " + t[i];
		return aRenvoyer+"]";
	}

	// A NE PAS MODIFIER
	// VA SERVIR POUR LES TESTS
	public HashSet<Integer> toHashSet(){
		HashSet<Integer> ensemble = new HashSet<Integer>();
		for (int i = 0; i < nombreEntiers; i++) {
			ensemble.add(t[i]);
		}
		return ensemble;
	}


}