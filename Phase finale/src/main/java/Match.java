
import java.util.ArrayList; // import the ArrayList class


public abstract class Match {

	protected Club club;
	protected Club club_adverse;
	protected String date;
	protected ArrayList<Integer> listPlaces;
	protected ArrayList<Integer> listPlacesReserves;
	
	abstract public int nbChangement();
	abstract public String affiche();
	
/*	
public Match(Club club, Club club_adverse, String date) {
		this.club = club;
		this.club_adverse = club_adverse;
		this.date = date;
		this.listPlaces= new ArrayList<Integer>();
		this.listPlacesReserves= new ArrayList<Integer>();
		for(int i = 0; i< this.club.getStade().getNbrPlace()+1;i++) {
			this.listPlaces.add(1);
		}
	}



public String getDate() {
	return date;
}



public void setDate(String date) {
	this.date = date;
}



public Club getClub() {
	return club;
}



public void setClub(Club club) {
	this.club = club;
}



public Club getClub_adverse() {
	return club_adverse;
}



public void setClub_adverse(Club club_adverse) {
	this.club_adverse = club_adverse;
}


public ArrayList<Integer> getListPlaces() {
	return listPlaces;
}

public ArrayList<Integer> getListPlacesReserves() {
	return listPlacesReserves;
}



public void setListPlaces(ArrayList<Integer> listPlaces) {
	this.listPlaces = listPlaces;
}


public boolean  reserverBillet(Integer numeroPlace) {
	  if (this.listPlaces.get(numeroPlace).equals(1)){
		  this.listPlaces.set(numeroPlace,0);
		  this.listPlacesReserves.add(numeroPlace);
		  return true;
	  }
	  else {
		  return false;
	  }
}


public boolean  annulerBillet(int numeroPlace) {
	  if (this.listPlaces.get(numeroPlace).equals(0)){
		  this.listPlaces.set(numeroPlace,1);
		  this.listPlacesReserves.remove(numeroPlace);
		  
		  return true;
	  }
	  else {
		  return false;
	  }
	
}


public boolean  modifierBillet(int numeroAnciennePlace,int numeroNouvellePlace) {
	  if (this.listPlaces.get(numeroNouvellePlace).equals(1) & this.listPlaces.get(numeroAnciennePlace).equals(0)  ){
		  this.listPlaces.set(numeroAnciennePlace,1);
		  this.listPlaces.set(numeroNouvellePlace,0);
		  this.listPlacesReserves.remove(numeroAnciennePlace);
		  this.listPlacesReserves.add(numeroNouvellePlace);
		  return true;
	  }
	  else {
		  return false;
	  }
	
}
*/

}
