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
	 * Identifiant de compte (cl� �trang�re)
	 */
	private String idCompte;

	/**
	 * Identifiant d'une op�ration de virement (cl� unique)
	 */
	private String idVirement; 
	
	/**
	 * Identifiant de conseiller (cl� �trang�re)
	 */
	private String idConseiller; 

	/**
	 * Constructeur par d�faut de la classe Virement
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
	 * m�thode permettant de s�lectionner le compte �metteur
	 * 
	 */
	
	public void selectCompteEmetteur() {}
		
	/**
	 * m�thode permettant de saisir le num�ro de compte du destinataire
	 * 
	 */
	
	public void saisirNumDestinataire() {}
	
	/**
	 * m�thode permettant de saisir la somme � transf�rer
	 * 
	 */
	
	public void saisirSomme() {}
	
	/**
	 * m�thode permettant de valider que le virement sera effectu�
	 * 
	 */
	
	public void validerVirement() {}

	
}
