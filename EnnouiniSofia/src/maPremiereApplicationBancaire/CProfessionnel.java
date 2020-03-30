package maPremiereApplicationBancaire;

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
	     
	    public CProfessionnel(String nom, String adresse, String ville, int cp, int nSIRET, String activitePrincipale) {
	        super(nom, adresse, ville, cp);
	        this.nSIRET = nSIRET;
	        this.activitePrincipale = activitePrincipale ;
	    }
	 
}
