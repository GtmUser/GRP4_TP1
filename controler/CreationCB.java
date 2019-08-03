package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise la cr�ation de carte bancaire
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class CreationCB {
	
	private static Logger logger = Logger.getLogger(controler.CreationCB.class);

	/**
	 * Constructeur par d�faut de la classe CreationCB
	 * 
	 */
	public CreationCB() {
		logger.debug("je suis dans le constructeur CreationCB");
	}
	
	/**
	 * m�thode permettant de choisir la carte bancaire (carte VISA Electron, Carte VISA Premier)
	 * 
	 */
	
	public void choisirTypeCB() {}
		
	/**
	 * m�thode permettant de valider le choix de la carte bancaire
	 * 
	 */
	
	public void validerChoixCB() {}
	
	/**
	 * m�thode permettant de s'assurer que la carte bancaire est bien associ�e � un compte courant
	 * 
	 */
	
	public void associerCompteCourant() {}
}
