package ex2;

public class LivretA extends CompteBancaire {

	public static final double DECOUVERT_MAX = 0;
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param solde
	 *            : double représente le solde du compte
	 * @param decouvert
	 *            : double représente le découvert autorisé
	 * @param tauxRemuneration
	 *            : double représente le taux de rémunération du livret A
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(solde, DECOUVERT_MAX);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {
		solde = solde + solde * tauxRemuneration / 100;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
