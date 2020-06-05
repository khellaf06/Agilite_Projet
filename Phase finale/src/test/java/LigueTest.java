import static org.junit.Assert.*;
import org.junit.Test;

public class LigueTest {
	private Ligue ligue1 = Ligue.getInstance();
    private Ligue ligue2 = Ligue.getInstance();
    
    @Test
    public void singletonTest()
    {
    	assertEquals(ligue1,ligue2);
    }

}
