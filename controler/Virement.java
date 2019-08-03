package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise un virement
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class Virement {
	
	private static Logger logger = Logger.getLogger(controler.Virement.class);
	
	/**
	 * Identifiant de compte (clé étrangère)
	 */
	private String idCompte;

	/**
	 * Identifiant d'une opération de virement (clé unique)
	 */
	private String idVirement; 
	
	/**
	 * Identifiant de conseiller (clé étrangère)
	 */
	private String idConseiller; 

	/**
	 * Constructeur par défaut de la classe Virement
	 * 
	 */
	public Virement() {
		logger.debug("je suis dans le constructeur Virement");
	}

	public String getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}

	public String getIdVirement() {
		return idVirement;
	}

	public void setIdVirement(String idVirement) {
		this.idVirement = idVirement;
	}

	public String getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}
	
	/**
	 * méthode permettant de sélectionner le compte émetteur
	 * 
	 */
	
	public void selectCompteEmetteur() {}
		
	/**
	 * méthode permettant de saisir le numéro de compte du destinataire
	 * 
	 */
	
	public void saisirNumDestinataire() {}
	
	/**
	 * méthode permettant de saisir la somme à transférer
	 * 
	 */
	
	public void saisirSomme() {}
	
	/**
	 * méthode permettant de valider que le virement sera effectué
	 * 
	 */
	
	public void validerVirement() {}

	
}
