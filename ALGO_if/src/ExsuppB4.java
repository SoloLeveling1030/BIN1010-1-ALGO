public class ExsuppB4 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int coteAlgo = scanner.nextInt();
        int coteApoo = scanner.nextInt();
        if (coteAlgo > coteApoo){
            System.out.println("le cours le mieux réussis est Algo avec : "+coteAlgo+" de notes ");
        }
        if (coteAlgo < coteApoo){
            System.out.println("le cours le mieux réussis est APOO avec : "+coteApoo+" de notes ");
        }
        if (coteAlgo == coteApoo){
            System.out.println("les cours sont ex-aequo avec "+coteAlgo+" en Algo et "+coteApoo+" Apoo");

        }

    }
}
