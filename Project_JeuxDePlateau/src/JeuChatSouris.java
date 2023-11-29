public class JeuChatSouris {

    public static void main(String[] args){

        PlateauJeuChatSouris jeu = new PlateauJeuChatSouris();
        int positionSouris =3 ;
        int positionChat = 1 ;

        jeu.placerSouris(positionSouris);
        jeu.placerChat(positionChat);

        // A COMPLETER
        while ( positionSouris <=16 && positionChat <= positionSouris && positionChat != positionSouris  ){
            int lancer = jeu.lancerDe();
            jeu.supprimerSouris();
            positionSouris +=lancer;
            jeu.placerSouris(positionSouris);
            lancer = jeu.lancerDe();
            jeu.supprimerChat();
            positionChat += lancer;
            jeu.placerChat(positionChat);
            if (positionSouris >= 16) {
                jeu.afficherInformation("GG SOURIS");
            }

            }
        jeu.afficherInformation("GG CHAT");

        }
    }


