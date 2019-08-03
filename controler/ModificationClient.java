package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise une modification des informations de client
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class ModificationClient {
	
	private static Logger logger = Logger.getLogger(controler.ModificationClient.class);
	
	/**
	 * Identifiant de client (clé étrangère)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (clé étrangère)
	 */
	private String idConseiller; 
	
	/**
	 * Constructeur par défaut de la classe ModificationClient
	 *  
	 */
	public ModificationClient() {
		logger.debug("je suis dans le constructeur ModificationClient");
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
	 * méthode permettant d'afficher les informations du clients
	 * 
	 */
	
	public void afficherInfosClient() {}
	
	/**
	 * méthode permettant de saisir des modifications des infos client
	 * 
	 */
	
	public void saisirModifs() {}
	
	/**
	 * méthode permettant de valider la saisie des modifications
	 * 
	 */
	
	public void validInfos() {}

	/**
	 * méthode permettant d'effectuer la mise à jour des informations client
	 * 
	 */
	
	public void MajClient() {}

}
