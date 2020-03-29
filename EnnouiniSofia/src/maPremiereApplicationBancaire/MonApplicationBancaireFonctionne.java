package maPremiereApplicationBancaire;

public class MonApplicationBancaireFonctionne {

		public static void main (String [] args)  throws Exception { 
			
			MonPortefeuille AgenceBancaire = new MonPortefeuille() ;
		
			Client client1 = new CParticulier("Dupont Emma", "3 rue des fleurs", 123456, "Avocate", "01.01.1982") ; 
			Client client2 = new CProfessionnel("GeniusDev", "5 chemin des palmiers", 234567, "Développment Web"); 
			
			CompteBancaire cb1 = new CompteBancaire(client1, 1234, 1500, 1500, 2000) ; 
			CompteBancaire cb2 = new CompteBancaire(client2, 2345, 15000, 1500, 2000) ;
			
			AgenceBancaire.ajouterCompteBancaire(cb1); 
			AgenceBancaire.ajouterCompteBancaire(cb2); 
			
	               						
			System.out.println(cb1.toString());
			cb1.verserArgent(350);
			
			
			//cb1.retirerArgent(1000.60);
			cb1.retirerArgent(1400);
			System.out.println(cb1.montantDecouvert());
								
			System.out.print ("\n");
			
			System.out.println(cb2.toString());
			cb2.verserArgent(1720);
			
			System.out.print ("\n");
			
			AgenceBancaire.afficherPortfeuille();
		}

}