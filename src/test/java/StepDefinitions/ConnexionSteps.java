package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class ConnexionSteps {
	
	private Connexion aConex;
	private String i_login, i_mdp;
	private boolean result;

/*
	@Given("un utilisateur est dans la page de connexion")
	public void un_utilisateur_est_dans_la_page_de_connexion() {
	   System.out.println("dans le given");
	   aConex = new Connexion("kathia", "r402");
	}
*/
	
	@Given("^(.*) est dans la page de connexion$")
	public void un_utilisateur_est_dans_la_page_de_connexion(String nom) {
	   System.out.println("dans le given");
	   System.out.println(nom);
	   aConex = new Connexion(nom, "r402");
	}
	   
	@And("^il saisit son (.*) et (.*)")
	public void il_saisit_son_login_et_mot_de_passe(String s, String m) {
		   System.out.println("dans le when");
		   i_login = s;
		   i_mdp = m;
		   System.out.println(s);
		   System.out.println(m);
	}
	
	@And("clique sur le button ok")
	public void clique_sur_le_button_ok() {
		System.out.println("dans le and -clique au buton");
		result = aConex.verifierLoginMDP(i_login, i_mdp);
		System.out.println(result);
	}

	@Then("il navigue pour la page du systeme")
	public void il_navigue_pour_la_page_du_systeme() {
		System.out.println("dans le then ");
		assertEquals(true, result);
	}
}
