package controler;
/**
 * Classe qui caract�rise un conseiller
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
	 * Constructeur par d�faut de la classe Conseiller
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
	 * m�thode permettant d'afficher les r�sultats de la simulation de cr�dit
	 * 
	 * 
	 */
	
	public void afficherResultatSimCredit (){}
	
	/**
	 * m�thode permettant de confirmer le virement
	 * 
	 */
	
	public void confirmerVirement(){}
	
	/**
	 * m�thode permettant la gestion de patrimoine
	 * 
	 */
	
	public void validerPatrimoine(){}
	
	/**
	 * m�thode qui valide la demande de cr�ation d'une carte bancaire
	 * 
	 */
	
	public void validerCarte(){}
	
	/**
	 * m�thode validant la demande de cr�ation de compte
	 * 
	 */
	
	public void confirmerCreationCompte(){}
	
	/**
	 * m�thode validant la demande de suppression de compte
	 * 
	 */
	
	public void confirmerSupressionCompte(){}
	
	/**
	 * m�thode validant la demande de modification de compte
	 * 
	 */
	
	public void confirmerModificationCompte(){}
	
	/**
	 * m�thode qui restreint la liste de clients d'un conseiller � 10 personnes
	 * 
	 */
	
	public void calculLimiteClients(){}
	
	/**
	 * m�thode qui permet d'afficher les donn�es relatives au compte d'un client
	 * 
	 */
	
	public void afficherInfosCompte(){}
	
}