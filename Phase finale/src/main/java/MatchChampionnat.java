import java.util.ArrayList;

public class MatchChampionnat extends Match{
	
	public MatchChampionnat() {
		
	}
	
	public MatchChampionnat(Club club, Club club_adverse, String date) {
		super();
		this.club = club;
		this.club_adverse = club_adverse;
		this.date = date;
		this.listPlaces= new ArrayList<Integer>();
		this.listPlacesReserves= new ArrayList<Integer>();
		for(int i = 0; i< this.club.getStade().getNbrPlace()+1;i++) {
			this.listPlaces.add(1);
		}
	}

	@Override
	public String affiche() {
		return "ce match est un match de championnat";
	}

	@Override
	public int nbChangement() {
		return 3;
	}
	
}