package designPatternsMesOperationsBancaires;

public class VerificationCode {


		    private int codeSecurite = 0000 ;

		    public int getCodeSecurite() { 
		    	return codeSecurite; 
		    	}

		    public boolean CodeValide (int codeAVerifier){

		        if(codeAVerifier == getCodeSecurite()) {

		            return true;

		        } else {

		            return false;

		        }

		}

}
