package maPremiereApplicationBancaire;

public class User {
	
	private String username, password, iD;
	
	public User (String username, String password, String iD) { 
		this.username = username ;
		this.password = password; 
		this.iD = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getID() { 
		return iD;
	}
	
	public void setID (String iD) { 
		this.iD = iD;
	}
	

}
