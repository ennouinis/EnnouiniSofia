package maPremiereApplicationBancaire;
import java.util.ArrayList;

public class MonPortefeuille {

	private ArrayList <CompteBancaire> comptesBancaires = new ArrayList <CompteBancaire>() ;

	public ArrayList<CompteBancaire> getComptesBancaires() {
		return comptesBancaires;
	}

	public void setComptesBancaires(ArrayList<CompteBancaire> ComptesBancaires) {
		this.comptesBancaires = ComptesBancaires;
	} 
		
	public void afficherPortfeuille() { 
		System.out.println ("Mon portefeuille : ");
		for (int i = 0 ; i<this.getComptesBancaires().size() ; i++) { 
			System.out.println(this.getComptesBancaires().get(i).toString()) ; 
		}
	}

	public void ajouterCompteBancaire(CompteBancaire e){
		this.comptesBancaires.add(e);
		}
	

	public void cloturerCompteBancaire(CompteBancaire e){
		this.comptesBancaires.remove(e);
		}
	} 