package controler;

/**
 * Classe qui caractérise un gérant
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class Gerant extends EmployeDeBanque {

	/**
	 * identifiant du gérant
	 */
	private String idGerant;
	
	/**
	 * identifiant correspondant à une audit effectuée sur tous le comptes d'une agence
	 */
	private String idAudit;
	
	/**
	 * Constructeur par défaut de la classe Gerant
	 * 
	 */
	
	public Gerant (){
		
	}


	public String getIdGerant() {
		return idGerant;
	}


	public void setIdGerant(String idGerant) {
		this.idGerant = idGerant;
	}


	public String getIdAudit() {
		return idAudit;
	}


	public void setIdAudit(String idAudit) {
		this.idAudit = idAudit;
	}

	/**
	 * méthode permettant au gérant de recevoir le résultat final d'un audit (liste de clients ayant dépassé le débit maximal autorisé)
	 * 
	 */
	public void recevoirResultatAudit(){}
}
