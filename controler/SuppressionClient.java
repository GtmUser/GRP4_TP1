package controler;
import org.apache.log4j.Logger;
/**
 * Classe qui caracterise une supression de client
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class SuppressionClient {

	private static Logger logger = Logger.getLogger(controler.SuppressionClient.class);

	/**
	 * Identifiant de client (clé étrangère)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (clé étrangère)
	 */
	private String idConseiller; 
	
	/**
	 * Constructeur par défaut de la classe SuppressionClient
	 *  
	 */
	public SuppressionClient() {
		logger.debug("je suis dans le constructeur SuppressionClient");
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
	 * méthode permettant de demander la suppression du client
	 * 
	 */
	
	public void demandSupprClient() {}
	
	/**
	 * méthode permettant de valider la suppression du client
	 * 
	 */
	
	public void validSuppr() {}
	
	/**
	 * méthode permettant de supprimer tous les comptes associés au client
	 * 
	 */
	
	public void supprTousLesComptes() {}

	/**
	 * méthode permettant de désactiver la carte bancaire associée au compte courant
	 * 
	 */
	
	public void desactivCB() {}

}
