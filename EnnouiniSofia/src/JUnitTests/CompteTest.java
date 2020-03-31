package JUnitTests;

import org.junit.*;

public class CompteTest {
	
 @Test 
 public void test1() {

 Compte compte = new Compte(); 
 compte.verserArgent(300.0);

 compte.reinit();

 Assert.assertEquals(300.0, compte.getSoldeBancaire(), 300.0);
 }

 
 @Test 
 public void test4() {
 Compte compte = new Compte(); 
 compte.verserArgent(300.0);
 compte.retirerArgent(50);
 compte.reinit();
 
 Assert.assertEquals(250.0, compte.getSoldeBancaire(), 250.0);
}}