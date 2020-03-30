package maPremiereApplicationBancaire;

public class CParticulier extends Client {

		private int nni ;
	    private String profession, dtNaissance; 

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
		     
		public String getDtNaissance() {
			return dtNaissance;
		}

		public void setDtNaissance(String dtNaissance) {
			this.dtNaissance = dtNaissance;
		}
		
		    public CParticulier(String nom, String adresse, String ville, int cp, int nni, String profession, String dtNaissance) {
		        super(nom, adresse, ville, cp);
		        this.nni = nni;
		        this.profession = profession ;
		        this.setDtNaissance(dtNaissance) ; 
		    }
		 
	}
