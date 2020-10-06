package maPremiereApplicationBancaire;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;


public class CompteBancaire {

	private Client titulaireCompte ; 
	private int numeroIBAN ; 
	private double soldeBancaire, plafondDecouvert, retraitMaximum ; 
	private double soldeCrediteur, soldeDebiteur; 
	
	public CompteBancaire (Client t, int numeroIBAN, double soldeBancaire, double plafondDecouvert, double retraitMaximum) throws IOException { 
		this.titulaireCompte = t ;
		this.numeroIBAN = numeroIBAN ;
		this.soldeBancaire = 0 ; 
		this.plafondDecouvert = plafondDecouvert ; 
		this.retraitMaximum = retraitMaximum ; 
		
	JSONObject jsonob = new JSONObject ();
	jsonob.put("Compte numéro", numeroIBAN);
	jsonob.put("Titulaire", t.getNom());
	jsonob.put("Domicilié au", t.getAdresse());
	jsonob.put("Solde", soldeBancaire);
	
	FileWriter file = new FileWriter ("attestationRIB"+numeroIBAN+".json"); 
	file.write(jsonob.toString());
	file.flush();
	file.close();
	System.out.println (jsonob); 
	
	}
	
	public CompteBancaire () { 
		
	}
	
	public CompteBancaire (Client t, int numeroIBAN, double plafondDecouvert, double retraitMaximum) { 
		this.titulaireCompte = t ;
		this.numeroIBAN = numeroIBAN ;
		this.plafondDecouvert = plafondDecouvert ; 
		this.retraitMaximum = retraitMaximum ; 
	}
	
	public Client getTitulaireCompte() {
		return titulaireCompte;
	}

	public void setTitulaireCompte(Client titulaireCompte) {
		this.titulaireCompte = titulaireCompte;
	}

	public int getNumeroIBAN() {
		return numeroIBAN;
	}

	public void setNumeroIBAN(int numeroIBAN) {
		this.numeroIBAN = numeroIBAN;
	}

	public double getSoldeBancaire() {
		return soldeBancaire;
	}

	public void setSoldeBancaire(double soldeBancaire) {
		this.soldeBancaire = soldeBancaire;
	}

	public double getPlafondDecouvert() {
		return plafondDecouvert;
	}

	public void setPlafondDecouvert(double plafondDecouvert) {
		this.plafondDecouvert = plafondDecouvert;
	}

	public double getRetraitMaximum() {
		return retraitMaximum;
	}
	
	public void setRetraitMaximum(double retraitMaximum) {
		this.retraitMaximum = retraitMaximum;
	}
	
	public double getSoldeCrediteur() {
		return soldeCrediteur;
	}

	/*public void setSoldeCrediteur(double soldeCrediteur) {
		this.soldeCrediteur = soldeCrediteur;
	}*/

	public double getSoldeDebiteur() {
		return soldeDebiteur;
	}

	/*public void setSoldeDebiteur(double soldeDebiteur) {
		this.soldeDebiteur = soldeDebiteur;
	}*/

	public void verserArgent (double montantVersement) { 
	soldeBancaire = soldeBancaire + montantVersement; {
		System.out.println("Versement effectué avec succès. Votre nouveau solde est de : " + soldeBancaire + " euros.");
	}
	}
	
    public void retirerArgent (double montantRetrait){
        soldeBancaire = soldeBancaire - montantRetrait; { 
            if(montantRetrait > 0 
            		&& montantRetrait <= retraitMaximum
            		&& soldeBancaire >= -plafondDecouvert ) {
            	System.out.println("Votre solde restant est de :  " + soldeBancaire + " euros.");
    }
           else { 
        	   System.out.println("Votre demande ne peut être traitée."); }
    }
    }
        
    public String toString() { 
	return ("Nom/Dénomination sociale : " + this.titulaireCompte.getNom() + "\n" + "Titulaire du compte bancaire n° : " + this.numeroIBAN 
			+ "\n" + "Solde bancaire : " + this.soldeBancaire + " euros." ) ; 
	}

    public double montantDecouvert(){
    	System.out.print("Ce compte a un découvert de : ");  
    	    if (soldeBancaire < 0){
            return -soldeBancaire;
        }
        else
        {
            return 0;
        }
    	    
    }
    
    public void reinitiliserSolde() {
   	 
		if (soldeBancaire>0) 
    	 {soldeCrediteur = soldeBancaire; soldeDebiteur = 0;}
    	 else
    	 {soldeDebiteur = soldeBancaire; soldeCrediteur = 0;}
    }
       
    }

