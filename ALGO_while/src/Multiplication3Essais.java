
public class Multiplication3Essais {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Entrainement aux multiplications. Voici une multiplication :");
		System.out.println("Tu as droit a 3 essais");
		int premierNombre = unEntierAuHasardEntre (0, 10);
		int secondNombre = unEntierAuHasardEntre (0, 10);
		System.out.println("Calculez : " + premierNombre + " x " + secondNombre + " = ");
		int reponse = scanner.nextInt();
		int multiplication = premierNombre * secondNombre;
		int essais = 2;
		// A COMPLETER
		while (reponse != multiplication && essais !=0 ){
			System.out.println("C’est faux, recommence");
			reponse = scanner.nextInt();
			essais --;
		}
		if (essais == 0){
			System.out.println(" tu as fais 3 essais");
		}else System.out.println("Bravoo !");
	}

	// A NE PAS MODIFIER
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
	}
	
}
