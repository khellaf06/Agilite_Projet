import java.util.ArrayList;

/**
 * ici nous allons définir notre classe stade avec ses attributs 
 * et ses conconstructeurs
 *
 * @authors (DJEBAR & BOULKARIA)
 * @version (28/04/2020)
 */
public class Stade
{
    // Un stade est defini par : 
    private String name;
    private Integer nbrPlaces;
    private ArrayList<Club> clubsAssocies;

    /**
     * Constructeurs d'objets de la classe Stade
     */
    public Stade()
    {
        // initialisation des variables d'instance vide
        name = "stadeX";
        nbrPlaces = 0;
        clubsAssocies = new ArrayList<>();
    }
    
    public Stade(String name, Integer nbrPlace)
    {
        // initialisation des variables d'instance avec valeurs
       this.name = name;
       this.nbrPlaces = nbrPlace;
       this.clubsAssocies = new ArrayList<>();
    }
    public Stade(String name, int nbrPlace, ArrayList<Club> list)
    {
        // initialisation des variables d'instance avec valeurs
       this.name = name;
       this.nbrPlaces = nbrPlace;
       this.clubsAssocies = list;
    }
    

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String getName()
    {
                return this.name;
    }
        public int getNbrPlace()
    {
                return this.nbrPlaces;
    }
    
    public ArrayList<Club> getClubsAssocies(){
    		return this.clubsAssocies;
    }
    
    public void setName(String name)
    {
                this.name = name;
    }
    
    public void setNbrPlace(int nb)
    {
                this.nbrPlaces = nb;
    }
    public void setClubsAssocie(ArrayList<Club> clubs)
    {
                this.clubsAssocies = clubs;
    }
    
    public int nbrPlacesClubFans()
    {
        return this.nbrPlaces/2;
    }
}
