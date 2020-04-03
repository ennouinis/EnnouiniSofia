package JUnitTests;

import maPremiereApplicationBancaire.Client;

public class Compte {
	private Client titulaireCompte ; 
	private int numeroIBAN ; 
	private double soldeBancaire, plafondDecouvert, retraitMaximum ; 
	private boolean crediteur; 
	
	public void CompteBancaire (Client t, int numeroIBAN, double soldeBancaire, double plafondDecouvert, double retraitMaximum) { 
		this.titulaireCompte = t ;
		this.numeroIBAN = numeroIBAN ;
		this.soldeBancaire = soldeBancaire ; 
		this.plafondDecouvert = plafondDecouvert ; 
		this.retraitMaximum = retraitMaximum ; 

	}
	
	
	public void CompteBancaire () { 
		
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
	
	public boolean isCrediteur() {
		return crediteur;
	}


	public void setCrediteur(boolean crediteur) {
		this.crediteur = crediteur;
	}

	public void verserArgent (double montant) { 
	soldeBancaire = soldeBancaire + montant ; 
	}
	
    public void retirerArgent (int montant){
        soldeBancaire = soldeBancaire - montant; { 
            if(montant >= 0 
            		&& montant <= retraitMaximum
            		&& soldeBancaire >= -plafondDecouvert ) {
            	System.out.println("Votre solde restant est de :  " + soldeBancaire + "euros.");
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

	public void reinit() {

		if (soldeBancaire > 0)
			 setCrediteur(true) ;
			 else 
			 setCrediteur(false); 
	}
    
}
