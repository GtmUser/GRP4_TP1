package controler;

/**
 * Classe qui caracterise un client
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class Client extends Personne {

	/**
	 * Categorie de client (Particulier, Entreprise)
	 */
	private String categorieClient;

	/**
	 * Identifiant de client (cl� unique)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (cl� �trang�re)
	 */
	private String idConseiller; 
	
	
	/**
	 * Constructeur par d�faut de la classe Client
	 * 
	 */
	
	public Client() {
		
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdCompte(String idClient) {
		this.idClient = idClient;
	}

	public String getCategorieClient() {
		return categorieClient;
	}

	public void setCategorieClient(String categorieClient) {
		this.categorieClient = categorieClient;
	}

	
	public String getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}

	/**
	 * m�thode permettant de cr�er un client
	 * 
	 */
	
	public void creerClient() {}
		
	/**
	 * m�thode permettant de lire les information du client (ses coordonn�es)
	 * 
	 */
	
	public void lireClient() {}
	
	/**
	 * m�thode permettant de modifier les informations du client (ses coordonn�es)
	 * 
	 */
	
	public void modifierClient() {}
	
	/**
	 * m�thode permettant de supprimer les informations du client (ses coordonn�es)
	 * 
	 */
	
	public void supprimerClient() {}
	
}
