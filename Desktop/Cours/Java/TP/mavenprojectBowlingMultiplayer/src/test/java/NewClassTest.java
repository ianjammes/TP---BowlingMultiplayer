
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewClassTest {
	private NewClass multiPlayerGame;
	
	@Before
	public void setUp() {
		multiPlayerGame = new NewClass();
	}
	
	@Test (expected = Exception.class)
	public void needOnePlayer() throws Exception {
		String[] playerNames = {};
		String result = multiPlayerGame.startNewGame(playerNames);
	}


        
        
        
        
        
	private String rollMany(int n, int pins) throws Exception {
		String result = "";
		for (int i = 0; i < n; i++) {
			result= multiPlayerGame.lancer(pins);
		}
		return result;
	}

	private String rollSpare() throws Exception {
		multiPlayerGame.lancer(7);
		return multiPlayerGame.lancer(3);
	}

	private String rollStrike() throws Exception {
		return multiPlayerGame.lancer(10);
	}	
}
