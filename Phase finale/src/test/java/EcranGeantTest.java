import static org.junit.Assert.*;
import org.junit.Test;

public class EcranGeantTest {
	Match matchAmical = new MatchAmical();
	EcranGeant eg = new EcranGeant();
	
	
	
	@Test
    public void matchAfficheTest()
    {
		eg.setMatch(matchAmical);
		assertEquals(eg.affichageMatch(),matchAmical.affiche());
    }
    	
    	
}
