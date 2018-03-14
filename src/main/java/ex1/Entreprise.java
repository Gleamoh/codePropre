package ex1;

import java.util.Date;

public class Entreprise {
	
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * siret : int
	 */
	private int siret;

	/**
	 * nom : String
	 */
	private String nom;

	/**
	 * adresse : String
	 */
	private String adresse;

	/**
	 * dateCreation : Date
	 */
	private Date dateCreation;
	
	
	/**
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * 
	 */
	public void afficherStatut(){
		
	}

	/**
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
}
