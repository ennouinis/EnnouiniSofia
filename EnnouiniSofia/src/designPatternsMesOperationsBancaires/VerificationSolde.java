package designPatternsMesOperationsBancaires;

public class VerificationSolde {


		    private double soldeBancaire = 900.00;

		    public double getSoldeBancaire() { 
		    	return soldeBancaire; 
		    	}

		    public void retirerArgent(double montantRetrait) { 
		    	soldeBancaire -= montantRetrait; 
		    	}

		    public void verserArgent(double montantVersement) { 
		    	soldeBancaire += montantVersement; 
		    	}

		    public boolean soldeSuffisant(double montantRetrait) {

		        if(montantRetrait > getSoldeBancaire()) {
		            System.out.println("Votre solde est insuffisant ! ");
		            System.out.println("Solde actuel : " + getSoldeBancaire());

		            return false;

		        } else {

		        	retirerArgent(montantRetrait);

		            System.out.println("Veuillez récupérer votre argent.");
		            System.out.println("Solde actuel : " + getSoldeBancaire());

		            return true;

		        }

		    }

		    public void effectuerVersement(double montantVersement) {

		    	verserArgent(montantVersement);

		        System.out.println("Versement effectué : " + getSoldeBancaire());

		}

	}
