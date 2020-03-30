package maPremiereApplicationBancaire;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class CProfessionnel extends Client {
	
	private int nSIRET;
    private String activitePrincipale ; 

	public int getnSIRET() {
		return nSIRET;
	}

	public void setnSIRET(int nSIRET) {
		this.nSIRET = nSIRET;
	}

	public String getActivitePrincipale() {
		return activitePrincipale;
	}

	public void setActivitePrincipale(String activitePrincipale) {
		this.activitePrincipale = activitePrincipale;
	}
	     
	    public CProfessionnel(String nom, String adresse, String ville, int cp, int nSIRET, String activitePrincipale) throws IOException {
	        super(nom, adresse, ville, cp);
	        this.nSIRET = nSIRET;
	        this.activitePrincipale = activitePrincipale ;
	        
	      //Pour créer et extraire des fichiers (fiche client) de format .json : 
			
	    	JSONObject jsonob = new JSONObject ();
	    	jsonob.put("Nom complet", nom);
	    	jsonob.put("Domicilié au", adresse);
	    	jsonob.put("Ville", ville);
	    	jsonob.put("Code postal", cp);
	    	jsonob.put("Numéro de SIRET", nSIRET);
	    	jsonob.put("Activité principale", activitePrincipale);
	    	
	    	FileWriter file = new FileWriter ("FicheClient"+nSIRET+".json"); 
	    	file.write(jsonob.toString());
	    	file.flush();
	    	file.close();
	    	System.out.println (jsonob); 
	        
	    }
	 
}
