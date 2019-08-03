package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise une simulation de crédit
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
	 * Identifiant de client (clé unique)
	 */
	private int idCompte;
	
	/**
	 * Constructeur par défaut de la simulation crédit
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
	 * méthode permettant d'afficher le menu pour simuler un crédit
	 * 
	 */
	
	public void afficherFormulaireCredit() {}
		
	/**
	 * méthode permettant la saisie des infos nécessaires pour la simulation
	 * 
	 */
	
	public void saisirInfosCredit() {}
	
	/**
	 * méthode permettant de valider la saisie
	 * 
	 */
	
	public void validerInformations() {}
	
	/**
	 * méthode permettant de générer la simulation de crédit
	 * 
	 */
	
	public void realiserSimulation() {}

	/**
	 * méthode permettant retourner le résultat de la simulation
	 * 
	 */
	
	public void obtenirResultats() {}
	
}
