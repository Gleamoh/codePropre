package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {
	public static final double DECOUVERT_MAX = 0;

	/** solde : solde du compte */
	protected double solde;

	/**
	 * decouvert : double un découvert est autorisé seulement pour les comptes
	 * courants
	 */
	private double decouvert;

	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (solde - montant > decouvert) {
			solde = solde - montant;
		}
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde
	 *            the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert
	 *            : double the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
