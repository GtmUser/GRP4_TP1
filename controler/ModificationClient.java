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
	 * Identifiant de client (cl� �trang�re)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (cl� �trang�re)
	 */
	private String idConseiller; 
	
	/**
	 * Constructeur par d�faut de la classe ModificationClient
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
	 * m�thode permettant d'afficher les informations du clients
	 * 
	 */
	
	public void afficherInfosClient() {}
	
	/**
	 * m�thode permettant de saisir des modifications des infos client
	 * 
	 */
	
	public void saisirModifs() {}
	
	/**
	 * m�thode permettant de valider la saisie des modifications
	 * 
	 */
	
	public void validInfos() {}

	/**
	 * m�thode permettant d'effectuer la mise � jour des informations client
	 * 
	 */
	
	public void MajClient() {}

}
