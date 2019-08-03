package controler;
import org.apache.log4j.Logger;

/**
 * Classe qui caracterise une gestion de compte
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class GestionCompte {
	 
	private static Logger logger = Logger.getLogger(controler.GestionCompte.class);
	
	/**
	 * Identifiant de compte (clé unique)
	 */
	private String idCompte;

	/**
	 * Identifiant de client (clé étrangère)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (clé étrangère)
	 */
	private String idConseiller; 

	/**
	 * Identifiant de virement (clé étrangère)
	 */
	private String idVirement;

	/**
	 * Identifiant de Audit (clé étrangère)
	 */
	private String idAudit; 
	
	/**
	 * Identifiant de gestion de patrimoine (clé étrangère)
	 */
	private String idGestionDePatrimoine;
	
	/**
	 * Type de compte (Epargne, Courant)
	 */
	private String typeCompte;

	/**
	 * Type de compte (VISA Electron, VISA Premier)
	 */
	private String typeCarte;
	
	/**
	 * Date d'ouverture du compte bancaire
	 */
	private String dateOuvertureCompte;

	/**
	 * Taux de rémuneration
	 */
	private int tauxRemuneration;
	
	/** 
	 * Autorisation de découvert
	 */
	private int autorisationDecouvert;
	
	/**
	 * Constructeur par défaut de la classe gestion de compte
	 * 
	 */
	public GestionCompte() {
		logger.debug("je suis dans le constructeur GestionCompte");
	}
	

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}

	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}

	public String getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getIdVirement() {
		return idVirement;
	}

	public void setIdVirement(String idVirement) {
		this.idVirement = idVirement;
	}

	public String getIdAudit() {
		return idAudit;
	}

	public void setIdAudit(String idAudit) {
		this.idAudit = idAudit;
	}

	public String getIdGestionDePatrimoine() {
		return idGestionDePatrimoine;
	}

	public void setIdGestionDePatrimoine(String idGestionDePatrimoine) {
		this.idGestionDePatrimoine = idGestionDePatrimoine;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	public int getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	public void setAutorisationDecouvert(int autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}
	
	/**
	 * méthode permettant de calculer le solde du compte
	 * 
	 */
	
	public void calculerSoldeCompte() {}
		
	/**
	 * méthode permettant de consulter le compte pour la simulation de crédit
	 * 
	 */
	
	public void analyserCompteSimCredit() {}
		
	/**
	 * méthode permettant de consulter le compte afin de faire un virement
	 * 
	 */
	
	public void consulterComptePrVirement() {}
	
	/**
	 * méthode permettant d'analyser le compte pour un audit
	 * 
	 */
	
	public void analyserComptePrAudit() {}
	
	/**
	 * méthode permettant de consulter le compte afin de faire une gestion de patrimoine
	 * 
	 */
	
	public void verifierComptePrPatrimoine() {}

	/**
	 * méthode permettant de vérifier que la CB est associée à un compte
	 * 
	 */
	
	public void verifierAssociationCarte() {}
}