package StepDefinitions;
import java.util.*;

public class Connexion {
	private String login;
	private String mdp;
	
	public Connexion(){
		this.login=null;
		this.mdp=null;
	}
	
	public Connexion(String lg, String m){
		this.login=lg;
		this.mdp=m;
	}
	
	public boolean verifierLoginMDP(String s, String m) {
		
		if (this.login.equals(s) && this.mdp.equals(m))
			return true;
			else
				return false;
	}
}
