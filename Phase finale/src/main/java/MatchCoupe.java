

public class MatchCoupe extends Match{

	@Override
	public String affiche() {
		return "ce match est un match de coupe";
	}

	@Override
	public int nbChangement() {
		return 4;
	}
	
}