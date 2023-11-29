public class JeuChienChatSouris {

    public static void main(String[] args){

        PlateauJeuChienChatSouris jeu = new PlateauJeuChienChatSouris();

        // A COMPLETER
        int posisitionChien = 1;
        int positionChat = 3;
        int positionSouris = 5;
        int positionFromage = 12;


        jeu.placerChien(posisitionChien);
        jeu.placerChat(positionChat);
        jeu.placerSouris(positionSouris);
        jeu.placerFromage(positionFromage);

        while (positionSouris <= 16 && (positionChat <= positionSouris && positionChat != positionSouris) && (posisitionChien <= positionChat && posisitionChien != positionChat)) {
            int lancer = jeu.lancerDe();
            jeu.supprimerSouris();
            positionSouris += lancer;
            jeu.placerSouris(positionSouris);
            lancer = jeu.lancerDe();
            jeu.supprimerChat();
            positionChat += lancer;
            jeu.placerChat(positionChat);
            lancer = jeu.lancerDe();
            jeu.supprimerChien();
            posisitionChien += lancer;
            jeu.placerChien(posisitionChien);


            if (positionSouris >= positionFromage) {
                jeu.supprimerSouris();
                jeu.placerSouris(positionFromage);
                jeu.supprimerFromage();
                jeu.afficherInformation("gg souris");

            }
            if (positionChat >= positionSouris) {
                jeu.supprimerChat();
                jeu.placerChat(positionSouris);
                jeu.supprimerSouris();
                jeu.afficherInformation("gg chat");

                if (posisitionChien >= positionChat) {
                    jeu.supprimerChat();
                    jeu.placerChien(positionChat);
                    jeu.supprimerChien();
                    jeu.afficherInformation("gg chien");
                }


            }
        }
    }
}
