package controler;

/**
 * Classe qui caract�rise un g�rant
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */

public class Gerant extends EmployeDeBanque {

	/**
	 * identifiant du g�rant
	 */
	private String idGerant;
	
	/**
	 * identifiant correspondant � une audit effectu�e sur tous le comptes d'une agence
	 */
	private String idAudit;
	
	/**
	 * Constructeur par d�faut de la classe Gerant
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
	 * m�thode permettant au g�rant de recevoir le r�sultat final d'un audit (liste de clients ayant d�pass� le d�bit maximal autoris�)
	 * 
	 */
	public void recevoirResultatAudit(){}
}
