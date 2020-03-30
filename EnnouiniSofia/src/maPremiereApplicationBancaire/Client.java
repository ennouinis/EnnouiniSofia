package maPremiereApplicationBancaire;

public class Client {
	
	private String nom, adresse, ville ;
	private int codePostal;
	
	public Client (String nom, String adresse, String ville, int cp) { 
		this.nom = nom ;
		this.adresse = adresse ; 
		this.ville = ville;
		this.codePostal = cp;
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
	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public void afficherInformationsClient() {
		System.out.println("Nom/Dénomination sociale : " + this.getNom() + "\n" + "Résidant au : " + this.getAdresse() + ", " + this.getCodePostal() + " - " + this.getVille());
		}
}
 
  

 