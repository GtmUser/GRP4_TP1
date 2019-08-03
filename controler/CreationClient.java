package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise une cr�ation de client
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class CreationClient {
	private static Logger logger = Logger.getLogger(controler.CreationClient.class);
	
	/**
	 * Identifiant de client (cl� �trang�re)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (cl� �trang�re)
	 */
	private String idConseiller; 
	/**
	 * Constructeur par d�faut de la classe CreationClient
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
	 * m�thode permettant d'acc�der au formulaire de saisie pour cr�er le client
	 * 
	 */
	
	public void accedFormulaireSaisieClient() {}
	
	/**
	 * m�thode permettant de saisir les informations du nouveau client
	 * 
	 */
	
	public void saisirInfosClient() {}
	
	/**
	 * m�thode permettant de choisir le type de compte voulu (courant, �pargne)
	 * 
	 */
	
	public void choisirTypeCompte() {}

	/**
	 * m�thode permettant de valider la saisie des informations du client
	 * 
	 */
	
	public void validerInfos() {}

}
