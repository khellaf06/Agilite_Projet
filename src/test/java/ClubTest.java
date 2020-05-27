



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test ClubTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class ClubTest
{
    private Stade ParcDesPrinces;
    private Club PSG;

    @Before
    public void setUp() // throws java.lang.Exception
    {
        ParcDesPrinces = new Stade("ParcDesPrinces",48500);
        PSG = new Club("PSG",ParcDesPrinces);
    }

    /**
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @Test
    public void testClub() // throws java.lang.Exception
    {
        int nbrFan = PSG.nbrFanClub();
        assertEquals(97000,nbrFan);        
    }
    
    @Test
    public void testClubStade()
    {
    		assertEquals(PSG.getStade(),ParcDesPrinces);
    }
}
