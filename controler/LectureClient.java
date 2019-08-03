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
	 * Identifiant de client (cl� �trang�re)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (cl� �trang�re)
	 */
	private String idConseiller; 
	
	/**
	 * Constructeur par d�faut de la classe LectureClient
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
	 * m�thode permettant d'afficher la liste des clients
	 * 
	 */
	
	public void affichListeClients() {}
	
	/**
	 * m�thode permettant de s�lectionner le client dont on souhaite voir les informations
	 * 
	 */
	
	public void selectClient() {}
	
	
	/**
	 * m�thode permettant d'afficher les informations du client
	 * 
	 */
	
	public void affichInfosClient() {}
}
