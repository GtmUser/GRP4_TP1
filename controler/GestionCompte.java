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
	 * Identifiant de compte (cl� unique)
	 */
	private String idCompte;

	/**
	 * Identifiant de client (cl� �trang�re)
	 */
	private String idClient; 
	
	/**
	 * Identifiant de conseiller (cl� �trang�re)
	 */
	private String idConseiller; 

	/**
	 * Identifiant de virement (cl� �trang�re)
	 */
	private String idVirement;

	/**
	 * Identifiant de Audit (cl� �trang�re)
	 */
	private String idAudit; 
	
	/**
	 * Identifiant de gestion de patrimoine (cl� �trang�re)
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
	 * Taux de r�muneration
	 */
	private int tauxRemuneration;
	
	/** 
	 * Autorisation de d�couvert
	 */
	private int autorisationDecouvert;
	
	/**
	 * Constructeur par d�faut de la classe gestion de compte
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
	 * m�thode permettant de calculer le solde du compte
	 * 
	 */
	
	public void calculerSoldeCompte() {}
		
	/**
	 * m�thode permettant de consulter le compte pour la simulation de cr�dit
	 * 
	 */
	
	public void analyserCompteSimCredit() {}
		
	/**
	 * m�thode permettant de consulter le compte afin de faire un virement
	 * 
	 */
	
	public void consulterComptePrVirement() {}
	
	/**
	 * m�thode permettant d'analyser le compte pour un audit
	 * 
	 */
	
	public void analyserComptePrAudit() {}
	
	/**
	 * m�thode permettant de consulter le compte afin de faire une gestion de patrimoine
	 * 
	 */
	
	public void verifierComptePrPatrimoine() {}

	/**
	 * m�thode permettant de v�rifier que la CB est associ�e � un compte
	 * 
	 */
	
	public void verifierAssociationCarte() {}
}