public class DessinVentilateur {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
        tortue.dessinerUnCarre(100);
        tortue.tournerAGauche(120);
        }

    }
}
