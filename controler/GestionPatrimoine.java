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
	 * Constructeur par d�faut de la classe gestion de patrimoine
	 * 
	 */
	public GestionPatrimoine() {
		logger.debug("je suis dans le constructeur GestionPatrimoine");
	}

	/**
	 * m�thode permettant d'afficher la liste des comptes clients
	 * 
	 */
	
	public void afficherListeCompteClient() {}
		
	/**
	 * m�thode permettant d'analyser les soldes des comptes de la liste
	 * 
	 */
	
	public void analyserSoldesComptes() {}
	
	/**
	 * m�thode permettant de s�lectionner les comptes des clients fortun�s
	 * 
	 */
	
	public void selectCompteClient() {}
	
	/**
	 * m�thode permettant de valider la s�lection 
	 * 
	 */
	
	public void validerSelect() {}

	/**
	 * m�thode permettant de lancer les proc�dures de gestion de patrimoine
	 * 
	 */
	
	public void lancerProcedPlacement() {}
	
}
