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
	 * Identifiant de client (clé unique)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (clé étrangère)
	 */
	private String idConseiller; 
	
	
	/**
	 * Constructeur par défaut de la classe Client
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
	 * méthode permettant de créer un client
	 * 
	 */
	
	public void creerClient() {}
		
	/**
	 * méthode permettant de lire les information du client (ses coordonnées)
	 * 
	 */
	
	public void lireClient() {}
	
	/**
	 * méthode permettant de modifier les informations du client (ses coordonnées)
	 * 
	 */
	
	public void modifierClient() {}
	
	/**
	 * méthode permettant de supprimer les informations du client (ses coordonnées)
	 * 
	 */
	
	public void supprimerClient() {}
	
}
