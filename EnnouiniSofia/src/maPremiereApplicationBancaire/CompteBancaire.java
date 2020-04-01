package maPremiereApplicationBancaire;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;


public class CompteBancaire {

	private Client titulaireCompte ; 
	private int numeroIBAN ; 
	private double soldeBancaire, plafondDecouvert, retraitMaximum ; 
	
	public CompteBancaire (Client t, int numeroIBAN, double soldeBancaire, double plafondDecouvert, double retraitMaximum) throws IOException { 
		this.titulaireCompte = t ;
		this.numeroIBAN = numeroIBAN ;
		this.soldeBancaire = soldeBancaire ; 
		this.plafondDecouvert = plafondDecouvert ; 
		this.retraitMaximum = retraitMaximum ; 

	//Pour créer et extraire des fichiers (attestationRIB) de format .json : 
		
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

	public void verserArgent (double montantVersement) { 
	soldeBancaire = soldeBancaire + montantVersement; 
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
       
    }

