import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SetDifinition {

	private Match match;
	private Club clubLocal;
	private Club clubVisiteur;
	private Stade stade1;
	private Stade stade2;
	private int t=16888;
	
    // Scenario 1
	@Given("^Un match avec un club locale (.*) (.*) et un club visiteur (.*) (.*) et une date (.*)$")
	public void un_match_avec_un_club_locale_et_un_club_visiteur_et_une_date(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		stade1 = new Stade(arg2,t);
    	stade2 = new Stade(arg5,t);
    	clubLocal = new Club(arg1,stade1);
    	clubVisiteur = new Club(arg4,stade2);
    	match = new Match(clubLocal, clubVisiteur,arg5);
	}
	
	@When("^Reservation d un billet avec le num?ro de la place (.*)$")
	public void reservation_d_un_billet_avec_le_num_ro_de_la_place(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		match.reserverBillet(arg1);
	}

	@Then("^Un match avec un club locale et un club visiteur et une date a le billet avec le numero (.*) resrve$")
	public void un_match_avec_un_club_locale_et_un_club_visiteur_et_une_date_a_le_billet_avec_le_numero_resrve(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
        assertThat(arg1,is(match.getListPlacesReserves().get(0)));
	}
	
	// Scenario 2
	
	
	@When("^La supression d un billet avec le num?ro de la place (.*)$")
	public void la_supression_d_un_billet_avec_le_num_ro_de_la_place(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    match.annulerBillet(arg1);
	}

	@Then("^Un match avec un club locale et un club visiteur et une date a le billet avec le numero (.*) non reserve$")
	public void un_match_avec_un_club_locale_et_un_club_visiteur_et_une_date_a_le_billet_avec_le_numero_non_reserve(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		assertThat(1,is(match.getListPlaces().get(Integer.parseInt(arg6))));
	}
	
	// Scenario 3
	
	@When("^modifi? l ancien numero de la place (.*) d un billet avec le nouveau num?ro de la place (.*)$")
	public void modifi_l_ancien_numero_de_la_place_d_un_billet_avec_le_nouveau_num_ro_de_la_place(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    match.modifierBillet(Integer.parseInt(arg1), Integer.parseInt(arg2));
	}

	@Then("^rendre l ancien numero de place (.*) disponible et le nouveau numero de place (.*) indisponible$")
	public void rendre_l_ancien_numero_de_place_disponible_et_le_nouveau_numero_de_place_indisponible(int arg1, int arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		assertThat(0,is(match.getListPlaces().get(arg2)));
		assertThat(1,is(match.getListPlaces().get(arg1)));
		
	}

}
