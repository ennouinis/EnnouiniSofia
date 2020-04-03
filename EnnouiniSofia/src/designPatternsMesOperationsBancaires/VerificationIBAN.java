package designPatternsMesOperationsBancaires;

public class VerificationIBAN {

		    private int numeroIBAN = 123456 ;

		    public int getNumeroIBAN() { return numeroIBAN; }

		    public boolean compteActif (int iBANAVerifier){

		        if(iBANAVerifier == getNumeroIBAN()) {

		            return true;

		        } else {

		            return false;

		        }

		    }
	
}
