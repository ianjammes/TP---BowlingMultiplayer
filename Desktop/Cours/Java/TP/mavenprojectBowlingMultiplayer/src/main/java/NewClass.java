import bowling.Frame;
import bowling.MultiPlayerGame;
import bowling.SinglePlayerGame;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NewClass implements MultiPlayerGame {


	private final Map<String, SinglePlayerGame> games;
        
        private String PlayerName;
        
	private Iterator<String> playerIt;
        
	
        
	private SinglePlayerGame currentGame;
        
	private boolean gamePlaying = false;
	
	public NewClass() {
            
		 games = new LinkedHashMap<>();
	}

	public String startNewGame(String[] playerNames) throws Exception {
		if ((playerNames == null) || playerNames.length == 0) {
			throw new Exception("Aucun joueur renseigné.");
		}

		
		for (String name : playerNames) {
			games.put(name, new SinglePlayerGame());
		}

		// initialisation premier joueur
		playerIt = games.keySet().iterator();
		joueurSuivant();
		
		gamePlaying = true;

		return "Prochain lancer.";
	}

	public String lancer(int nombreDeQuillesAbattues) throws Exception {
		if (!gamePlaying) {
			throw new Exception("Aucune partie en cours.");
		}
		
		// On enregistre le lancer courant
		currentGame.lancer(nombreDeQuillesAbattues);

		// Si le tour du joueur est terminé
		if (currentGame.getCurrentFrame().isFinished()) {
			// On passe au joueur suivant
			gamePlaying = joueurSuivant();
		}

		return "Prochain lancer";
	}

	
	private boolean joueurSuivant() {
		if (!playerIt.hasNext()) { 
			if (currentGame.getCurrentFrame().getFrameNumber() == 10) { 
				return false; // jeu est terminé
			} else { // On démarre un nouveau tour
				playerIt = games.keySet().iterator(); 
			}
		}
		PlayerName = playerIt.next();
		currentGame = games.get(PlayerName);
		return true;
	}

	public int scoreFor(String playerName) throws Exception {
		// On trouve le jeu associé au nom du joueur
		SinglePlayerGame game = games.get(playerName);
		
		if (game == null)
			throw new Exception("Pas de joueur");
		
		return game.score();
	}

}
