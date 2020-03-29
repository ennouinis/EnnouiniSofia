package maPremiereApplicationBancaire;

public class Client {
	
	private String nom, adresse ;
	
	public Client (String nom, String adresse) { 
		this.nom = nom ;
		this.adresse = adresse ; 
	} 

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	} 
	
	public void afficherInformationsClient() {
		System.out.println("Nom/Dénomination sociale : " + this.getNom() + "\n" + "Résidant au : " + this.getAdresse());
		}
}
 
  

 