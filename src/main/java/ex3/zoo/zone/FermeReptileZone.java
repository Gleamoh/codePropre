package ex3.zoo.zone;

import ex3.zoo.animal.IAnimal;
import ex3.zoo.animal.Reptile;

/**
 * @author Kevin M.
 *
 */
public class FermeReptileZone extends Zone {

	/**
	 * KILO_NOURRITURE_PAR_JOUR : double
	 */
	private static final double KILO_NOURRITURE_PAR_JOUR = 10;
	/**
	 * LABEL : String
	 */
	private static final String LABEL = "Ferme à Reptile";

	/** Constructor
	 * 
	 */
	public FermeReptileZone() {
		super(LABEL, KILO_NOURRITURE_PAR_JOUR);
	}

	/* (non-Javadoc)
	 * @see ex3.zoo.zone.Zone#addAnimal(ex3.zoo.animal.IAnimal)
	 */
	@Override
	public boolean addAnimal(IAnimal animal) {
		if (animal instanceof Reptile) {
			animauxList.add((Reptile) animal);
			return true;
		}
		return false;
	}
}
