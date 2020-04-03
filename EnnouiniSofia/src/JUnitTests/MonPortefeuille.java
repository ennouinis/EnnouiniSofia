package JUnitTests;

import java.util.ArrayList;

public class MonPortefeuille { 
	
//Cr�� un objet statique :
static MonPortefeuille agence1 = new MonPortefeuille(); 

//Constructeur priv� vide : 
private MonPortefeuille() { 
	
}
//M�thode : 
public static MonPortefeuille getInstance () { 
	return agence1 ;
}

private ArrayList <Compte> comptesBancaires = new ArrayList <Compte>() ;

public ArrayList<Compte> getComptesBancaires() {
	return comptesBancaires;
}

public void setComptesBancaires(ArrayList<Compte> ComptesBancaires) {
	this.comptesBancaires = ComptesBancaires;
} 
	
public void afficherPortfeuille() { 
	System.out.println ("Mon portefeuille : ");
	for (int i = 0 ; i<this.getComptesBancaires().size() ; i++) { 
		System.out.println(this.getComptesBancaires().get(i).toString()) ; 
	}
}

public void ajouterCompte(Compte e){
	this.comptesBancaires.add(e);
	}


public void cloturerCompte(Compte e){
	this.comptesBancaires.remove(e);
	}
} 