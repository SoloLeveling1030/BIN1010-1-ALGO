public class CombatAMort {

    public static void main(String[] args) {
        /*


        System.out.println("FrappeFort inflige "+degats +" points de degats a CogneDur.");

        System.out.println("Il reste "+ pointsDeVieFrappeFort +" points de vie a FrappeFort.");
        System.out.println("Il reste "+ pointsDeVieCogneDur +" points de vie a CogneDur.");

        System.out.println("CogneDur est mort. Paix a son ame, il est mort en brave.");
        System.out.println("FrappeFort est mort. Paix a son ame, il est mort en brave.");

        System.out.println("CogneDur est victorieux.");
        System.out.println("FrappeFort est victorieux.");
        */

        System.out.println("Bienvenue au combat entre CogneDur et FrappeFort !");
        int pointsDeVieCogneDur = 9;
        int pointsDeVieFrappeFort = 12;
        int degats = lancerDe();
        do {
            System.out.println("CogneDur inflige "+degats +" points de degats a FrappeFort.");
            pointsDeVieCogneDur -=degats;
            System.out.println("Il reste "+ pointsDeVieCogneDur +" points de vie a CogneDur.");
            System.out.println("FrappeFort inflige "+degats +" points de degats a CogneDur.");
            pointsDeVieFrappeFort -=degats;
            System.out.println("Il reste "+ pointsDeVieFrappeFort +" points de vie a FrappeFort.");

        } while ( pointsDeVieCogneDur > 0 &&  pointsDeVieFrappeFort > 0);
        if (pointsDeVieFrappeFort > pointsDeVieCogneDur){
            System.out.println("CogneDur est mort. Paix a son ame, il est mort en brave.");
            System.out.println("FrappeFort est victorieux.");
        }else {
            System.out.println("FrappeFort est mort. Paix a son ame, il est mort en brave.");
            System.out.println("CogneDur est victorieux.");
        }
    }
    public static int lancerDe(){
        return (int)((Math.random() * 6) + 1);
    }
}
