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
	 * Identifiant de client (cl� �trang�re)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (cl� �trang�re)
	 */
	private String idConseiller; 
	
	/**
	 * Constructeur par d�faut de la classe SuppressionClient
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
	 * m�thode permettant de demander la suppression du client
	 * 
	 */
	
	public void demandSupprClient() {}
	
	/**
	 * m�thode permettant de valider la suppression du client
	 * 
	 */
	
	public void validSuppr() {}
	
	/**
	 * m�thode permettant de supprimer tous les comptes associ�s au client
	 * 
	 */
	
	public void supprTousLesComptes() {}

	/**
	 * m�thode permettant de d�sactiver la carte bancaire associ�e au compte courant
	 * 
	 */
	
	public void desactivCB() {}

}
