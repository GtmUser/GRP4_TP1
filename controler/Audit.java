package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise un audit
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class Audit {
	private static Logger logger = Logger.getLogger(controler.Audit.class);

	/**
	 * Constructeur par d�faut de la classe Audit
	 * 
	 */
	public Audit() {
		logger.debug("je suis dans le constructeur Audit");
	}

	/**
	 * m�thode permettant de lancer l'audit
	 * 
	 */
	
	public void lancerProcedureAudit() {}
		
	/**
	 * m�thode permettant de calculer le nombre de clients inscrits dans l'agence
	 * 
	 */
	
	public void calculerNbClientsAgence() {}
	
	/**
	 * m�thode permettant d'identifier la cat�gorie (entreprise, particulier) 
	 * 
	 */
	
	public void identifierCatClient() {}
	
	/**
	 * m�thode permettant de r�cup�rer le solde du compte audit�
	 * 
	 */
	
	public void recupSolde() {}

	/**
	 * m�thode permettant l'ajout du compte audit� dans une liste rouge (d�couvert autoris� d�pass�)
	 * 
	 */
	
	public void ajoutClientListeRouge() {}
	
	/**
	 * m�thode permettant de comptabiliser le nombre de clients total d�j� audit�s
	 * 
	 */
	
	public void comptabiliserNbClientsAudites() {}

	/**
	 * m�thode permettant d'afficer la liste rouge des clients ayant d�pass� le d�couvert autoris�
	 * 
	 */
	
	public void afficherListeRouge() {}
		
}
