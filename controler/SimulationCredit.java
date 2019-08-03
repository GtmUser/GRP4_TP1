package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise une simulation de cr�dit
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class SimulationCredit {
	
	private static Logger logger = Logger.getLogger(controler.SimulationCredit.class);

	/**
	 * Categorie de client (Particulier, Entreprise)
	 */
	private String idConseiller;

	/**
	 * Identifiant de client (cl� unique)
	 */
	private int idCompte;
	
	/**
	 * Constructeur par d�faut de la simulation cr�dit
	 * 
	 */
	public SimulationCredit() {
		logger.debug("je suis dans le constructeur SimulationCredit");
	} 

	public String getIdConseiller() {
		logger.debug("je suis dans le getidconseiller");
		return idConseiller;

	}

	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	
	/**
	 * m�thode permettant d'afficher le menu pour simuler un cr�dit
	 * 
	 */
	
	public void afficherFormulaireCredit() {}
		
	/**
	 * m�thode permettant la saisie des infos n�cessaires pour la simulation
	 * 
	 */
	
	public void saisirInfosCredit() {}
	
	/**
	 * m�thode permettant de valider la saisie
	 * 
	 */
	
	public void validerInformations() {}
	
	/**
	 * m�thode permettant de g�n�rer la simulation de cr�dit
	 * 
	 */
	
	public void realiserSimulation() {}

	/**
	 * m�thode permettant retourner le r�sultat de la simulation
	 * 
	 */
	
	public void obtenirResultats() {}
	
}
