package JUnitTests;

import java.io.IOException;

import junit.framework.TestCase;
import maPremiereApplicationBancaire.Client;
//import maPremiereApplicationBancaire.CompteBancaire;

public class MonPortefeuilleTest extends TestCase {
	
	MonPortefeuille agence1 = MonPortefeuille.getInstance(); 
	Client clientTest = Client(); 
	
	public MonPortefeuilleTest () { 
		super (); 
	}
	
	private Client Client() {
		return clientTest; 
	}

	public void testAfficherPortfeuille () throws IOException { 
	
		Compte cbtest = new Compte (); 
		int afficherPortefeuille = agence1.getComptesBancaires().size(); 
		agence1.ajouterCompte(cbtest);
		assertEquals (afficherPortefeuille+1, agence1.getComptesBancaires().size()); 
		
		
	}
}
