import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SetDifinition {

	private Club c1;
	private Club c2;
	private Match match;
	

	@Given("^un match necissite deux clubs$")
	public void un_match_necissite_deux_clubs() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		c1= new Club("PSG", new Stade("ParcDesPrinces",48500));
		c2= new Club("ManUnited", new Stade("OldTraford",60500));
	}
	
	@When("^un match de championnat se joue dans une ligue")
	public void un_match_de_championnat_se_joue_dans_une_ligue() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		un_match_necissite_deux_clubs();
		match = new MatchChampionnat(c1,c2,"25/05/2020");
	}
	
	@Then("^les deux clubs sont dans la meme ligue")
	public void les_deux_clubs_sont_dans_la_meme_ligue() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		un_match_de_championnat_se_joue_dans_une_ligue();
	    assertThat(1,is(c1.getLigue().equals(c2.getLigue())));
	}
}
