package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise une création de client
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class CreationClient {
	private static Logger logger = Logger.getLogger(controler.CreationClient.class);
	
	/**
	 * Identifiant de client (clé étrangère)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (clé étrangère)
	 */
	private String idConseiller; 
	/**
	 * Constructeur par défaut de la classe CreationClient
	 *  
	 */
	public CreationClient() {
		logger.debug("je suis dans le constructeur CreationClient");
	}

	public String getIdConseiller() {
		return idConseiller;
	}

	public void setIdCompte(String idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	/**
	 * méthode permettant d'accéder au formulaire de saisie pour créer le client
	 * 
	 */
	
	public void accedFormulaireSaisieClient() {}
	
	/**
	 * méthode permettant de saisir les informations du nouveau client
	 * 
	 */
	
	public void saisirInfosClient() {}
	
	/**
	 * méthode permettant de choisir le type de compte voulu (courant, épargne)
	 * 
	 */
	
	public void choisirTypeCompte() {}

	/**
	 * méthode permettant de valider la saisie des informations du client
	 * 
	 */
	
	public void validerInfos() {}

}
