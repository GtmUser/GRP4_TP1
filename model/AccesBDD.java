package model;
import java.sql.*;

/**
 * Classe qui caracterise la connexion et la deconnexion de la base de données
 * 
 * @author Anne LACROUTE, Housseyn BOUDJENANE
 * @version 1.0
 *
 */
public class AccesBDD {
	
	/**
	 * Identifiant de connexion (user)
	 */	
	private String user;

	/**
	 * Mot de passe de connexion (pwd)
	 */	
	private String pwd;
	
	/**
	 * Adresse de base de données (adresse)
	 */	
	private String adresse;

	/**
	 * Driver à charger en memoire (driver)
	 */	
	private String driver;

	/**
	 * Declaration de la variable de type Connection (con)
	 */	
	private Connection con;

	/**
	 * Declaration de la variable de type Statement (stmt)
	 */	
	private Statement stmt;	

	public AccesBDD(){}
	
	public AccesBDD(String user, String pwd, String adresse){
		this.user = user;
		this.pwd = pwd;
		this.adresse = adresse;
	}
		public Connection connecte(){
			try {
				Class.forName(this.driver);
				this.con = DriverManager.getConnection(this.adresse,this.user,this.pwd);
				this.stmt = this.con.createStatement();
			} catch (ClassNotFoundException e) {
				this.con = null;
			}
			catch (SQLException e){
				System.out.println("probleme de connexion");
				this.con = null;
			}
			return this.con;
		}
		public void deconnecte(){
			if (this.con != null){
			try {
				this.con.close();
			} catch (SQLException e) {}
			}
		}
}
