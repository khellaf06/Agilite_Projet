
/**
 * Décrivez votre classe Club ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Club
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private Stade stadeAssocie;
    private Ligue ligue;

    /**
     * Constructeur d'objets de classe Club
     */
    public Club(String name, Stade stadeAssocie)
    {
        // initialisation des variables d'instance
       this.name = name;
       this.stadeAssocie = stadeAssocie;
       this.ligue = Ligue.getInstance();
    }
    
    public String getName(){
    		return this.name;
    }
    
    public Stade getStade(){
		return this.stadeAssocie;
    }
    
    public Ligue getLigue(){
		return this.ligue;
	}
	
    public void setName(String name){
		this.name=name;
    }

	public void setStade(Stade stade){
		this.stadeAssocie = stade;
	}
	
	
	

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int nbrFanClub()
    {
        /* Le nombre de fan d'un club est le nombre de places du stade 
        associé * 2 */
        return stadeAssocie.getNbrPlace()*2;
    }
    
}
