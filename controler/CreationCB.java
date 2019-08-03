package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise la création de carte bancaire
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class CreationCB {
	
	private static Logger logger = Logger.getLogger(controler.CreationCB.class);

	/**
	 * Constructeur par défaut de la classe CreationCB
	 * 
	 */
	public CreationCB() {
		logger.debug("je suis dans le constructeur CreationCB");
	}
	
	/**
	 * méthode permettant de choisir la carte bancaire (carte VISA Electron, Carte VISA Premier)
	 * 
	 */
	
	public void choisirTypeCB() {}
		
	/**
	 * méthode permettant de valider le choix de la carte bancaire
	 * 
	 */
	
	public void validerChoixCB() {}
	
	/**
	 * méthode permettant de s'assurer que la carte bancaire est bien associée à un compte courant
	 * 
	 */
	
	public void associerCompteCourant() {}
}
