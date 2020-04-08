package maPremiereApplicationBancaire;

import myViews.GererMonPortefeuille;

public class MonApplicationBancaireFonctionne {

		public static void main (String [] args)  throws Exception { 
			
			MonPortefeuille agence1; 
			agence1 = MonPortefeuille.getInstance() ; 
		
			Client cpart1 = new CParticulier("Dupont Emma", "3 rue des fleurs", "Annecy-le-vieux", 74940, 123456, "Avocate", 34) ; 		
			CompteBancaire cb1 = new CompteBancaire(cpart1, 1234, 1500, 2000) ; 
			agence1.ajouterCompteBancaire(cb1); 
				
			cb1.verserArgent(1000);	
			cb1.retirerArgent(550);
			cb1.retirerArgent(500);

			System.out.println(cb1.toString());
			System.out.println(cb1.montantDecouvert());
			
			System.out.print ("\n");

			Client cpro1 = new CProfessionnel("GeniusDev", "5 chemin des palmiers", "Annecy-le-vieux", 74940, 234567, "Développment Web"); 
			CompteBancaire cb2 = new CompteBancaire(cpro1, 2345, 1500, 2000) ;
			agence1.ajouterCompteBancaire(cb2);					
			
			
			cb2.verserArgent(15000);
			cb2.retirerArgent(2000);
			
			System.out.println(cb2.toString());
			
			
			System.out.print ("\n");
			
			agence1.afficherPortfeuille();
			
			new GererMonPortefeuille(); 
			
		}

}