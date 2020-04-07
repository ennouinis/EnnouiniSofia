package maPremiereApplicationBancaire;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class CParticulier extends Client {

		private int nni ;
	    private String profession ; 
	    private int age ;

		public int nni() {
			return nni;
		}

		public void setNni(int nni) {
			this.nni= nni;
		}

		public String getProfession() {
			return profession;
		}

		public void setProfession(String profession) {
			this.profession = profession;
		}
		     
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			try {
				ageLegal(age);
			} catch (GestionExceptions e) {
				e.printStackTrace();
			}
			if (age>=18) {
				this.age = age;
			}
		}
		
		    public CParticulier(String nom, String adresse, String ville, int cp, int nni, String profession, int age) throws IOException {
		        super(nom, adresse, ville, cp);
		        this.nni = nni;
		        this.profession = profession ;
		        this.age = age ; 
		        try {
		        	ageLegal(age);
				} catch (GestionExceptions e) {
					e.printStackTrace();
				} 
		        
		    	JSONObject jsonob = new JSONObject ();
		    	jsonob.put("Nom complet", nom);
		    	jsonob.put("Domicilié au", adresse);
		    	jsonob.put("Ville", ville);
		    	jsonob.put("Code postal", cp);
		    	jsonob.put("NNI", nni);
		    	jsonob.put("Profession", profession);
		    	jsonob.put("Age", age);
		    	
		    	FileWriter file = new FileWriter ("FicheClient"+nni+".json"); 
		    	file.write(jsonob.toString());
		    	file.flush();
		    	file.close();
		    	System.out.println (jsonob); 
		        
		    }

		    public static void ageLegal (int age) throws GestionExceptions { 
		    	if (age<18) {
		    		throw new GestionExceptions ("Ce client n'a pas l'âge légal pour ouvrir un compte bancaire.");
		    	}
		    }
		 
	}
