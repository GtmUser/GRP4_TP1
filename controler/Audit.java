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
	 * Constructeur par défaut de la classe Audit
	 * 
	 */
	public Audit() {
		logger.debug("je suis dans le constructeur Audit");
	}

	/**
	 * méthode permettant de lancer l'audit
	 * 
	 */
	
	public void lancerProcedureAudit() {}
		
	/**
	 * méthode permettant de calculer le nombre de clients inscrits dans l'agence
	 * 
	 */
	
	public void calculerNbClientsAgence() {}
	
	/**
	 * méthode permettant d'identifier la catégorie (entreprise, particulier) 
	 * 
	 */
	
	public void identifierCatClient() {}
	
	/**
	 * méthode permettant de récupérer le solde du compte audité
	 * 
	 */
	
	public void recupSolde() {}

	/**
	 * méthode permettant l'ajout du compte audité dans une liste rouge (découvert autorisé dépassé)
	 * 
	 */
	
	public void ajoutClientListeRouge() {}
	
	/**
	 * méthode permettant de comptabiliser le nombre de clients total déjà audités
	 * 
	 */
	
	public void comptabiliserNbClientsAudites() {}

	/**
	 * méthode permettant d'afficer la liste rouge des clients ayant dépassé le découvert autorisé
	 * 
	 */
	
	public void afficherListeRouge() {}
		
}
