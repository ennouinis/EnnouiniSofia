package maPremiereApplicationBancaire;

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
				controle(age);
			} catch (ErreursSaisies e) {
				e.printStackTrace();
			}
			if (age>=18) {
				this.age = age;
			}
		}
		
		    public CParticulier(String nom, String adresse, String ville, int cp, int nni, String profession, int age) {
		        super(nom, adresse, ville, cp);
		        this.nni = nni;
		        this.profession = profession ;
		        this.age = age ; 
		        try {
					controle(age);
				} catch (ErreursSaisies e) {
					e.printStackTrace();
				} 
		    }
		    
		    public static void controle (int age) throws ErreursSaisies { 
		    	if (age<18) {
		    		throw new ErreursSaisies ("Ce client n'a pas l'âge légal pour ouvrir un compte bancaire.");
		    	}
		    }
		 
	}
