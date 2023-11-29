public class DessinCarresEmboités {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        int reculer =0;
        for (int i = 0; i <=4; i++) {
            tortue.dessinerUnCarre(100-reculer);
            reculer +=10;
        }


        }
    }
