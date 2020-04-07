package maPremiereApplicationBancaire;

import org.junit.*;

public class CompteBancaireTest {
		
@Test 
	public void testUnitaire1() {

	CompteBancaire cb1 = new CompteBancaire (); 
	cb1.verserArgent(1000);
	cb1.retirerArgent(500);

	Assert.assertEquals(0, cb1.getSoldeDebiteur(), 500);
	}

@Test 
	public void testUnitaire2() {

	CompteBancaire cb1 = new CompteBancaire(); 
	cb1.verserArgent(1000.0);
	cb1.reinitiliserSolde();
	Assert.assertEquals(1000, cb1.getSoldeCrediteur(), 0);
	}
		 
@Test 
	public void testUnitaire3() {
		 
	CompteBancaire cb1 = new CompteBancaire(); 
	cb1.verserArgent(2500);
	cb1.retirerArgent(500);
	cb1.reinitiliserSolde();
	Assert.assertEquals(2000, cb1.getSoldeBancaire(), 0);
		 }
	}
