package controler;
/**
 * Classe qui caractérise un conseiller
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class Conseiller extends EmployeDeBanque {

	/**
	 * Identifiant d'un conseiller
	 */
	private String idConseiller;
	
	/**
	 * Constructeur par défaut de la classe Conseiller
	 * 
	 */
	
	public Conseiller (){
		
	}


	public String getIdConseiller() {
		return idConseiller;
	}


	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}
	
	/**
	 * méthode permettant d'afficher les résultats de la simulation de crédit
	 * 
	 * 
	 */
	
	public void afficherResultatSimCredit (){}
	
	/**
	 * méthode permettant de confirmer le virement
	 * 
	 */
	
	public void confirmerVirement(){}
	
	/**
	 * méthode permettant la gestion de patrimoine
	 * 
	 */
	
	public void validerPatrimoine(){}
	
	/**
	 * méthode qui valide la demande de création d'une carte bancaire
	 * 
	 */
	
	public void validerCarte(){}
	
	/**
	 * méthode validant la demande de création de compte
	 * 
	 */
	
	public void confirmerCreationCompte(){}
	
	/**
	 * méthode validant la demande de suppression de compte
	 * 
	 */
	
	public void confirmerSupressionCompte(){}
	
	/**
	 * méthode validant la demande de modification de compte
	 * 
	 */
	
	public void confirmerModificationCompte(){}
	
	/**
	 * méthode qui restreint la liste de clients d'un conseiller à 10 personnes
	 * 
	 */
	
	public void calculLimiteClients(){}
	
	/**
	 * méthode qui permet d'afficher les données relatives au compte d'un client
	 * 
	 */
	
	public void afficherInfosCompte(){}
	
}