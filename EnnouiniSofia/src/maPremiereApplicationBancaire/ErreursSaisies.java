package maPremiereApplicationBancaire;

public class ErreursSaisies extends Exception {
	
	public ErreursSaisies (){
		super ();
	}
	
	public ErreursSaisies (String cb) {
		super (cb); 
	}
	

}
