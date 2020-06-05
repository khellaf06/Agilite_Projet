
public class Ligue{
	private static Ligue instance;
	private static String nom;
	
	public Ligue() {
		
	}
	
	public static Ligue getInstance() {
		if(instance == null) {
			instance = new Ligue();
			nom= "Ligue1";
		}
		return instance;
	}
	
	public String getNom() {
		return nom;
	}
		
}