package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise une gestion de patrimoine
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class GestionPatrimoine {
	
	private static Logger logger = Logger.getLogger(controler.GestionPatrimoine.class);
	
	/**
	 * Constructeur par défaut de la classe gestion de patrimoine
	 * 
	 */
	public GestionPatrimoine() {
		logger.debug("je suis dans le constructeur GestionPatrimoine");
	}

	/**
	 * méthode permettant d'afficher la liste des comptes clients
	 * 
	 */
	
	public void afficherListeCompteClient() {}
		
	/**
	 * méthode permettant d'analyser les soldes des comptes de la liste
	 * 
	 */
	
	public void analyserSoldesComptes() {}
	
	/**
	 * méthode permettant de sélectionner les comptes des clients fortunés
	 * 
	 */
	
	public void selectCompteClient() {}
	
	/**
	 * méthode permettant de valider la sélection 
	 * 
	 */
	
	public void validerSelect() {}

	/**
	 * méthode permettant de lancer les procédures de gestion de patrimoine
	 * 
	 */
	
	public void lancerProcedPlacement() {}
	
}
