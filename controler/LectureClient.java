package controler;
import org.apache.log4j.Logger;
/**
 * Classe qui caracterise la lecture des informations du client
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class LectureClient {

	private static Logger logger = Logger.getLogger(controler.LectureClient.class);
	
	/**
	 * Identifiant de client (clé étrangère)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (clé étrangère)
	 */
	private String idConseiller; 
	
	/**
	 * Constructeur par défaut de la classe LectureClient
	 *  
	 */
	public LectureClient() {
		logger.debug("je suis dans le constructeur LectureClient");
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
	 * méthode permettant d'afficher la liste des clients
	 * 
	 */
	
	public void affichListeClients() {}
	
	/**
	 * méthode permettant de sélectionner le client dont on souhaite voir les informations
	 * 
	 */
	
	public void selectClient() {}
	
	
	/**
	 * méthode permettant d'afficher les informations du client
	 * 
	 */
	
	public void affichInfosClient() {}
}
