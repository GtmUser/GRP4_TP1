package controler;

/**
 * Classe qui caracterise les coordonnees d'une personne
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class Personne {
	
	/**
	 * NOM de la personne
	 */
	private String nom;
	/**
	 * Prenom de la personne
	 */
	private String prenom;
	/**
	 * Adresse de la personne (N° et Voie)
	 */
	private String adresse;
	/**
	 * Ville de residence de la personne
	 */
	private	String ville;
	/**
	 * Code Postal de la Ville
	 */
	private	int cp;
	/**
	 * Numero de telephone sans espaces ni points
	 */
	private int tel;
	
	/**
	 * Constructeur par défaut de la classe Personne 
	 * 
	 */
	public Personne() {
	 }

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
