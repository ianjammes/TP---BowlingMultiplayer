/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bowling.MultiPlayerGame;
import bowling.SinglePlayerGame;
/**
 *
 * @author pedago
 */
public class NewClass implements bowling.MultiPlayerGame {
    
    private SinglePlayerGame p1;
    private SinglePlayerGame p2;
    
    
    
    public NewClass(){
        
        p1 = new SinglePlayerGame();
        p2 = new SinglePlayerGame();
        
    }
    
    
    
    /**
	 * Démarre une nouvelle partie pour un groupe de joueurs
	 * @param playerName un tableau des noms de joueurs (il faut au moins un joueur)
	 * @return une chaîne de caractères indiquant le prochain joueur,
	 * de la forme "Prochain tir : joueur Bastide, tour n° 5, boule n° 1"
	 * @throws java.lang.Exception si le tableau est vide ou null
	 */
        @Override
	public String startNewFrame(String[] playerName) throws Exception {
            return "Prochain tir ";
        }
        }
	
	/**
	 * Enregistre le nombre de quilles abattues pour le joueur courant, dans le frame courant, pour la boule courante
	 * @param nombreDeQuillesAbattues : nombre de quilles abattue à ce lancer
	 * @return une chaîne de caractères indiquant le prochain joueur,
	 * de la forme "Prochain tir : joueur Bastide, tour n° 5, boule n° 1",
	 * ou bien "Partie terminée" si la partie est terminée.
	 * @throws java.lang.Exception si la partie n'est pas démarrée, ou si elle est terminée.
	 */
        @Override
	public String lancer(int nombreDeQuillesAbattues) throws Exception{

        return "null";

        }
	
	/**
	 * Donne le score pour le joueur playerName
	 * @param playerName le nom du joueur recherché
	 * @return le score pour ce joueur
	 * @throws Exception si le playerName ne joue pas dans cette partie
	 */
        @Override
	public int scoreFor(String playerName) throws Exception {

           return 3;
        }
}
