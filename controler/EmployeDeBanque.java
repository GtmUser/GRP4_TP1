package controler;
/**
 * Classe qui caracterise un employe de banque
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class EmployeDeBanque extends Personne {

	/**
	 * nom d'utilisateur de l'employé pour accès BDD
	 */
	private String login;
	
	/**
	 * mot de passe de l'employé pour accès BDD
	 */
	private String password;
	
	
	public EmployeDeBanque (){
		
	}
	
		
	public String getLogin() {
		return login;
	}
	
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
}