import java.util.Arrays;

public class StatistiquesTemperatures {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	public static Temperatures temperatures;
	
	public static void main(String[] args) {
		
		chargerTemperatures();
		System.out.println(temperatures.toString());
		
		System.out.println("*****************************");
		System.out.println("Temperatures : statistiques :");
		System.out.println("*****************************");
		int choix;
		do{
			System.out.println();
			System.out.println("1 -> afficher toutes les temperatures");	
			System.out.println("2 -> calculer la moyenne");
			System.out.println("3 -> calculer la temperatureMin");
			System.out.println("4 -> calculer le nombreJoursDeGel");
			System.out.println("5 -> afficher le JourDeGel");
			System.out.println("6 -> afficher si tempraturePositive");
			System.out.println("7 -> afficher si contientAuMoinsUnJourDeGel");
			System.out.println("8 -> afficher  si contientAuMoinsUneTemperatureSuperieureA ");
			System.out.println("9 -> afficher la  temperatureMax");
			System.out.println("10 -> afficher les joursMax");
			System.out.println("11 -> afficher les joursMin");
			System.out.print("Entrez votre choix : ");	
			choix=scanner.nextInt();
			switch(choix){	
			case 1: afficherTout();   
			break;
			case 2: afficherMoyenne();   
			break;
			case 3:afficheTemperatureMin();
			break;
			case 4: afficherNombreJoursDeGel();
			break;
			case 5: afficherJoursDeGel();
			break;
			case 6: afficherToutesPositives();
			break;
			case 7: affichercontientAuMoinsUnJourDeGel();
			break;
			case 8: affichercontientAuMoinsUneTemperatureSuperieureA(5.0);
			break;
			case 9: afficherTemperatureMax();
			break;
			case 10: afficherJoursMax();
			break;
			case 11: afficherJoursMin();
			break;
			}
		}while(choix >=1 && choix<=10);
	}
	
	private static void afficherTout() {
		System.out.println(temperatures.toString());
	}

	private static void afficherMoyenne() {
		// TODO
		System.out.println("Moyenne = "+temperatures.moyenne());
	}
	private static void afficheTemperatureMin(){
		System.out.println("Min = "+temperatures.temperatureMin());
	}
	private static void afficherNombreJoursDeGel(){
		System.out.println("Nombre jours de gel : "+temperatures.nombreJoursDeGel())	;
	}
	private static void afficherJoursDeGel(){
		System.out.println("Jours de gel : "+ Arrays.toString(temperatures.joursDeGel()));
	}
	private static void afficherToutesPositives(){
		System.out.println("Tous positives : "+temperatures.toutesPositives());
	}
	private static void affichercontientAuMoinsUnJourDeGel(){
		System.out.println("Au moins une négative :"+temperatures.contientAuMoinsUnJourDeGel());
	}
	private static void affichercontientAuMoinsUneTemperatureSuperieureA(double temperature){
		System.out.println("Au moins une spérieur à 5.0 "+temperatures.contientAuMoinsUneTemperatureSuperieureA(5.0)+",au moins une inférieur à 0.0"+temperatures.contientAuMoinsUneTemperatureSuperieureA(0.0));
	}
	private static void afficherTemperatureMax(){
		System.out.println("Max ="+temperatures.temperatureMax());
	}
	private static void afficherJoursMax(){
		System.out.println("Jours max : "+Arrays.toString(temperatures.joursMax()));
	}
	private static void afficherJoursMin(){
		System.out.println("Jours min : "+Arrays.toString(temperatures.joursMin()));
	}

	public static void chargerTemperatures(){
		double[]tableTemperatures = {-1,1,0,1,-1,-3,-3,-2,0,-1,0,1,1,3,5,4,2,0,1,1,5,3,2,0,-1,0,1,1,3,4,5};
		temperatures = new Temperatures("janvier",tableTemperatures);
	}
	
	public static void afficherTable(int[]table){
		System.out.println(Arrays.toString(table));
	}
	
}
