

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class MatchTest {
    private Stade ParcDesPrinces = new Stade("ParcDesPrinces",48500);
    private Club PSG = new Club("PSG",ParcDesPrinces);
    private Stade OldTraford = new Stade("OldTraford",60500);
    private Club ManUnited = new Club("ManUnited",OldTraford);
    
    Match match;
    int numeroPlace = 45;
    
    @Before
    public void setUp() // throws java.lang.Exception
    {
    	match = new Match(PSG,ManUnited,"25/05/2020");
    }
    
    @Test
    public void testReserverBillet()
    {
    	match.getListPlaces().set(numeroPlace,1);
    	assertEquals(match.reserverBillet(numeroPlace),true);
    }

}
