package mesOperationsBancaires;

public class CompteBancaireFacade {

	    private int numeroIBAN;
	    private int codeSecurite;

	    VerificationIBAN verifIBAN;
	
	    VerificationCode verifCode;

	    VerificationSolde verifSolde;

	    BanqueAnnecienne banqueAnnecienne;

	    public CompteBancaireFacade (int numeroIBAN, int codeSecurite){

	    	this.numeroIBAN = numeroIBAN ;
	        this.codeSecurite = codeSecurite;
	        
	        banqueAnnecienne = new BanqueAnnecienne();
	        verifIBAN = new VerificationIBAN();
	        verifCode = new VerificationCode();
	        verifSolde = new VerificationSolde();

	    }

	    public int getNumeroIBAN() { return numeroIBAN; }

	    public int getCodeSecurite() { return codeSecurite; }

	    public void retirerArgent(double montantRetrait){
	    			if(verifIBAN.compteActif(getNumeroIBAN()) &&
	                verifCode.CodeValide(getCodeSecurite()) &&
	                verifSolde.soldeSuffisant(montantRetrait)) {

	                    System.out.println("Retrait effectué avec succès. ");

	                } else {

	                    System.out.println("Echec de retrait. Solde insuffisant.");

	                }

	    }

	    public void verserArgent(double montantVersement){

	        if(verifIBAN.compteActif(getNumeroIBAN()) &&

	                verifCode.CodeValide(getCodeSecurite())) {

	                    verifSolde.effectuerVersement(montantVersement);

	                    System.out.println("Versement effectué avec succès.");

	                } else {

	                    System.out.println("Echec de versement, veuillez récupérer votre argent. ");
	    }
	}


}
