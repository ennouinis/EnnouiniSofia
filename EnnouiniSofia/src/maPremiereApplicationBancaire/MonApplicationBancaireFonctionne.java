package maPremiereApplicationBancaire;

import myViews.MaBanque;

public class MonApplicationBancaireFonctionne {

		public static void main (String [] args)  throws Exception { 
			
			MonPortefeuille AgenceBancaire = new MonPortefeuille() ;
		
			Client cpart = new CParticulier("Dupont Emma", "3 rue des fleurs", "Annecy-le-vieux", 74940, 123456, "Avocate", 34) ; 
			Client cpro = new CProfessionnel("GeniusDev", "5 chemin des palmiers", "Annecy-le-vieux", 74940, 234567, "Développment Web"); 
			
			CompteBancaire cb1 = new CompteBancaire(cpart, 1234, 1500, 1500, 2000) ; 
			CompteBancaire cb2 = new CompteBancaire(cpro, 2345, 15000, 1500, 2000) ;
			
			AgenceBancaire.ajouterCompteBancaire(cb1); 
			AgenceBancaire.ajouterCompteBancaire(cb2); 
			
	               						
			System.out.println(cb1.toString());
			cb1.verserArgent(350);
			
			
			cb1.retirerArgent(1000.60);
			cb1.retirerArgent(1400);
			System.out.println(cb1.montantDecouvert());
								
			System.out.print ("\n");
			
			System.out.println(cb2.toString());
			cb2.verserArgent(1720);
			
			System.out.print ("\n");
			
			AgenceBancaire.afficherPortfeuille();
			
			new MaBanque(); 

		}

}